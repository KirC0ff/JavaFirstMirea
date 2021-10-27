package ru.mirea.task15.opt3;

import java.io.*;
import java.util.Scanner;

public class TestReplace {
    public static void replace(String current, String renewed) {
        try (BufferedReader fin = new BufferedReader(new FileReader(new File("C:\\Users\\klarc\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\Text.txt")))) {
            String S = null;
            StringBuffer input = new StringBuffer();
            while ((S = fin.readLine()) != null) {
                input.append(S).append('\n');
            }
            String inputStr = input.toString();
            fin.close();
            inputStr = inputStr.replace(current, renewed);

            FileOutputStream fout = new FileOutputStream("C:\\Users\\klarc\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\Text.txt");
            fout.write(inputStr.getBytes());
            fout.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        System.out.println("Введите информацию, которую нужно заменить:");
        s1 = sc.nextLine();
        System.out.println("Введите новую информацию:");
        s2 = sc.nextLine();

        replace(s1,s2);
    }
}