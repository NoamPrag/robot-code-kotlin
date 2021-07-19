package frc.robot.subsystems.intake

import frc.robot.subsystems.RobotState
import frc.robot.subsystems.Subsystem

import frc.robot.motors.MotorControlMode

object Intake : Subsystem {

    override fun notifyRobotState(state: RobotState) {
        val processedState = processState(state)

        val motorVelocity = processedState.getMotorOutput()

        val pistonMode = processedState.getPistonValue()

        motor.setOutput(MotorControlMode.PERCENT_OUTPUT, motorVelocity)
        piston.set(pistonMode)
    }

    private fun processState(state: RobotState): IntakeState = when (state) {
        RobotState.INTAKE -> Collecting
        RobotState.FEEDER_INTAKE, RobotState.CLIMB -> Opened
        else -> Closed
    }

    override fun reset() {
        TODO("Not yet implemented")
    }
}