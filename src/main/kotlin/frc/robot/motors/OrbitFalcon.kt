package frc.robot.motors

import com.ctre.phoenix.motorcontrol.can.TalonFX

class OrbitFalcon(data: MotorData) : OrbitMotor, TalonFX(data.port) {

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