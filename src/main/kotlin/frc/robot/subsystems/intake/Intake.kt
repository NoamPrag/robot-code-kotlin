package frc.robot.subsystems.intake

import frc.robot.subsystems.StatefulRobotComponent
import frc.robot.subsystems.RobotState

object Intake : StatefulRobotComponent<IntakeState>(initialState = Closed) {

    override fun getWantedState(robotState: RobotState): IntakeState = when (robotState) {
        RobotState.INTAKE -> Collecting
        RobotState.FEEDER_INTAKE, RobotState.CLIMB -> Opened
        else -> Closed
    }
}