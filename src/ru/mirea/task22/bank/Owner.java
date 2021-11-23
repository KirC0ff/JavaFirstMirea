package ru.mirea.task22.bank;

public class Owner extends User{
    int totalCash=0, totalDeposit=0, totalCredit=0;

    public void addDeposit(int add){
        this.totalDeposit += add;
    }
    public void subtractDeposit(int subtract){
        this.totalDeposit -= subtract;
    }
    public void addCash(int add){
        this.totalCash += add;
    }
    public void subtractCash(int subtract){
        this.totalCash -= subtract;
    }
    public void addCredit(int add){
        this.totalCredit += add;
    }
    public void subtractCredit(int subtract){
        this.totalCredit -= subtract;
    }

    public int getDeposit(){
        return(this.totalDeposit);
    }
    public int getCash(){
        return(this.totalCash);
    }
    public int getCredit(){
        return(this.totalCredit);
    }

    public String toString(){
        return("Bank: Total cash: $"+totalCash+" Total deposit: $"+totalDeposit+" Total credit: $"+totalCredit);
    }
}
