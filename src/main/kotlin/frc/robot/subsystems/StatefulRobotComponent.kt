package frc.robot.subsystems

abstract class StatefulRobotComponent<S : State>(initialState: S) {
    open fun reset() {}

    abstract fun getWantedState(robotState: RobotState): S

    private var currentState: S = initialState
        set(newState) {
            if (field != newState) {
                field.finish()
                field = newState
                field.init()
            }
        }

    fun periodic(robotState: RobotState) {
        currentState = getWantedState(robotState)
        currentState.execute()
    }
}