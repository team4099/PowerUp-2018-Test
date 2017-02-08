package org.usfirst.frc.team4099.robot;

import org.usfirst.frc.team4099.lib.joystick.LogitechF310Gamepad;

public class ControlBoard {
    private static ControlBoard sInstance = new ControlBoard();

    public static ControlBoard getInstance() {
        return sInstance;
    }

    private final LogitechF310Gamepad driver;

    private ControlBoard() {
        driver = new LogitechF310Gamepad(Constants.Joysticks.DRIVER_PORT);
    }

    public double getThrottle() {
        return driver.getLeftYAxis();
    }

    public double getTurn() {
        return driver.getRightXAxis();
    }

    /**
     * Should the bot drive in quick turn mode?
     * @return  true/false, depending on if the joystick is depressed
     */
    public boolean getQuickTurn() {
        return driver.getRightJoystickButton();
    }

    public boolean getToggleIntakeUp() {
        return driver.getAButton();
    }

    public boolean getToggleIntakeGrab() {
        return driver.getBButton();
    }
}
