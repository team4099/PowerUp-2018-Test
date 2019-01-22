package org.usfirst.frc.team4099.robot

//import com.ctre.phoenix.motorcontrol.ControlMode
//import com.ctre.phoenix.motorcontrol.FeedbackDevice
//import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced
//import com.ctre.phoenix.motorcontrol.can.TalonSRX
import edu.wpi.first.wpilibj.CameraServer
import edu.wpi.first.wpilibj.DoubleSolenoid
import edu.wpi.first.wpilibj.IterativeRobot
import edu.wpi.first.wpilibj.Joystick
import java.util.concurrent.TimeUnit
import edu.wpi.first.wpilibj.RobotBase

public fun main(args: Array<String>){
    println("Main")
}

class Robot : IterativeRobot() {

    private val pneumaticPiston1: DoubleSolenoid = DoubleSolenoid(1, 0)
    private val pneumaticPiston2: DoubleSolenoid = DoubleSolenoid(2, 3)

    init {
        while (true){
            println("Working")
        }
    }

    override fun disabledInit() {
        println("Disabled")
    }

    override fun robotInit(){

    }







    override fun teleopInit() {



    }




    override fun teleopPeriodic() {

        /*
        pneumaticPiston1.set(DoubleSolenoid.Value.kForward)
        pneumaticPiston2.set(DoubleSolenoid.Value.kForward)
        TimeUnit.SECONDS.sleep(5)
        pneumaticPiston1.set(DoubleSolenoid.Value.kReverse)
        pneumaticPiston2.set(DoubleSolenoid.Value.kReverse)
        TimeUnit.SECONDS.sleep(5)
*/
    }

    override fun testInit() {


    }

    override fun testPeriodic() {


    }

    override fun autonomousPeriodic() {
       //leftMasterSRX.set(ControlMode.PercentOutput, 0.3)
        //rightMasterSRX.set(ControlMode.PercentOutput, 0.3)
    }
}
