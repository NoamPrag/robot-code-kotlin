package frc.robot.subsystems

interface State {
    fun init() {}
    fun execute()
    fun finish() {}
}