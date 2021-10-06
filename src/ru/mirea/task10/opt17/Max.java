package ru.mirea.task10.opt17;

import java.util.Scanner;

public class Max {
    private int max = 0;

    public int isMax(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x!=0) {
            if(x>max)
                max = x;
            isMax();
        }
        return max;
    }

    public static void main(String[] args){
        Max x = new Max();
        System.out.println(x.isMax());
    }
}
