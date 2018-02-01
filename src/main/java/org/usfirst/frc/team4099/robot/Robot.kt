package org.usfirst.frc.team4099.robot

import com.ctre.phoenix.motorcontrol.ControlMode
import com.ctre.phoenix.motorcontrol.FeedbackDevice
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced
import com.ctre.phoenix.motorcontrol.can.TalonSRX
import edu.wpi.first.wpilibj.CameraServer
import edu.wpi.first.wpilibj.IterativeRobot
import edu.wpi.first.wpilibj.Joystick


class Robot : IterativeRobot() {

    private val leftMasterSRX: TalonSRX = TalonSRX(8)
    private val rightMasterSRX: TalonSRX = TalonSRX(1)
    private val joystick = Joystick(0)
    private var direction = -1

    init {
        println("Working")

    }










    override fun teleopInit() {


    }




    override fun teleopPeriodic() {
        if (joystick.getRawButton(2)) {
            direction = 1
        }
        else {
            direction = -1
        }

        leftMasterSRX.set(ControlMode.PercentOutput, 0.7 * direction)
        rightMasterSRX.set(ControlMode.PercentOutput, 0.7 * direction)
    }

    override fun testInit() {


    }

    override fun testPeriodic() {


    }

    override fun autonomousPeriodic() {
        leftMasterSRX.set(ControlMode.PercentOutput, 0.3)
        rightMasterSRX.set(ControlMode.PercentOutput, 0.3)
    }


}
