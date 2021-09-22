package ru.mirea.task3.opt2;

public class Leg {
    private boolean isRaised;
    private char side;

    public Leg(char side, boolean isRaised){
        this.side = side;
        this.isRaised = isRaised;
    }
    public Leg(char side){
        this.side = side;
        isRaised = false;
    }

    public void raise(){
        isRaised = true;
    }
    public void lower(){
        isRaised = false;
    }
    public boolean ifRaised(){
        return isRaised;
    }

    public String toString(){
        if(side == 'r')
            return("Right leg is raised: "+isRaised);
        else return("Left leg is raised: "+isRaised);
    }
}
