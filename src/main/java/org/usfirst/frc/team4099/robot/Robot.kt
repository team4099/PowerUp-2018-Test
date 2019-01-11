package org.usfirst.frc.team4099.robot

/*import com.ctre.phoenix.motorcontrol.ControlMode
import com.ctre.phoenix.motorcontrol.FeedbackDevice
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced
import com.ctre.phoenix.motorcontrol.can.TalonSRX*/
import edu.wpi.first.wpilibj.CameraServer
import edu.wpi.first.wpilibj.DoubleSolenoid
import edu.wpi.first.wpilibj.IterativeRobot
import edu.wpi.first.wpilibj.Joystick
import java.util.concurrent.TimeUnit


class Robot : IterativeRobot() {

    private val pneumaticPiston: DoubleSolenoid = DoubleSolenoid(1, 0)

    init {
        println("Working")

    }










    override fun teleopInit() {



    }




    override fun teleopPeriodic() {

        pneumaticPiston.set(DoubleSolenoid.Value.kForward)
        TimeUnit.SECONDS.sleep(5)
        pneumaticPiston.set(DoubleSolenoid.Value.kReverse)
        TimeUnit.SECONDS.sleep(5)

    }

    override fun testInit() {


    }

    override fun testPeriodic() {


    }

    override fun autonomousPeriodic() {
       // leftMasterSRX.set(ControlMode.PercentOutput, 0.3)
        //rightMasterSRX.set(ControlMode.PercentOutput, 0.3)
    }


}
