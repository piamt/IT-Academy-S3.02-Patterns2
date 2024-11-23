package org.example;

public class ThinFamiliarMargheritaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public ThinFamiliarMargheritaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildSize() {
        pizza.setSize(16);
    }

    @Override
    public void buildDough() {
        pizza.setDough("thin");
    }

    @Override
    public void buildToppings() {
        pizza.setToppings(new String[]{"tomato", "mozzarella", "basil"});
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
