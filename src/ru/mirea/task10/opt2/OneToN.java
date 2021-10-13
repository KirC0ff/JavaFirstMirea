package ru.mirea.task10.opt2;
import java.util.Scanner;

public class OneToN {
    private int x = 0;

    public int printOut(int n){
        x++;
        if(x>1)
            System.out.print(", ");
        System.out.print(x);
        if(x == n)
            return(n);
        return printOut(n);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        OneToN o = new OneToN();
        o.printOut(sc.nextInt());
    }
}
