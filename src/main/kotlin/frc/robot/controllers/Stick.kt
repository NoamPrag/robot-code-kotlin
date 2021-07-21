package frc.robot.controllers

import frc.robot.util.Vector

class Stick(private val xAxis: Axis, private val yAxis: Axis) {
    // Negating the y component because its inverted in controllers
    fun get() = Vector(xAxis.get(), -yAxis.get())

    private val listeners: Collection<(Vector) -> Unit> = ArrayList()

    fun addListener(listener: (Vector) -> Unit) {
        listeners + listener
    }

    fun listen() = listeners.forEach { it(get()) }
}