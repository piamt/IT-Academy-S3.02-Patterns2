package org.example;

public class Main {
    public static void main(String[] args) {
        // Subject
        Broker broker = new Broker();

        // Observers
        StockAgency agency1 = new StockAgency("New York");
        StockAgency agency2 = new StockAgency("Partner");
        StockAgency agency3 = new StockAgency("Keyboard");

        // Register observers
        broker.registerObserver(agency1);
        broker.registerObserver(agency2);
        broker.registerObserver(agency3);

        // Simulate stock fluctuation
        broker.setNewValue(23.0F);
        broker.setNewValue(10.0F);

        // Remove observer
        broker.removeObserver(agency2);

        // Simulate stock fluctuation
        broker.setNewValue(31.0F);
    }
}