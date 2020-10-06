package org.firstinspires.ftc.teamcode.module;

import org.firstinspires.ftc.teamcode.drink.*;

import java.util.ArrayList;
import java.util.List;

public class Bartender {

    public static Bartender Singleton;

    private List<DrinkObject> drinks;

    public Bartender() {

        drinks = new ArrayList<DrinkObject>();

    }

    public void addDrink(DrinkObject drink) {

        drinks.add(drink);

    }

}
