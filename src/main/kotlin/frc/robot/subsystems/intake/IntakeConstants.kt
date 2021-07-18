package frc.robot.subsystems.intake

import frc.robot.motors.MotorData
import frc.robot.motors.OrbitMotorFactory

import edu.wpi.first.wpilibj.DoubleSolenoid

const val defaultSpeed: Float = 1f

val motorData = MotorData(1, invertMotor = false, invertSensor = false, motorPerPhysicalUnitsRatio = 1f)
val motor = OrbitMotorFactory.falcon(motorData)



// TODO: check real values
const val pistonForwardChannel: Int = 0
const val pistonReverseChannel: Int = 1
val piston = DoubleSolenoid(pistonForwardChannel, pistonReverseChannel)