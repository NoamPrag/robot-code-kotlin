package frc.robot.util

fun pointAndSlopeLinear(point: Vector, slope: Float): Function = { slope * (it - point.x) + point.y }

fun twoPointLinear(p1: Vector, p2: Vector): Function =
    pointAndSlopeLinear(point = p1, slope = (p2.y - p1.y) / (p2.x - p1.x))

fun deadband(p0: Vector, p1: Vector): Function {
    val line: Function = twoPointLinear(p0, p1)

    return lowerLimitY(0f, upperLimitY(1f, line))
}