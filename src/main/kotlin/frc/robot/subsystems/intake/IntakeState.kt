package frc.robot.subsystems.intake

import edu.wpi.first.wpilibj.DoubleSolenoid.Value
import edu.wpi.first.wpilibj.Timer
import frc.robot.motors.MotorControlMode
import frc.robot.subsystems.State

sealed class IntakeState : State {
    abstract fun getMotorOutput(): Float
    abstract fun getPistonValue(): Value

    final override fun execute() {
        motor.setOutput(MotorControlMode.PERCENT_OUTPUT, getMotorOutput())
        piston.set(getPistonValue())
    }
}

object Closed : IntakeState() {
    override fun getMotorOutput(): Float = 0f
    override fun getPistonValue(): Value = Value.kReverse
}

object Opened : IntakeState() {
    override fun getMotorOutput(): Float = 0f
    override fun getPistonValue(): Value = Value.kForward
}

object Collecting : IntakeState() {
    override fun getPistonValue(): Value = Value.kForward

    private val timer = Timer()

    var startCollectingTime = 0f

    override fun init() {
        startCollectingTime = timer.get().toFloat()
    }

    // TODO: calculate wheels speed according to robot's velocity
    override fun getMotorOutput(): Float =
        if (timer.get() - startCollectingTime <= timeToStartWheels) 0f else defaultSpeed
}