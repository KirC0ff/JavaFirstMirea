package ru.mirea.task10.opt15;
import java.util.Scanner;

public class LeftToRight {
    public int printOut(int x){
        if(x!=0) {
            System.out.print(x % 10 + " ");
            x /= 10;
        }
        else return 0;
        return printOut(x);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        LeftToRight n = new LeftToRight();
        n.printOut(x);
    }
}
