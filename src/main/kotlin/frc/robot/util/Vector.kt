package frc.robot.util

import kotlin.math.*

class Vector(val x: Float, val y: Float) {

    companion object {
        val zero = Vector(0f, 0f)
        val INF = Vector(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY)

        fun unit(angle: Float): Vector = Vector(cos(angle), sin(angle))

        fun polar(angle: Float, norm: Float): Vector = unit(angle) * norm

        fun max(v1: Vector, v2: Vector): Vector = Vector(max(v1.x, v2.x), max(v1.y, v2.y))

        fun min(v1: Vector, v2: Vector): Vector = Vector(min(v1.x, v2.x), min(v1.y, v2.y))

        fun angleDifference(v1: Vector, v2: Vector): Float =
            if (v1.norm == 0f || v2.norm == 0f) 0f
            else acos((v1 dot v2) / (v1.norm * v2.norm))
    }

    val norm: Float by lazy { sqrt(x * x + y * y) }

    val angle: Float by lazy { if (x == 0f && y == 0f) 0f else atan2(y, x) }

    fun rotate(angle: Float): Vector {
        val sinAngle = sin(angle)
        val cosAngle = cos(angle)
        // applying rotation matrix
        return Vector(
            x * cosAngle - y * sinAngle,
            x * sinAngle + y * cosAngle,
        )
    }

    fun rotate90(counterClockwise: Boolean): Vector = if (counterClockwise) Vector(-y, x) else Vector(y, -x)

    fun unit(): Vector = unit(angle)

    infix fun dot(other: Vector): Float = x * other.x + y * other.y

    fun project(angle: Float): Float = this dot unit(angle)

    fun project(other: Vector): Float = if (other.norm != 0f) (this dot other) / other.norm else norm

    operator fun plus(other: Vector): Vector = Vector(x + other.x, y + other.y)

    operator fun minus(other: Vector): Vector = Vector(x - other.x, y - other.y)

    operator fun times(factor: Float): Vector = Vector(x * factor, y * factor)

    operator fun div(factor: Float): Vector = Vector(x / factor, y / factor)

    override operator fun equals(other: Any?): Boolean = other is Vector && x == other.x && y == other.y

    operator fun compareTo(other: Vector): Int = norm.compareTo(other.norm)

    override fun toString(): String = "($x, $y)"
}