package com;

public abstract class Chicken {

    public String getType() {
        return getClass().getSimpleName();
    }

    public abstract double getPrice();
}
