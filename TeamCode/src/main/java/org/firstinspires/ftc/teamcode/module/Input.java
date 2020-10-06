package org.firstinspires.ftc.teamcode.module;

public class Input {

    public static Input Singleton;

    // Input Initializer
    public Input() {



    }

    // Allow Different Button Configs to Be Created
    // This is Good For Drivers Who Have Different
    // Preferences.
    public void setControllerConfig() {



    }

    // Get an Input Axis
    public float getAxis(String axisName) {

        return 0f;

    }

    // Get an Input Button
    public boolean getButton(String buttonName) {

        return false;

    }

}
