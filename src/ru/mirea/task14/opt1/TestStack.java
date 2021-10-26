package ru.mirea.task14.opt1;
import java.util.Scanner;
import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a1 = new int[5];
        int[] a2 = new int[5];
        for (int i = 0; i < 5; i++) {
            a1[i] = in.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            a2[i] = in.nextInt();
        }

        Stack<Integer> arr1 = new Stack<>();
        Stack<Integer> arr2 = new Stack<>();
        for (int i = 4; i >= 0; i--) {
            arr1.push(a1[i]);
            arr2.push(a2[i]);
        }

        int count = 0;

        for (int i = 0; i < 106; i++) {
            count++;
            if (arr1.peek() > arr2.peek() || ((arr1.peek() == 0) && (arr2.peek() == 9))) {
                arr1.add(arr1.peek());
                arr1.add(arr2.peek());
            } else if (arr1.peek() < arr2.peek() || ((arr1.peek() == 9) && (arr2.peek() == 0))) {
                arr2.add(arr1.peek());
                arr2.add(arr2.peek());
            }
            arr1.remove(0);
            arr2.remove(0);

            if (arr1.isEmpty()) {
                System.out.println("second " + count);
                return;
            } else if (arr2.isEmpty()) {
                System.out.println("first " + count);
                return;
            }
        }
        System.out.println("botva");
    }
}