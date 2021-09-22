package ru.mirea.task3.opt2;

public class Hand {
    private boolean isBent;
    private char side;

    public Hand(char side, boolean isBent){
        this.side = side;
        this.isBent = isBent;
    }
    public Hand(char side){
        this.side = side;
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
        if(side == 'r')
            return("Right hand is bent: "+isBent);
        else return("Left hand is bent: "+isBent);
    }
}
