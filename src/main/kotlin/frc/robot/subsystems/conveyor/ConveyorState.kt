package frc.robot.subsystems.conveyor

import frc.robot.motors.MotorControlMode
import frc.robot.subsystems.State

sealed class ConveyorState : State {
    abstract fun getMotorVelocity(): Float

    final override fun execute() {
        motor.setOutput(MotorControlMode.VELOCITY, getMotorVelocity())
    }
}

object Static : ConveyorState() {
    override fun getMotorVelocity() = 0f
}

object Serialize : ConveyorState() {
    // TODO: implement
    override fun getMotorVelocity() = defaultSpeed
}

object Shoot : ConveyorState() {
    // TODO: implement
    override fun getMotorVelocity() = defaultSpeed
}

object Climb : ConveyorState() {
    // TODO: implement
    override fun getMotorVelocity() = defaultSpeed
}
