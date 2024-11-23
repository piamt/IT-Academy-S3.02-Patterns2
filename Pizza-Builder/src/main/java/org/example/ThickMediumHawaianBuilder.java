package org.example;

public class ThickMediumHawaianBuilder implements PizzaBuilder {
    private Pizza pizza;

    public ThickMediumHawaianBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildSize() {
        pizza.setSize(12);
    }

    @Override
    public void buildDough() {
        pizza.setDough("thick");
    }

    @Override
    public void buildToppings() {
        pizza.setToppings(new String[]{"tomato", "mozzarella", "ham", "pineaple"});
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
