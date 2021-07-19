package frc.robot.subsystems.conveyor

import frc.robot.motors.MotorData
import frc.robot.motors.OrbitMotorFactory


// TODO: get real values
internal val motor = OrbitMotorFactory.falcon(
    MotorData(
        port = 0,
        invertMotor = false,
        invertSensor = false,
        motorPerPhysicalUnitsRatio = 1f
    )
)

internal const val defaultSpeed = 0f