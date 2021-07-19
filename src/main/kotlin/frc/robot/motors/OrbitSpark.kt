package frc.robot.motors

import com.revrobotics.CANSparkMax

class OrbitSpark(data: MotorData) : OrbitMotor, CANSparkMax(data.port, MotorType.kBrushless) {

    private val motorPerPhysicalUnitsRatio = data.motorPerPhysicalUnitsRatio

    init {
        invertMotor(data.invertMotor)
        invertSensor(data.invertSensor)
    }

    override fun invertMotor(invert: Boolean) {
        TODO("Not yet implemented")
    }

    override fun invertSensor(invert: Boolean) {
        TODO("Not yet implemented")
    }


    override fun setOutput(controlMode: MotorControlMode, value: Float) {
        TODO("Not yet implemented")
    }
}