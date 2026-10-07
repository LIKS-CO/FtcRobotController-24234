package org.firstinspires.ftc.teamcode.kotlin.mechanisms

import dev.nextftc.hardware.actuators.NextMotor
import dev.nextftc.robot.Mechanism

class Chassis: Mechanism {
    val lf = NextMotor("LF").apply { direction = NextMotor.Direction.REVERSE}
    val lb = NextMotor("LB")
    val rf = NextMotor("RF").apply { direction = NextMotor.Direction.REVERSE}
    val rb = NextMotor("RB")

    fun mover(power: Double) {
        lf.throttle = power
        lb.throttle = power
        rf.throttle = power
        rb.throttle = power
    }
    fun parar()= instant {
        lf.throttle = 0.0
        lb.throttle = 0.0
        rf.throttle = 0.0
        rb.throttle = 0.0
    }
}