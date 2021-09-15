package ru.mirea.task1.opt3;

import java.util.Scanner;

public class Sum {
    private int[] a = new int[100];
    private int n, result;
    private Scanner sc = new Scanner(System.in);

    public Sum(int n){
        this.n = n;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
    }
    public int sumFor(){
        result = 0;
        for(int i=0;i<n;i++){
            result += a[i];
        }
        return result;
    }
    public int sumWhile(){
        int i = 0;
        result = 0;
        while(i<n){
            result += a[i];
            i++;
        }
        return result;
    }
    public int sumDoWhile(){
        int i = 0;
        result = 0;
        do{
            result += a[i];
            i++;
        }while(i<n-1);
        return result;
    }
}
