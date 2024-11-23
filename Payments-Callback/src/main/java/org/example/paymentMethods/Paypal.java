package org.example.paymentMethods;

import org.example.PaymentMethod;
import org.example.exceptions.PaymentIncomplete;

public class Paypal implements PaymentMethod {

    @Override
    public void pay() throws PaymentIncomplete {
        try {
            System.out.println("Paying with Paypal.....");
            Thread.sleep(4000); // Simulates a 4-second transaction
        } catch (InterruptedException e) {
            throw new PaymentIncomplete("Paypal payment failed");
        }
    }

    @Override
    public String display() {
        return "Paypal";
    }
}
