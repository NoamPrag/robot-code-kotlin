package frc.robot.controllers

import edu.wpi.first.wpilibj.Joystick

class Axis(private val joystick: Joystick, private val index: Int) {
    fun get() = joystick.getRawAxis(index).toFloat()

    private val listeners: Collection<(Float) -> Unit> = ArrayList()

    fun addListener(listener: (Float) -> Unit) {
        listeners + listener
    }

    fun listen() = listeners.forEach { it(get()) }
}