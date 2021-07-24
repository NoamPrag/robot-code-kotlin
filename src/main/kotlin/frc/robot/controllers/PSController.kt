package frc.robot.controllers

import edu.wpi.first.wpilibj.Joystick


data class PSController(private val port: Int) {
    private val joystick: Joystick = Joystick(port)

    val squareButton = Button(joystick, 1)
    val xButton = Button(joystick, 2)
    val circleButton = Button(joystick, 3)
    val triangleButton = Button(joystick, 4)

    val l1Button = Button(joystick, 5)
    val r1Button = Button(joystick, 6)

    val l2Button = Button(joystick, 7)
    val r2Button = Button(joystick, 8)

    val l3Button = Button(joystick, 11)
    val r3Button = Button(joystick, 12)

    val shareButton = Button(joystick, 9)
    val optionsButton = Button(joystick, 10)
    val psButton = Button(joystick, 13)
    val touchPadButton = Button(joystick, 14)


    val leftStick = Stick(
        xAxis = Axis(joystick, 0),
        yAxis = Axis(joystick, 1),
    )
    val rightStick = Stick(
        xAxis = Axis(joystick, 2),
        yAxis = Axis(joystick, 5),
    )

    val leftTrigger = Axis(joystick, 3)
    val rightTrigger = Axis(joystick, 4)


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