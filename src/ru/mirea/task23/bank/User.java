package ru.mirea.task23.bank;

public class User {
    int id;
    String login, password;

    public User(String login, String password){
        this.id = (int)Math.random()*100000;
        this.login = login;
        this.password = password;
    }
    public int getID(){
        return this.id;
    }
    public String getLogin(){
        return this.login;
    }
    public String getPassword(){
        return this.login;
    }
}
