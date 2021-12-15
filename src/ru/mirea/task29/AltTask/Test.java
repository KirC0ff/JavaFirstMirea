package ru.mirea.task29.AltTask;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test {
    public static Date getDate(String strDate, SimpleDateFormat formatter)
    {
        Date date = new Date();
        try {
            date = formatter.parse(strDate);
        } catch (ParseException e)  {
            e.printStackTrace();
        }

        return date;
    }

    public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {
        String strDate = "Wed, December 15, 2021";
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);

        Date date = getDate(strDate, formatter);
        CurrencyInfo curInfo = new CurrencyInfo(date);
        curInfo.addCurrency("USD", 74.47);
        curInfo.addCurrency("EUR", 83.2);

        FileOutputStream outputStream = new FileOutputStream("src/ru/mirea/task29/AltTask/info.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(curInfo);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("src/ru/mirea/task29/AltTask/info.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        objectInputStream.close();

        System.out.println(curInfo);
    }
}
