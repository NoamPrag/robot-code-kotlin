package frc.robot.controllers

import edu.wpi.first.wpilibj.Joystick

class Axis(private val joystick: Joystick, private val index: Int) {
    fun get() = joystick.getRawAxis(index).toFloat()
}