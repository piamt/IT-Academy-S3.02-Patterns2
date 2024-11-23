package org.example.exceptions;

public class PaymentIncomplete extends Exception {
    public PaymentIncomplete(String errorMessage) { super(errorMessage); }
}
