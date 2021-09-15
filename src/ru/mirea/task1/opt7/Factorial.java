package ru.mirea.task1.opt7;

import java.util.Scanner;

public class Factorial {
    private int n;
    private Scanner sc = new Scanner(System.in);

    public Factorial(int n){
        this.n = n;
    }

    public int factorial(){
        int result = 1;
        for (int i=2; i<=n;i++)
            result *= i;
        return result;
    }
    public int getN(){
        return n;
    }
}
