package ru.mirea.task15.opt2;

import java.io.*;

public class TestRead {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("C:\\Users\\klarc\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\Text.txt")) {
            int i = -1;
            System.out.println("Информация из файла:");
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}