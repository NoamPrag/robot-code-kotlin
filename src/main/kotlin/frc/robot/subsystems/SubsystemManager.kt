package frc.robot.subsystems

class SubsystemManager {
    private val subsystems: Collection<StatefulRobotComponent<*>> = mutableListOf()

    fun addSubsystem(subsystem: StatefulRobotComponent<*>) {
        subsystems + subsystem
    }

    fun notifySubsystems(robotState: RobotState) = subsystems.forEach { it.periodic(robotState) }

    fun reset() = subsystems.forEach { it.reset() }
}