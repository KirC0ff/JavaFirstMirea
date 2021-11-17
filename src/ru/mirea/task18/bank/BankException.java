package ru.mirea.task18.bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankException {
    Scanner sc = new Scanner(System.in);
    int[] ID = new int[5];

    public void input() {
        int n = 0;
        System.out.println("Введите количество счетов");
        try {
            n = sc.nextInt();
        } catch (InputMismatchException e1) {
            System.out.println("Неверный ввод");
        }
        System.out.println("Введите текущее количество средств на счетах");
        try {
            for (int i = 0; i < n; i++) {
                    System.out.println("Счет ID" + (i + 245739) + ": ");
                    ID[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Невозможно создать счет\n");
        }
    }

    public static void main(String[] args) {
        BankException testBank = new BankException();
        testBank.input();
    }
}
