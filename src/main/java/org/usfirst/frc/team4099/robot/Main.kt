package org.usfirst.frc.team4099.robot

import edu.wpi.first.wpilibj.RobotBase
import org.usfirst.frc.team4099.robot.Robot
import java.util.function.Supplier

public class Main {

    /**
     * Main initialization function. Do not perform any initialization here.
     *
     * <p>If you change your main robot class, change the parameter type.
     */
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            RobotBase.startRobot(Supplier<Robot> { Robot() })
        }
    }
}