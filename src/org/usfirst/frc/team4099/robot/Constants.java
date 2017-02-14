package org.usfirst.frc.team4099.robot;

public class Constants {

    public class Gains {

    }

    public class Drive {
        public static final int LEFT_FRONT_ID = 2;
        public static final int RIGHT_FRONT_ID = 0;
        public static final int LEFT_BACK_ID = 3;
        public static final int RIGHT_BACK_ID = 1;
    }

    public class Joysticks {
        public static final int DRIVER_PORT = 0;
        public static final int SHOTGUN_PORT = 1;
    }

    public class Loopers {
        public static final double LOOPER_DT = 0.005; // 200 Hz
    }

    public class Climber {
        public static final int CLIMBER_TALON_ID = 5;
    }

    public class Intake {
        public static final int UP_DOWN_SOLENOID_FORWARD = 2;
        public static final int UP_DOWN_SOLENOID_REVERSE = 3;
        public static final int GRAB_SOLENOID_FORWARD = 0;
        public static final int GRAB_SOLENOID_REVERSE = 1;
    }

}
