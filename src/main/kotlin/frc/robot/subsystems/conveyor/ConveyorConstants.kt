package frc.robot.subsystems.conveyor

import frc.robot.motors.MotorData
import frc.robot.motors.OrbitMotorFactory


internal val motor = OrbitMotorFactory.falcon(
    MotorData(
        port = TODO("Get real value"),
        invertMotor = false,
        invertSensor = false,
        motorPerPhysicalUnitsRatio = 1f
    )
)

internal const val defaultSpeed = 0f