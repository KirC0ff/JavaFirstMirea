package ru.mirea.task13.opt2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class TestLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = -1, j = 0;

        System.out.println("Список:");
        LinkedList<Integer> link = new LinkedList<Integer>();
        while (x != 0) {
            x = sc.nextInt();
            link.addLast(x);
            j++;
        }
        System.out.println(link);

        System.out.println("\nСписок, с удаленной половиной элементов");
        int size = link.size();
        for (int i = 0; i < size/2; i++) {
            link.removeLast();
        }
        System.out.println(link);

        System.out.println("\nВведите число: ");
        x = sc.nextInt();
        if(link.contains(x)){
            System.out.println("Число найдено");
        }
        else System.out.println("Число не найдено");

        System.out.println("\nПервый элемент: "+link.getFirst());
        System.out.println("Последний элемент: "+link.getLast());

        System.out.println("\nОчищенный список:");
        link.clear();
        System.out.println(link);
    }
}