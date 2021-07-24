package frc.robot.controllers

import frc.robot.util.Vector

typealias StickListener = (Vector) -> Unit

class Stick(private val xAxis: Axis, private val yAxis: Axis) {
    // Negating the y component because its inverted in controllers
    fun get() = Vector(xAxis.get(), -yAxis.get())

    private val listeners: Collection<StickListener> = mutableListOf()

    fun addListener(listener: StickListener) {
        listeners + listener
    }

    fun listen() = listeners.forEach { it(get()) }
}