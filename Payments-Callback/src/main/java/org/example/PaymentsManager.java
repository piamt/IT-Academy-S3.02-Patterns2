package org.example;

import org.example.exceptions.PaymentIncomplete;

public class PaymentsManager {

    private PaymentCallback callback;

    public PaymentsManager(PaymentCallback callback) {
        this.callback = callback;
    }

    public void pay(PaymentMethod method) {

        System.out.println("Starting payment with method: " + method.display());

        // Simulate payment gateway
        try {
            method.pay();
        } catch (PaymentIncomplete e) {
            System.out.println(e.getMessage());
            callback.onPaymentComplete(false);
            return;
        }
        callback.onPaymentComplete(true);
    }
}
