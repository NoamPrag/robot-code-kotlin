package frc.robot.motors

data class MotorData(
    val port: Int,
    val invertMotor: Boolean,
    val invertSensor: Boolean,
    val motorPerPhysicalUnitsRatio: Float,
)
