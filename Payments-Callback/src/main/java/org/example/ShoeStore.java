package org.example;

public class ShoeStore implements PaymentCallback {

    @Override
    public void onPaymentComplete(boolean successful) {
        System.out.println("Payment completed " + (successful ? "successfully" : "with errors"));
    }
}
