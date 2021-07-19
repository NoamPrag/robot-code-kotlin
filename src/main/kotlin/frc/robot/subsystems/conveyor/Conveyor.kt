package frc.robot.subsystems.conveyor

import frc.robot.motors.MotorControlMode
import frc.robot.subsystems.RobotState
import frc.robot.subsystems.Subsystem

object Conveyor : Subsystem {
    override fun notifyRobotState(state: RobotState) {
        val processedState = processState(state)

        val motorVelocity = processedState.getMotorVelocity()

        motor.setOutput(MotorControlMode.VELOCITY, motorVelocity)
    }

    private fun processState(state: RobotState): ConveyorState = when (state) {
        RobotState.TRAVEL -> Static
        RobotState.FEEDER_INTAKE, RobotState.INTAKE -> Serialize
        RobotState.CLIMB -> Climb
        RobotState.SHOOT_CLOSE, RobotState.SHOOT_FAR -> Shoot
        else -> Static
    }

    override fun reset() {
        TODO("Not yet implemented")
    }
}