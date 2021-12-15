package ru.mirea.task26.AltTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByWallet implements PayStrategy {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("01234321", "test@mail.ru");
        DATA_BASE.put("qwerty", "test2@gmail.com");
    }


    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.print("Адрес электронной почты: ");
                email = READER.readLine();
                System.out.print("Пароль: ");
                password = READER.readLine();
                if (verify()) {
                    System.out.println("Вход...");
                } else {
                    System.out.println("Неверный адрес электронной почты или пароль");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }


    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("Оплата $" + paymentAmount + " через электронный кошелек...");
            return true;
        } else {
            return false;
        }
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
