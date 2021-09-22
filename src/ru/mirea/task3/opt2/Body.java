package ru.mirea.task3.opt2;

public class Body {
    private boolean isBent;

    public Body(boolean isBent){
        this.isBent = isBent;
    }
    public Body(){
        isBent = false;
    }

    public void bend(){
        isBent = true;
    }
    public void unbend(){
        isBent = false;
    }

    public boolean ifBent(){
        return isBent;
    }

    public String toString(){
        return("Body is bent: "+isBent);
    }
}
