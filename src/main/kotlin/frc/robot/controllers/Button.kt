package frc.robot.controllers

import edu.wpi.first.wpilibj.Joystick

typealias ButtonListener = () -> Unit

class Button(private val joystick: Joystick, private val index: Int) {
    fun getRaw(): Boolean = joystick.getRawButton(index)
    fun getPressed(): Boolean = joystick.getRawButtonPressed(index)
    fun getReleased(): Boolean = joystick.getRawButtonReleased(index)

    private val pressListeners: Collection<ButtonListener> = ArrayList()
    private val releaseListeners: Collection<ButtonListener> = ArrayList()
    private val rawListeners: Collection<ButtonListener> = ArrayList()

    fun addPressListener(listener: ButtonListener) {
        pressListeners + listener
    }

    fun addReleaseListener(listener: ButtonListener) {
        releaseListeners + listener
    }

    fun addRawListener(listener: ButtonListener) {
        rawListeners + listener
    }

    fun listen() {
        if (getPressed()) pressListeners.forEach { it() }

        if (getReleased()) releaseListeners.forEach { it() }

        if (getRaw()) rawListeners.forEach { it() }
    }
}