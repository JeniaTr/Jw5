package com.company;

import java.util.Observable;
import java.util.Observer;

public class A implements Observer {
    @Override
    public void update(Observable obs, Object arg) {
        int amount = ((Amount) obs).getAmount();
        System.out.println("Class A amount = " + amount);
    }
}
