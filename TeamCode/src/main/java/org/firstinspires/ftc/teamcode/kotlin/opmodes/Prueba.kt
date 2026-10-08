package org.firstinspires.ftc.teamcode.kotlin.opmodes

import android.R
import dev.nextftc.robot.Telemetry
import dev.nextftc.robot.opmode.NextOpMode
import dev.nextftc.robot.opmode.NextTeleop
import dev.nextftc.robot.triggers.CommandGamepad
import org.firstinspires.ftc.teamcode.kotlin.Robot

@NextTeleop(name = "Prueba")
class Prueba(val robot: Robot): NextOpMode(robot) {
    val gp = CommandGamepad(gamepad1)
    override fun start() {
        robot.chassis.manejar(gp).schedule()
    }

    override fun end() {
        robot.chassis.parar()
    }
}