package org.firstinspires.ftc.teamcode.module;

import com.qualcomm.robotcore.hardware.Gamepad;

import java.util.Dictionary;

public class Input {

    public static Input Singleton;

    public InputConfig config;

    public Gamepad gamepad1;
    public Gamepad gamepad2;

    /**
     * Create a new input object.
     * @param _gamepad1 The gamepad that is used by player 1.
     * @param _gamepad2 The gamepad that is used by player 2.
     * @since 1.0
     * **/
    public Input(Gamepad _gamepad1, Gamepad _gamepad2) {

        gamepad1 = _gamepad1;
        gamepad2 = _gamepad2;

    }

    /**
     * Set the current controller configuration.
     * @param _config The new config that will be replacing the old one.
     * @since 1.0
     * **/
    public void setControllerConfig(InputConfig _config) {

        config = _config;

    }

    // Same as the Last Function, Except it is Loaded from a File
    public void setControllerConfigFromFile(InputConfig _config) {



    }

    /**
     * Gets the current value of the specified axis.
     * @param axisName The name of the specified axis. This can be found in the controller config file.
     * @return A floating point value between -1 and 1.
     * @since 1.0
     * **/
    public float getAxis(String axisName) {

        switch (config.axisConfigs.get(axisName)) {

            case 1:
                return gamepad1.left_stick_x;
            case 2:
                return gamepad1.left_stick_y;
            case 3:
                return (gamepad1.dpad_left ? -1f : 0f) + (gamepad1.dpad_right ? 1f : 0f);
            case 4:
                return (gamepad1.dpad_down ? -1f : 0f) + (gamepad1.dpad_up ? 1f : 0f);
            case 5:
                return gamepad1.right_stick_x;
            case 6:
                return gamepad1.right_stick_y;
            case 7:
                return gamepad2.left_stick_x;
            case 8:
                return gamepad2.left_stick_y;
            case 9:
                return (gamepad2.dpad_left ? -1f : 0f) + (gamepad2.dpad_right ? 1f : 0f);
            case 10:
                return (gamepad2.dpad_down ? -1f : 0f) + (gamepad2.dpad_up ? 1f : 0f);
            case 11:
                return gamepad2.right_stick_x;
            case 12:
                return gamepad2.right_stick_y;

        }

        return 0f;

    }

    /**
     * Get the current value of the specified button.
     * @param buttonName The name of the button. It can be found in the controller config file.
     * @return <code>true</code> means that the button is currently being pressed.<br>
     *         <code>false</code> means that the button is not currently being pressed.
     * **/
    public boolean getButton(String buttonName) {

        switch (config.buttonConfigs.get(buttonName)) {

            case 1:
                return gamepad1.back;
            case 2:
                return gamepad1.start;
            case 3:
                return gamepad1.guide || gamepad1.ps;
            case 4:
                return gamepad1.x || gamepad1.square;
            case 5:
                return gamepad1.y || gamepad1.triangle;
            case 6:
                return gamepad1.a || gamepad1.cross;
            case 7:
                return gamepad1.b || gamepad1.circle;
            case 8:
                return gamepad1.right_bumper;
            case 9:
                return gamepad1.left_bumper;
            case 10:
                return gamepad1.right_trigger > 0.3f;
            case 11:
                return gamepad1.left_trigger > 0.3f;
            case 12:
                return gamepad1.left_stick_button;
            case 13:
                return gamepad1.right_stick_button;
            case 14:
                return gamepad1.dpad_left;
            case 15:
                return gamepad1.dpad_right;
            case 16:
                return gamepad1.dpad_up;
            case 17:
                return gamepad1.dpad_down;
            case 18:
                return gamepad2.back;
            case 19:
                return gamepad2.start;
            case 20:
                return gamepad2.guide;
            case 21:
                return gamepad2.x;
            case 22:
                return gamepad2.y;
            case 23:
                return gamepad2.a;
            case 24:
                return gamepad2.b;
            case 25:
                return gamepad2.right_bumper;
            case 26:
                return gamepad2.left_bumper;
            case 27:
                return gamepad2.right_trigger > 0.3f;
            case 28:
                return gamepad2.left_trigger > 0.3f;
            case 29:
                return gamepad2.left_stick_button;
            case 30:
                return gamepad2.right_stick_button;
            case 31:
                return gamepad2.dpad_left;
            case 32:
                return gamepad2.dpad_right;
            case 33:
                return gamepad2.dpad_up;
            case 34:
                return gamepad2.dpad_down;

        }

        return false;

    }

    public class InputConfig {

        public String configName;
        public Dictionary<String, Integer> buttonConfigs;
        public Dictionary<String, Integer> axisConfigs;

        // Button Configs
            // 1 - Back Button
            // 2 - Start Button
            // 2 - Guide Button
            // 4 - X Button
            // 5 - Y Button
            // 6 - A Button
            // 7 - B Button
            // 8 - Right Bumper
            // 9 - Left Bumper
            // 10 - Right Trigger
            // 11 - Left Trigger
            // 12 - Left Stick Button
            // 13 - Right Stick Button
            // 14 - D Pad Left
            // 15 - D Pad Right
            // 16 - D Pad Up
            // 17 - D Pad Down

        // Axis Configs
            // 1 - Topleft Horizontal
            // 2 - Topleft Vertical
            // 3 - Bottomleft Horizontal
            // 4 - Bottomleft Vertical
            // 5 - Bottomright Horizontal
            // 6 - Bottomright Vertical

    }

}
