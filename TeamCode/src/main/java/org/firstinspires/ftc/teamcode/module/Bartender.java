package org.firstinspires.ftc.teamcode.module;

import org.firstinspires.ftc.teamcode.drink.*;

import java.util.ArrayList;
import java.util.Hashtable;
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
    
    public Hashtable<String, Object> getDrinkOutput() {
    
        Hashtable<String, Object> output = new Hashtable<String, Object>();
        
        for (int i = 0; i < drinks.size(); i++) {
        
            output = drinks.get(i).Pipe(output);
        
        }
    
        return output;
        
    }

}
