package ru.mirea.task3.opt2;

public class Head {
    private String direction;

    public Head(String direction){
        this.direction = direction;
    }
    public Head(){
        direction = "Straight";
    }
    public void turn(String direction){
        this.direction = direction;
    }
    public String getDirection(){
        return direction;
    }

    public String toString(){
        if(direction == "Straight")
            return("Head is straight");
        else return("Head is turned "+direction);
    }
}
