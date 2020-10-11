package org.firstinspires.ftc.teamcode.module;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CSV {

    public static List<ArrayList<Object>> ParseText(String text) {

        // Create New Output Object
        List<ArrayList<Object>> output = new ArrayList<ArrayList<Object>>();

        // Split Lines Based on Returns
        String[] lines = text.split("\n");

        // Loop Through Lines Array
        for (int i = 0; i < lines.length; i++) {

            // Create Output For Current Line
            ArrayList<Object> curLine = new ArrayList<Object>();

            // Split Current Line into String Array
            String[] splitLine = lines[i].split(",");

            // Add Line Data To Current Line Output
            for (int n = 0; n < splitLine.length; n++) {

                curLine.add(splitLine[n]);

            }

            // Add Line to Output
            output.add(curLine);

        }

        // Return the Output
        return output;

    }

}