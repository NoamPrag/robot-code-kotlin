package frc.robot.subsystems.conveyor

interface ConveyorState {
    fun getMotorVelocity(): Float
}

object Static : ConveyorState {
    override fun getMotorVelocity() = 0f
}

object Serialize : ConveyorState {
    // TODO: implement
    override fun getMotorVelocity() = defaultSpeed
}

object Shoot : ConveyorState {
    // TODO: implement
    override fun getMotorVelocity() = defaultSpeed
}

object Climb : ConveyorState {
    // TODO: implement
    override fun getMotorVelocity() = defaultSpeed
}
