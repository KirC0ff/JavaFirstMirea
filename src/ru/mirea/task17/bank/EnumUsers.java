package ru.mirea.task17.bank;

import java.util.Scanner;

enum UserType{
    Client, Curator, Manager, Owner, None
}

public class EnumUsers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserType[] ID = new UserType[100];

        for(int i=0;i<100;i++){
            ID[i] = UserType.None;
        }

        ID[0] = UserType.Owner;
        ID[1] = UserType.Manager;
        ID[2] = UserType.Curator;
        ID[3] = UserType.Client;

        while (true) {
            System.out.println("Введите ID пользователя");
            int enterID = sc.nextInt();
            switch (ID[enterID]) {
                case Client:
                    System.out.println("Пользователь является клиентом банка\n");
                    break;
                case Curator:
                    System.out.println("Пользователь является куратором клиентов банка\n");
                    break;
                case Manager:
                    System.out.println("Пользователь является менеджером банка\n");
                    break;
                case Owner:
                    System.out.println("Пользователь является владельцем банка\n");
                    break;
                case None:
                    System.out.println("Пользователь не зарегистрирован\n");
                    break;
            }
        }
    }
}
