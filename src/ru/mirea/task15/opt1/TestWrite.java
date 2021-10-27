package ru.mirea.task15.opt1;

import java.io.*;
import java.util.Scanner;

public class TestWrite {
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);

        OutputStream fout = new FileOutputStream("C:\\Users\\klarc\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\Text.txt");

        System.out.println("Введите информацию:");
        String s = sc.nextLine();
        fout.write((s +"\r\n").getBytes());

        fout.close();
    }
}