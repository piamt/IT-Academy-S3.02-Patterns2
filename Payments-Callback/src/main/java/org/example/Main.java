package org.example;

import org.example.paymentMethods.BankAccount;
import org.example.paymentMethods.CreditCard;
import org.example.paymentMethods.Paypal;

public class Main {
    public static void main(String[] args) {

        ShoeStore shoeStore = new ShoeStore();
        PaymentsManager paymentsManager = new PaymentsManager(shoeStore);

        PaymentMethod creditCard = new CreditCard();
        PaymentMethod bankAccount = new BankAccount();
        PaymentMethod paypal = new Paypal();

        paymentsManager.pay(creditCard);
        System.out.println();
        paymentsManager.pay(bankAccount);
        System.out.println();
        paymentsManager.pay(paypal);
    }
}