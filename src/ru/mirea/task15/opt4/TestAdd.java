package ru.mirea.task15.opt4;

import java.io.*;
import java.util.Scanner;

public class TestAdd {
    public static void add(String s) {
        try (BufferedReader finCurrent = new BufferedReader(new FileReader(new File("C:\\Users\\klarc\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\Text.txt")))) {
            String S = null;
            StringBuffer inputBuffer = new StringBuffer();
            while ((S = finCurrent.readLine()) != null) {
                inputBuffer.append(S).append('\n');
            }

            BufferedReader finNew = new BufferedReader(new InputStreamReader(System.in));
            OutputStream fout = new FileOutputStream("C:\\Users\\klarc\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\Text.txt");
            String inputStr = inputBuffer.toString();
            fout.write(inputStr.getBytes());

            fout.write((s +"\r\n").getBytes());

            fout.close();
            finCurrent.close();
            finNew.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите информацию, которую необходимо добавить:");
        add(sc.nextLine());
    }
}