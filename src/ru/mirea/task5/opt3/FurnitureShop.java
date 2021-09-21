package ru.mirea.task5.opt3;

import java.util.Scanner;

import java.util.Scanner;

public class FurnitureShop {
    Scanner sc = new Scanner(System.in);

    Chair c1 = new Chair("C1155636", "Палисандр", "Коричневый", 9990, 90);
    Chair c2 = new Chair("C1155637", "Металл, кожа", "Черный", 8990, 98);
    Table t1 = new Table("T4968439", "Металл, Стекло", "Синий", 19990, "210x120");
    Table t2 = new Table("T4968440", "Дуб", "Коричневый", 25990, "210x130");
    Table t3 = new Table("T4968441", "Металл, пластик", "Белый", 7990, "120x120");
    Sofa s1 = new Sofa("S6892938", "ДСП, пенополиуритан, ткань", "Серый", 19990, "300x125x150", "Нет");

    public void search(){
        String com;
        System.out.println("Магазин мебели");
        System.out.println("Поиск:");
        com = sc.nextLine();
        //System.out.println(com);
        if (com.equals("Стул") || com.equals("стул"))
        {
            c1.displayInfo();
            c2.displayInfo();
        }
        if (com.equals("Стол") || com.equals("стол"))
        {
            t1.displayInfo();
            t2.displayInfo();
            t3.displayInfo();
        }
        if (com.equals("Диван") || com.equals("диван"))
        {
            s1.displayInfo();
        }
        else System.out.println("Больше ничего не найдено");
    }
}
