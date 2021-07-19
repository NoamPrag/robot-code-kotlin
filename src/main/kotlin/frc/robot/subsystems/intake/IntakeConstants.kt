package frc.robot.subsystems.intake

import edu.wpi.first.wpilibj.DoubleSolenoid
import frc.robot.motors.MotorData
import frc.robot.motors.OrbitMotorFactory

internal const val defaultSpeed: Float = 1f

internal val motor = OrbitMotorFactory.falcon(
    MotorData(
        port = 1,
        invertMotor = false,
        invertSensor = false,
        motorPerPhysicalUnitsRatio = 1f,
    )
)


// TODO: check real values
private const val pistonForwardChannel: Int = 0
private const val pistonReverseChannel: Int = 1
internal val piston = DoubleSolenoid(pistonForwardChannel, pistonReverseChannel)