package org.firstinspires.ftc.teamcode.kotlin

import dev.nextftc.robot.Mechanism
import dev.nextftc.robot.NextRobot
import org.firstinspires.ftc.teamcode.kotlin.mechanisms.Chassis

class Robot: NextRobot {
    val chassis = Chassis()

    override val mechanisms = setOf(chassis)

}