package frc.robot.subsystems.intake

import frc.robot.subsystems.RobotState
import frc.robot.subsystems.Subsystem

import edu.wpi.first.wpilibj.DoubleSolenoid.Value
import frc.robot.motors.MotorControlMode

object Intake : Subsystem {

    override fun notifyRobotState(state: RobotState) {
        val processedState = processState(state)

        val motorVelocity = getMotorVel(processedState)

        val pistonMode = getPistonMode(processedState)

        motor.setOutput(MotorControlMode.PERCENT_OUTPUT, motorVelocity)
        piston.set(pistonMode)
    }

    // TODO: implement
    private fun processState(state: RobotState): IntakeState = IntakeState.CLOSED

    // TODO: implement
    private fun getMotorVel(state: IntakeState): Float = defaultSpeed

    // TODO: implement
    private fun getPistonMode(state: IntakeState): Value = Value.kOff

    override fun reset() {
        TODO("Not yet implemented")
    }
}