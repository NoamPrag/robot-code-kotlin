package frc.robot.subsystems.intake

import edu.wpi.first.wpilibj.DoubleSolenoid
import frc.robot.motors.MotorData
import frc.robot.motors.OrbitMotorFactory

internal const val defaultSpeed: Float = 1f

internal val motor = OrbitMotorFactory.falcon(
    MotorData(
        port = TODO("Get real value"),
        invertMotor = false,
        invertSensor = false,
        motorPerPhysicalUnitsRatio = 1f,
    )
)

internal val piston = DoubleSolenoid(TODO("Get real value"), TODO("Get real value"))

internal const val timeToStartWheels: Float = 0.4f
