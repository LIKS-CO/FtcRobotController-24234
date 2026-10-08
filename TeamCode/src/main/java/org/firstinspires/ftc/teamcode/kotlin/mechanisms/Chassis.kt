package org.firstinspires.ftc.teamcode.kotlin.mechanisms

import dev.nextftc.hardware.actuators.NextMotor
import dev.nextftc.robot.Mechanism
import dev.nextftc.robot.triggers.CommandGamepad

class Chassis: Mechanism {
    val lf = NextMotor("LF")
    val lb = NextMotor("LB")
    val rf = NextMotor("RF")
    val rb = NextMotor("RB")


    fun manejar(gp: CommandGamepad) = infinite {
        var x = gp.rightStickX.value
        var y = gp.rightStickY.value
        var z = gp.leftStickX.value

        var lfPower = x + y +z
        var rfPower = x - y - z
        var lbPower = x - y + z
        var rbPower = x + y - z

        lf.throttle = lfPower
        rf.throttle = rfPower
        lb.throttle = lbPower
        rb.throttle = rbPower

    }
    fun parar()= instant {
        lf.throttle = 0.0
        lb.throttle = 0.0
        rf.throttle = 0.0
        rb.throttle = 0.0
    }
}