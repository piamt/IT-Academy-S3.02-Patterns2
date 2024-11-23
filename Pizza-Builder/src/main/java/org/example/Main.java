package org.example;

public class Main {
    public static void main(String[] args) {

        ThickMediumHawaianBuilder hawaianBuilder = new ThickMediumHawaianBuilder();
        ThinFamiliarMargheritaBuilder margheritaBuilder = new ThinFamiliarMargheritaBuilder();
        PizzaMaster master = new PizzaMaster();

        PizzaBuilder[] builders = new PizzaBuilder[]{hawaianBuilder, margheritaBuilder};

        for (PizzaBuilder builder: builders) {
            master.setBuilder(builder);
            master.buildPizza();
            Pizza pizza = master.getPizza();
            System.out.println(pizza);
        }
    }
}