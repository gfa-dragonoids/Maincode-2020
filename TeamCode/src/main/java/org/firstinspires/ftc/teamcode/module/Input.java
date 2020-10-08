package org.firstinspires.ftc.teamcode.module;

import java.util.Dictionary;

public class Input {

    public static Input Singleton;

    public InputConfig config;

    // Input Initializer
    public Input() {



    }

    // Allow Different Button Configs to Be Created
    // This is Good For Drivers Who Have Different
    // Preferences.
    public void setControllerConfig(InputConfig _config) {



    }

    // Same as the Last Function, Except it is Loaded from a File
    public void setControllerConfigFromFile(InputConfig _config) {



    }

    // Get an Input Axis
    public float getAxis(String axisName) {

        return 0f;

    }

    // Get an Input Button
    public boolean getButton(String buttonName) {

        return false;

    }

    public class InputConfig {

        public String configName;
        public Dictionary<String, Integer> buttonConfigs;
        public Dictionary<String, Integer> axisConfigs;

        // Button Configs
            // 1 - Back Button - Controller A
            // 2 - Start Button - Controller A
            // 3 - X Button - Controller A
            // 4 - Y Button - Controller A
            // 5 - A Button - Controller A
            // 6 - B Button - Controller A
            // 7 - Right Bumper - Controller A
            // 8 - Left Bumper - Controller A
            // 9 - Right Trigger - Controller A
            // 10 - Left Trigger - Controller A
            // 11 - Back Button - Controller B
            // 12 - Start Button - Controller B
            // 13 - X Button - Controller B
            // 14 - Y Button - Controller B
            // 15 - A Button - Controller B
            // 16 - B Button - Controller B
            // 17 - Right Bumper - Controller B
            // 18 - Left Bumper - Controller B
            // 19 - Right Trigger - Controller B
            // 20 - Left Trigger - Controller B

        // Axis Configs
            // 1 - Topleft Horizontal - Controller A
            // 2 - Topleft Vertical - Controller A
            // 3 - Bottomleft Horizontal - Controller A
            // 4 - Bottomleft Vertical - Controller A
            // 5 - Bottomright Horizontal - Controller A
            // 6 - Bottomright Vertical - Controller A
            // 7 - Topleft Horizontal - Controller B
            // 8 - Topleft Vertical - Controller B
            // 9 - Bottomleft Horizontal - Controller B
            // 10 - Bottomleft Vertical - Controller B
            // 11 - Bottomright Horizontal - Controller B
            // 12 - Bottomright Vertical - Controller B

    }

}
