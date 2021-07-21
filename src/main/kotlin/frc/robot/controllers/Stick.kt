package frc.robot.controllers

import frc.robot.util.Vector

class Stick(private val xAxis: Axis, private val yAxis: Axis) {
    // Negating the y component because its inverted in controllers
    fun get() = Vector(xAxis.get(), -yAxis.get())
}