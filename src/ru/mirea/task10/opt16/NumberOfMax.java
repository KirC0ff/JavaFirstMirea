package ru.mirea.task10.opt16;

import  java.util.Scanner;

public class NumberOfMax {
    private int max = 0;
    private int n = 0;

    public int isMax(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x!=0) {
            if(x == max)
                n++;
            if(x>max){
                max = x;
                n = 1;
            }
            isMax();
        }
        return n;
    }

    public static void main(String[] args){
        NumberOfMax x = new NumberOfMax();
        System.out.println(x.isMax());
    }
}
