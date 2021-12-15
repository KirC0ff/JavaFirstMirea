package ru.mirea.task26.AltTask;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Payment {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 999999);
        priceOnProducts.put(2, 9999);
        priceOnProducts.put(3, 999);
        priceOnProducts.put(4, 1299);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (!order.isClosed()) {
            int cost;
            System.out.print("GUITARMASTER.RU");
            System.out.print("Предлагаемые товары:\n" +
                    "1. Gibson Les Paul Custom R8 - $999999\n" +
                    "2. Gibson Les Paul Standard 1980 - $9999\n" +
                    "3. Gibson SG Studio 2021 - $999\n" +
                    "4. Fender American Standard Stratocaster 2021 - $1299\n");
            int choice = sc.nextInt();
            cost = priceOnProducts.get(choice);
            System.out.print("Введите количество: ");
            int count = sc.nextInt();
            order.setTotalCost(cost * count);

            if (strategy == null) {
                System.out.println("Выберите способ оплаты\n" +
                        "1. Электронный кошелек\n" +
                        "2. Банковская карта");
                int paymentMethod = sc.nextInt();

                if (paymentMethod == 1) {
                    strategy = new PayByWallet();
                } else {
                    strategy = new PayByCard();
                }
            }

            order.processOrder(strategy);
            if (strategy.pay(order.getTotalCost())) {
                System.out.println("Оплата успешно произведена!");
            } else {
                System.out.println("Ошибка!");
            }
            order.setClosed();
        }
    }
}
