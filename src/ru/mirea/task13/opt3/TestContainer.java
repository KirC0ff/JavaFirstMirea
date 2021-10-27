package ru.mirea.task13.opt3;

import java.util.Scanner;

public class TestContainer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = -1, j = 0;

        System.out.println("Список:");
        Container<Integer> arr = new Container<>();
        while (x != 0) {
            x = sc.nextInt();
            arr.add(x);
            j++;
        }
        System.out.println(arr);

        System.out.println("\nСписок без элементов, больших чем 5:");
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 5) {
                arr.remove(i);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 5) {
                arr.remove(i);
            }
        }
        System.out.println(arr);

        System.out.println("\nВведите число: ");
        x = sc.nextInt();
        if(arr.contains(x)){
            System.out.println("Число найдено");
        }
        else System.out.println("Число не найдено");

        System.out.println("\nОчищенный список:");
        arr.clear();
        System.out.println(arr);
    }
}