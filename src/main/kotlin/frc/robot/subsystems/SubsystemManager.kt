package frc.robot.subsystems

class SubsystemManager {
    private val listeners: Collection<Subsystem> = ArrayList()

    fun addSubsystem(listener: Subsystem) {
        listeners + listener
    }

    private fun notifySubsystems(state: RobotState) = listeners.forEach { it.notifyRobotState(state) }


    // TODO: implement function
    private fun processState(state: RobotState): RobotState = when (state) {
        RobotState.TRAVEL -> RobotState.TRAVEL
        else -> RobotState.TRAVEL
    }


    fun updateState(newState: RobotState) {
        val processedState = processState(newState)
        notifySubsystems(processedState)
    }

    fun reset() = listeners.forEach { it.reset() }
}