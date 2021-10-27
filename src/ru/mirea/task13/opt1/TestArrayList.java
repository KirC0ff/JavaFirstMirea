package ru.mirea.task13.opt1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = -1, j = 0;

        System.out.println("Список:");
        ArrayList<Integer> arr = new ArrayList<Integer>();
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