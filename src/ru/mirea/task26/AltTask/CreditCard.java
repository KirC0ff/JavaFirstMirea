package ru.mirea.task26.AltTask;

public class CreditCard {
    private int amount;
    private String number;
    private String cvv;
    private String owner;
    private String date;

    CreditCard(String number, String cvv, String date, String owner) {
        this.amount = 0;
        this.number = number;
        this.cvv = cvv;
        this.date = date;
        this.owner = owner;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}