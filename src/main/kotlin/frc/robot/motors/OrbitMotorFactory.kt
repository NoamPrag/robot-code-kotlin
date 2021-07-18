package frc.robot.motors

object OrbitMotorFactory {
    fun spark(data: MotorData): OrbitMotor {
        return OrbitSpark(data)
    }

    fun talonSRX(data: MotorData): OrbitMotor {
        return OrbitTalon(data)
    }

    fun falcon(data: MotorData): OrbitMotor {
        return OrbitFalcon(data)
    }
}