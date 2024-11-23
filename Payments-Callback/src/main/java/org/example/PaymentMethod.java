package org.example;

import org.example.exceptions.PaymentIncomplete;

public interface PaymentMethod {
    void pay() throws PaymentIncomplete;
    String display();
}
