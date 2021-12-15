package ru.mirea.task26.AltTask;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
