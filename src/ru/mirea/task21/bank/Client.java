package ru.mirea.task21.bank;

public class Client {
    int id, deposit, cash, credit;

    public Client(int id){
        this.id = id;
        deposit = 0;
        cash = 0;
        credit = 0;
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

    public int getID(){
        return(this.id);
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
