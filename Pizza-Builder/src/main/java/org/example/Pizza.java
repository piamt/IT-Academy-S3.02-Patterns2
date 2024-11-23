package org.example;

import java.util.Arrays;

public class Pizza {

    private int size;
    private String dough;
    private String[] toppings;

    public void setSize(int size) {
        this.size = size;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", dough='" + dough + '\'' +
                ", toppings=" + Arrays.toString(toppings) +
                '}';
    }
}
