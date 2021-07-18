package frc.robot

import edu.wpi.first.wpilibj.TimedRobot

import frc.robot.subsystems.SubsystemManager
import frc.robot.subsystems.intake.Intake

class Robot : TimedRobot() {
    private val subsystemManager = SubsystemManager()

    override fun robotInit() {
        subsystemManager.addSubsystem(Intake)

        subsystemManager.reset()

    }

    override fun robotPeriodic() {}

    override fun autonomousInit() {
        subsystemManager.reset()
    }

    override fun autonomousPeriodic() {}

    override fun teleopInit() {
        subsystemManager.reset()
    }

    override fun teleopPeriodic() {}

    override fun disabledInit() {}

    override fun disabledPeriodic() {}

    override fun testInit() {}

    override fun testPeriodic() {}
}
