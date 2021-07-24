package frc.robot.controllers

import edu.wpi.first.wpilibj.Joystick

typealias ButtonListener = () -> Unit

class Button(private val joystick: Joystick, private val index: Int) {

    val raw: Boolean get() = joystick.getRawButton(index)
    val pressed: Boolean get() = joystick.getRawButtonPressed(index)
    val released: Boolean get() = joystick.getRawButtonReleased(index)

    private val rawListeners: Collection<ButtonListener> = mutableListOf()
    private val pressListeners: Collection<ButtonListener> = mutableListOf()
    private val releaseListeners: Collection<ButtonListener> = mutableListOf()

    fun addRawListener(listener: ButtonListener) {
        rawListeners + listener
    }

    fun addPressListener(listener: ButtonListener) {
        pressListeners + listener
    }

    fun addReleaseListener(listener: ButtonListener) {
        releaseListeners + listener
    }

    fun listen() {
        if (raw) rawListeners.forEach { it() }

        if (pressed) pressListeners.forEach { it() }

        if (released) releaseListeners.forEach { it() }
    }
}