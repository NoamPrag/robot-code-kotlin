package frc.robot.controllers

import edu.wpi.first.wpilibj.Joystick
import kotlin.math.abs

typealias AxisListener = (Float) -> Unit

class Axis(private val joystick: Joystick, private val index: Int) {
    var deadband: Float = 0f
    var interpolation: (Float) -> Float = { it }

    fun getRaw(): Float = joystick.getRawAxis(index).toFloat()

    fun get(): Float {
        val rawValue = joystick.getRawAxis(index).toFloat()

        return if (abs(rawValue) >= deadband) interpolation(rawValue) else 0f
    }

    private val listeners: Collection<AxisListener> = ArrayList()

    fun addListener(listener: AxisListener) {
        listeners + listener
    }

    fun listen() = listeners.forEach { it(get()) }
}