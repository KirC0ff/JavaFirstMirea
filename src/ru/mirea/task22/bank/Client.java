package ru.mirea.task22.bank;

public class Client extends User{
    int deposit, cash, credit;

    public Client(){
        deposit=(int)(Math.random()*10000);
        cash=(int)(Math.random()*10000);
        credit=(int)(Math.random()*10000);
    }

    public void addDeposit(int add){
        this.deposit += add;
    }
    public void subtractDeposit(int subtract){
        this.deposit -= subtract;
    }
    public void addCash(int add){
        this.cash += add;
    }
    public void subtractCash(int subtract){
        this.cash -= subtract;
    }
    public void addCredit(int add){
        this.credit += add;
    }
    public void subtractCredit(int subtract){
        this.credit -= subtract;
    }

    public int getDeposit(){
        return(this.deposit);
    }
    public int getCash(){
        return(this.cash);
    }
    public int getCredit(){
        return(this.credit);
    }

    public String toString(){
        return("Client [id"+id+"] Cash: $"+cash+" Deposit: $"+deposit+" Credit: $"+credit);
    }
}
