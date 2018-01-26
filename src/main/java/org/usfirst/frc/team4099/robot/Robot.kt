package org.usfirst.frc.team4099.robot

import com.ctre.phoenix.motorcontrol.ControlMode
import com.ctre.phoenix.motorcontrol.FeedbackDevice
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced
import com.ctre.phoenix.motorcontrol.can.TalonSRX
import edu.wpi.first.wpilibj.CameraServer
import edu.wpi.first.wpilibj.IterativeRobot


class Robot : IterativeRobot() {

    private val leftMasterSRX: TalonSRX = TalonSRX(10)
    private val rightMasterSRX: TalonSRX = TalonSRX(4)

    init {
        println("Working")
        leftMasterSRX.set(ControlMode.PercentOutput, 0.3)
        rightMasterSRX.set(ControlMode.PercentOutput, 0.3)

        //leftMasterSRX.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0) //configs sensor to a quad encoder
       // leftMasterSRX.setSensorPhase(false) //to align positive sensor velocity with positive motor output
//        leftMasterSRX.config_kP(0, 0.0115, 0) //sets PIDF values
//        leftMasterSRX.config_kI(0,0.0 , 0)
//        leftMasterSRX.config_kD(0, 0.0, 0)
//        leftMasterSRX.config_kF(0,0.0 , 0)

       // rightMasterSRX.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0) //configs sensor to a quad encoder
        // leftMasterSRX.setSensorPhase(false) //to align positive sensor velocity with positive motor output
//        rightMasterSRX.config_kP(0, 0.0115, 0) //sets PIDF values
//        rightMasterSRX.config_kI(0,0.0 , 0)
//        rightMasterSRX.config_kD(0, 0.0, 0)
//        leftMasterSRX.config_kF(0,0.0 , 0)
    }










    override fun teleopInit() {


    }




    override fun teleopPeriodic() {


    }

    override fun testInit() {


    }

    override fun testPeriodic() {


    }


}
