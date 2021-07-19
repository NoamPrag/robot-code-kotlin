package frc.robot.motors

import com.ctre.phoenix.motorcontrol.can.TalonSRX

class OrbitTalon(data: MotorData) : OrbitMotor, TalonSRX(data.port) {

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