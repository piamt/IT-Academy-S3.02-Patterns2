package org.example;

public class PizzaMaster {

    private PizzaBuilder builder;

    public void setBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }

    public void buildPizza() {
        builder.buildSize();
        builder.buildDough();
        builder.buildToppings();
    }

    public Pizza getPizza() {
        return builder.getPizza();
    }
}
