package frc.robot.motors

interface OrbitMotor {

    fun setOutput(controlMode: MotorControlMode, value: Float)

    fun invertMotor(invert: Boolean)

    fun invertSensor(invert: Boolean)

//    fun config(
//        slot: Int, kP: Double, kI: Double, kD: Double, kF: Double, iZone: Int,
//        nominal: Double, rampRate: Double, peak: Double
//    )
//
//    fun resetIAccum()
//
//    fun getRawPosition(): Int
//
//    fun getRawVelocity(): Int
//
//    fun getPosition(): Float
//
//    fun getVelocity(): Float
//
//    fun getThrottle(): Double
//
//    fun getCurrent(): Double
//
//    fun getClosedLoopError(): Int
//
//    fun getMotionMagicTargetPosition(): Double
//
//    fun getMotionMagicTargetVelocity(): Double
//
//    fun enableCurrentLimit()
//
//    fun setPeriod(dt_MilliSec: Int)
//
//    fun setSlave(masterPort: Int)
//
//    fun setSensorPosition(position: Int)
//
//    fun enableSoftLimit(enable: Boolean)
//
//    fun motionMagicArbitraryF(value: Float, arbitraryFGain: Float)
//
//    fun velocityArbitraryF(value: Float, arbitraryFGain: Float)
}