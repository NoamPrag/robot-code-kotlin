package frc.robot.controllers

import edu.wpi.first.wpilibj.Joystick
import kotlin.math.abs
import kotlin.math.sign

typealias AxisListener = (Float) -> Unit

class Axis(private val joystick: Joystick, private val index: Int) {
    var deadband: (Float) -> Float = { it }
    var interpolation: (Float) -> Float = { it }

    val raw: Float get() = joystick.getRawAxis(index).toFloat()

    fun get(): Float {
        val rawValue: Float = raw
        return interpolation(deadband(abs(rawValue)) * sign(rawValue))
    }

    private val listeners: Collection<AxisListener> = mutableListOf()

    fun addListener(listener: AxisListener) {
        listeners + listener
    }

    fun listen() = listeners.forEach { it(get()) }
}