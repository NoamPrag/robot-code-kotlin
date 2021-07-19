package frc.robot.subsystems.conveyor

import frc.robot.motors.MotorData
import frc.robot.motors.OrbitMotorFactory


// TODO: get real values
private val motorData = MotorData(
    port = 0,
    invertMotor = false,
    invertSensor = false,
    motorPerPhysicalUnitsRatio = 1f
)
internal val motor = OrbitMotorFactory.falcon(motorData)

internal const val defaultSpeed = 0f