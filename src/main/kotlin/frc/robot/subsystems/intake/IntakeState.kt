package frc.robot.subsystems.intake

import edu.wpi.first.wpilibj.DoubleSolenoid.Value

interface IntakeState {
    fun getPistonValue(): Value
    fun getMotorOutput(): Float
}


object Closed : IntakeState {
    override fun getPistonValue(): Value = Value.kReverse
    override fun getMotorOutput(): Float = 0f
}

object Opened : IntakeState {
    override fun getPistonValue(): Value = Value.kForward
    override fun getMotorOutput(): Float = 0f
}

object Collecting : IntakeState by Opened {
    override fun getMotorOutput(): Float = defaultSpeed
}