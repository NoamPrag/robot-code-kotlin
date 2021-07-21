package frc.robot.controllers

import edu.wpi.first.wpilibj.Joystick

class Button(private val joystick: Joystick, private val index: Int) {
    fun getRaw() = joystick.getRawButton(index)
    fun getPressed() = joystick.getRawButtonPressed(index)
    fun getReleased() = joystick.getRawButtonReleased(index)
}