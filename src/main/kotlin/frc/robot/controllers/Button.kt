package frc.robot.controllers

import edu.wpi.first.wpilibj.Joystick

class Button(private val joystick: Joystick, private val index: Int) {
    fun getRaw(): Boolean = joystick.getRawButton(index)
    fun getPressed(): Boolean = joystick.getRawButtonPressed(index)
    fun getReleased(): Boolean = joystick.getRawButtonReleased(index)

    private val pressListeners: Collection<() -> Unit> = ArrayList()
    private val releaseListeners: Collection<() -> Unit> = ArrayList()
    private val rawListeners: Collection<() -> Unit> = ArrayList()

    fun addPressListener(listener: () -> Unit) {
        pressListeners + listener
    }

    fun addReleaseListener(listener: () -> Unit) {
        releaseListeners + listener
    }

    fun addRawListener(listener: () -> Unit) {
        rawListeners + listener
    }

    fun listen() {
        if (getPressed()) pressListeners.forEach { it() }

        if (getReleased()) releaseListeners.forEach { it() }

        if (getRaw()) rawListeners.forEach { it() }
    }
}