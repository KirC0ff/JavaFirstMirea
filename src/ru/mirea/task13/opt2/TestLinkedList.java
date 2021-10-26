package ru.mirea.task13.opt2;

import java.util.LinkedList;
import java.util.Scanner;

public class TestLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Список:");
        LinkedList<Integer> link = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            link.addFirst(i);
        }
        System.out.println(link);

        System.out.println("\nСписок, с удаленной половиной элементов");
        for (int i = (link.size()/2)-4; i < link.size(); i++) {
            link.removeLast();
        }
        System.out.println(link);

        System.out.println("\nВведите число: ");
        int x = sc.nextInt();
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