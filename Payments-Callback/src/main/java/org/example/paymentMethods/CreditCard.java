package org.example.paymentMethods;

import org.example.PaymentMethod;
import org.example.exceptions.PaymentIncomplete;

public class CreditCard implements PaymentMethod {

    @Override
    public void pay() throws PaymentIncomplete {
        try {
            System.out.println("Paying with card.....");
            Thread.sleep(2000); // Simulates a 2-second transaction
            throw new InterruptedException(); // Simulate it throws an exception
        } catch (InterruptedException e) {
            throw new PaymentIncomplete("Credit card payment failed");
        }
    }

    @Override
    public String display() {
        return "credit card";
    }
}
