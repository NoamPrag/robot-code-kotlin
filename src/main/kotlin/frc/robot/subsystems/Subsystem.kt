package frc.robot.subsystems

interface Subsystem {
    fun notifyRobotState(state: RobotState)

    fun reset()
}