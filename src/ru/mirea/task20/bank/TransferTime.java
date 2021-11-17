package ru.mirea.task20.bank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.text.DateFormat;
import java.util.Scanner;

public class TransferTime {
    Date date = new Date();
    Date dt_to = null;
    TimeZone tempZone = TimeZone.getDefault();
    TimeZone[] idTimeZone = {TimeZone.getTimeZone("Europe/Moscow"), TimeZone.getTimeZone("Europe/Samara"), TimeZone.getTimeZone("Europe/Warsaw")};
    DateFormat df_utc = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    DateFormat df_to = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public void transfer(int id, float count){
        df_utc.setTimeZone(TimeZone.getTimeZone("Europe/Moscow"));
        df_to.setTimeZone(idTimeZone[id]);
        String date_utc = df_utc.format(date);
        String date_to = df_to.format(date);
        System.out.println("Перевод выполнен "+date_utc+" "+tempZone.getID());
        System.out.println("Перевод получен "+date_to+" "+idTimeZone[id].getID());
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TransferTime test = new TransferTime();
        System.out.println("Введите ID счета-получателя и количество средств");
        test.transfer(sc.nextInt(), sc.nextFloat());
    }
}
