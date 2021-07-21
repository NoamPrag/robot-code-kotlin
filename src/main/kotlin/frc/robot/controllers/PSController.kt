package frc.robot.controllers

import edu.wpi.first.wpilibj.Joystick

// Axes indices:
private const val leftStickXIndex = 0
private const val leftStickYIndex = 1
private const val rightStickXIndex = 2
private const val rightStickYIndex = 5

// Triggers indices:
private const val leftTriggerIndex = 3
private const val rightTriggerIndex = 4

// Buttons indices:
private const val squareButtonIndex = 1
private const val xButtonIndex = 2
private const val circleButtonIndex = 3
private const val triangleButtonIndex = 4
private const val l1Index = 5
private const val r1Index = 6
private const val l2Index = 7
private const val r2Index = 8
private const val shareIndex = 9
private const val optionsIndex = 10
private const val l3Index = 11
private const val r3Index = 12
private const val psButtonIndex = 13
private const val touchPadIndex = 14


class PSController(port: Int) {
    private val joystick: Joystick = Joystick(port)

    val squareButton = Button(joystick, squareButtonIndex)
    val xButton = Button(joystick, xButtonIndex)
    val circleButton = Button(joystick, circleButtonIndex)
    val triangleButton = Button(joystick, triangleButtonIndex)

    val l1Button = Button(joystick, l1Index)
    val r1Button = Button(joystick, r1Index)

    val l2Button = Button(joystick, l2Index)
    val r2Button = Button(joystick, r2Index)

    val l3Button = Button(joystick, l3Index)
    val r3Button = Button(joystick, r3Index)

    val shareButton = Button(joystick, shareIndex)
    val optionsButton = Button(joystick, optionsIndex)
    val psButton = Button(joystick, psButtonIndex)
    val touchPadButton = Button(joystick, touchPadIndex)


    val leftStick = Stick(
        xAxis = Axis(joystick, leftStickXIndex),
        yAxis = Axis(joystick, leftStickYIndex),
    )
    val rightStick = Stick(
        xAxis = Axis(joystick, rightStickXIndex),
        yAxis = Axis(joystick, rightStickYIndex),
    )

    val rightTrigger = Axis(joystick, rightTriggerIndex)
    val leftTrigger = Axis(joystick, leftTriggerIndex)


    fun listen() {
        squareButton.listen()
        xButton.listen()
        circleButton.listen()
        triangleButton.listen()

        l1Button.listen()
        r1Button.listen()

        l2Button.listen()
        r2Button.listen()

        l3Button.listen()
        r3Button.listen()

        shareButton.listen()
        optionsButton.listen()
        psButton.listen()
        touchPadButton.listen()

        leftStick.listen()
        rightStick.listen()

        rightTrigger.listen()
        leftTrigger.listen()
    }
}