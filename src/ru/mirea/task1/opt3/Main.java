package ru.mirea.task1.opt3;

import ru.mirea.task1.opt3.Sum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество элементов массива ");
        Sum s1 = new Sum(sc.nextInt());
        System.out.println("Сумма элементов массива через цикл for: "+s1.sumFor());
        System.out.println("Сумма элементов массива через цикл while: "+s1.sumWhile());
        System.out.println("Сумма элементов массива через цикл do while: "+s1.sumDoWhile());
    }
}
