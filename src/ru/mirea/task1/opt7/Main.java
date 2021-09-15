package ru.mirea.task1.opt7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        Factorial x = new Factorial(sc.nextInt());
        System.out.println(x.getN()+"! = "+x.factorial());
    }
}
