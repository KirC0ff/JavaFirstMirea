package ru.mirea.task22.bank;

public class User {
    int id, maxID = 531046;
    public User(int id){
        this.id = id;
    }
    public User(){
        this.id = maxID;
        maxID++;
    }
    public int getID(){
        return this.id;
    }
}
