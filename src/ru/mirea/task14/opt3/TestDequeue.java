package ru.mirea.task14.opt3;

import java.util.ArrayDeque;
import java.util.Scanner;

public class TestDequeue {
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

        ArrayDeque<Integer> arr1 = new ArrayDeque<Integer>();
        ArrayDeque<Integer> arr2 = new ArrayDeque<Integer>();
        for (int i = 0; i < 5; i++) {
            arr1.addLast(a1[i]);
            arr2.addLast(a2[i]);
        }

        int count = 0;

        for (int i = 0; i < 106; i++) {
            count++;
            Integer el1 = arr1.peekFirst();
            Integer el2 = arr2.peekFirst();
            if (el1 > el2 && (el1 != 9) && (el2 != 0)) {
                arr1.offer(arr1.pollFirst());
                arr1.offer(arr2.pollFirst());
            } else if (el1 < el2 || ((el1 == 9) && (el2 == 0))) {
                arr2.offer(arr1.pollFirst());
                arr2.offer(arr2.pollFirst());
            }

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