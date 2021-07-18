package frc.robot.motors

object OrbitMotorFactory {
    fun spark(data: MotorData): OrbitMotor = OrbitSpark(data)

    fun talonSRX(data: MotorData): OrbitMotor = OrbitTalon(data)

    fun falcon(data: MotorData): OrbitMotor = OrbitFalcon(data)
}