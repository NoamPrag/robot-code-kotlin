package frc.robot.subsystems.intake

import frc.robot.motors.MotorData
import frc.robot.motors.OrbitMotorFactory

import edu.wpi.first.wpilibj.DoubleSolenoid

internal const val defaultSpeed: Float = 1f

private val motorData = MotorData(1, invertMotor = false, invertSensor = false, motorPerPhysicalUnitsRatio = 1f)
internal val motor = OrbitMotorFactory.falcon(motorData)



// TODO: check real values
private const val pistonForwardChannel: Int = 0
private const val pistonReverseChannel: Int = 1
internal val piston = DoubleSolenoid(pistonForwardChannel, pistonReverseChannel)