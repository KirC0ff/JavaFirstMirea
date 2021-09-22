package ru.mirea.task3.opt2;

public class Human {
    Head h = new Head();
    Body b = new Body();
    Hand rightHand = new Hand('r');
    Hand leftHand = new Hand('l');
    Leg rightLeg = new Leg('r');
    Leg leftLeg = new Leg('l');

    public void doStep(){
        if (leftLeg.ifRaised()==false){
            leftLeg.raise();
            rightLeg.lower();
        }
        else {
            leftLeg.lower();
            rightLeg.raise();
        }
    }
    public String toString(){
        return(h.toString()+"\n"+b.toString()+"\n"+rightHand.toString()+"\n"+leftHand.toString()+"\n"+rightLeg.toString()+"\n"+leftLeg.toString());
    }
}
