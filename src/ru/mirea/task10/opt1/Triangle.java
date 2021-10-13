package ru.mirea.task10.opt1;

import  java.util.Scanner;

public class Triangle {
    private int x = 1;
    public int triangleOut(int n){
        for(int i = 0; i<x; i++){
            n--;
            if(x>1)
                System.out.print(", ");
            System.out.print(x);
            if(n == 0){
                return(n);
            }
        }
        x++;
        return triangleOut(n);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Triangle t = new Triangle();
        t.triangleOut(sc.nextInt());
    }
}
