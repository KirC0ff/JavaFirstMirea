package ru.mirea.task24;
import java.util.Scanner;
import java.util.regex.Pattern;

public class IPv4Test {
    private static boolean checkIP(String ip) {
        return ip.matches("((0|1\\d{0,2}|2([0-4][0-9]|5[0-5]))\\.){3}(0|1\\d{0,2}|2([0-4][0-9]|5[0-5]))");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputIP = sc.nextLine();
        if (checkIP(inputIP) == true)
            System.out.println("Строка является IPv4-адресом");
        else System.out.println("Строка не является IPv4-адресом");
    }
}
