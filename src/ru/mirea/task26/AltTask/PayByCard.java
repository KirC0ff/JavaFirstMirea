package ru.mirea.task26.AltTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCard implements PayStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Номер карты: ");
            String number = READER.readLine();
            System.out.print("CVV/CVC-код: ");
            String cvv = READER.readLine();
            System.out.print("Дата (мм/гг): ");
            String date = READER.readLine();
            System.out.print("Имя владельца: ");
            String owner = READER.readLine();
            card = new CreditCard(number, cvv, owner, date);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Оплата $" + paymentAmount + " кредитной картой...");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}
