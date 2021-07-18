package frc.robot.subsystems

class SubsystemManager {
    private val subsystems: Collection<Subsystem> = ArrayList()

    fun addSubsystem(subsystem: Subsystem) {
        subsystems + subsystem
    }

    private fun notifySubsystems(state: RobotState) = subsystems.forEach { it.notifyRobotState(state) }


    // TODO: implement function
    private fun processState(state: RobotState): RobotState = when (state) {
        RobotState.TRAVEL -> RobotState.TRAVEL
        else -> RobotState.TRAVEL
    }


    fun updateState(newState: RobotState) {
        val processedState = processState(newState)
        notifySubsystems(processedState)
    }

    fun reset() = subsystems.forEach { it.reset() }
}