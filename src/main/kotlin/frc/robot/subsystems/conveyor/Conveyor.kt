package frc.robot.subsystems.conveyor

import frc.robot.subsystems.RobotState
import frc.robot.subsystems.StatefulRobotComponent

object Conveyor : StatefulRobotComponent<ConveyorState>(initialState = Static) {

    override fun getWantedState(robotState: RobotState): ConveyorState = when (robotState) {
        RobotState.CLIMB -> Climb
        RobotState.SHOOT_FAR, RobotState.SHOOT_CLOSE -> Shoot
        RobotState.INTAKE, RobotState.FEEDER_INTAKE -> Serialize
        else -> Static
    }
}