package frc.robot

import edu.wpi.first.wpilibj.TimedRobot
import frc.robot.subsystems.RobotState
import frc.robot.subsystems.SubsystemManager
import frc.robot.subsystems.conveyor.Conveyor
import frc.robot.subsystems.intake.Intake

class Robot : TimedRobot() {
    private val subsystemManager = SubsystemManager()

    override fun robotInit() {
        // Adding subsystems to manager and applying reset
        subsystemManager.addSubsystem(Intake)
        subsystemManager.addSubsystem(Conveyor)

        subsystemManager.reset()
    }

    override fun robotPeriodic() {}

    override fun autonomousInit() {}

    override fun autonomousPeriodic() {}

    override fun teleopInit() {}

    override fun teleopPeriodic() {
        // An example of notifying subsystems
        subsystemManager.notifySubsystems(RobotState.TRAVEL)
    }

    override fun disabledInit() {}

    override fun disabledPeriodic() {}

    override fun testInit() {}

    override fun testPeriodic() {}
}
