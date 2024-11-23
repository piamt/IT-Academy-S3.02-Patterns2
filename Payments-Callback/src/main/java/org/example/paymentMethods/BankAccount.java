package org.example.paymentMethods;

import org.example.PaymentMethod;
import org.example.exceptions.PaymentIncomplete;

public class BankAccount implements PaymentMethod {

    @Override
    public void pay() throws PaymentIncomplete {
        try {
            System.out.println("Paying with Bank account.....");
            Thread.sleep(3000); // Simulates a 3-second transaction
        } catch (InterruptedException e) {
            throw new PaymentIncomplete("Bank account payment failed");
        }
    }

    @Override
    public String display() {
        return "Bank account";
    }
}
