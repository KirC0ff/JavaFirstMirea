package ru.mirea.task13.opt1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Список:");
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        System.out.println(arr);

        System.out.println("\nСписок, с замененными четными элементами на 0:");
        for (int i = 1; i < arr.size(); i++) {
            if (i % 2 == 0) {
                arr.remove(i);
                arr.add(i, 0);
            }
        }
        System.out.println(arr);

        System.out.println("\nСписок без нулей:");
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                arr.remove(i);
        }
        }
        System.out.println(arr);

        System.out.println("\nВведите число: ");
        int x = sc.nextInt();
        if(arr.contains(x)){
            System.out.println("Число найдено");
        }
        else System.out.println("Число не найдено");

        System.out.println("\nОчищенный список:");
        arr.clear();
        System.out.println(arr);
    }
}