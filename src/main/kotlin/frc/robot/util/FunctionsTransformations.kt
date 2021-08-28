package frc.robot.util

import kotlin.math.max
import kotlin.math.min

typealias Function = (Float) -> Float

inline fun compose(
    crossinline f: Function,
    crossinline g: Function
): Function = { g(f(it)) }


inline fun applyX(crossinline transformation: Function, crossinline f: Function): Function = compose(transformation, f)
inline fun applyY(crossinline transformation: Function, crossinline f: Function): Function = compose(f, transformation)

fun translate(translation: Float): Function = { it + translation }

inline fun translateHorizontal(translation: Float, crossinline f: Function): Function =
    applyX(translate(-translation), f)

inline fun translateVertical(translation: Float, crossinline f: Function): Function =
    applyY(translate(translation), f)


fun scale(factor: Float): Function = { factor * it }

inline fun scaleHorizontal(factor: Float, crossinline f: Function): Function = applyX(scale(factor), f)

inline fun scaleVertical(factor: Float, crossinline f: Function): Function = applyY(scale(factor), f)

val reflect: Function = scale(-1f)

inline fun reflectAroundXAxis(crossinline f: Function): Function = applyX(reflect, f)

inline fun reflectAroundYAxis(crossinline f: Function): Function = applyY(reflect, f)


fun lowerLimit(limit: Float): Function = { max(limit, it) }

inline fun lowerLimitX(limit: Float, crossinline f: Function): Function = applyX(lowerLimit(limit), f)
inline fun lowerLimitY(limit: Float, crossinline f: Function): Function = applyY(lowerLimit(limit), f)


fun upperLimit(limit: Float): Function = { min(limit, it) }

inline fun upperLimitX(limit: Float, crossinline f: Function): Function = applyX(upperLimit(limit), f)
inline fun upperLimitY(limit: Float, crossinline f: Function): Function = applyY(upperLimit(limit), f)