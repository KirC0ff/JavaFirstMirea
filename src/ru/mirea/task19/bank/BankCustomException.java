package ru.mirea.task19.bank;
import java.util.Scanner;

public class BankCustomException {
    int[] id = {146854,3456,65433,0,125,76507};
    public int transfer(int idFrom, int idTo, float count) throws Exception{
        if (idFrom < 0 || idFrom > 5 || idTo < 0 || idTo > 5){
            throw new Exception("Неверный ID");
        }
        if (count <= 0 || count > id[idFrom]){
            throw new Exception("Неверное количество средств");
        }
        id[idFrom] -= count;
        id[idTo] += count;
        return 0;
    }

    public static void main(String[] args){
        BankCustomException test = new BankCustomException();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ID счета-отправителя, ID счета-получателя и количество средств");
        try{
            test.transfer(sc.nextInt(), sc.nextInt(), sc.nextFloat());
        } catch(Exception e){
            System.out.println("Ошибка перевода: " + e.getMessage());
        }
    }
}
