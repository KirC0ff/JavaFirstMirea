package ru.mirea.task22.bank;

public class Curator extends User{
    int salary;

    public Curator(){
        salary = 500+(int)(Math.random()*500);
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return(this.salary);
    }

    public String toString(){
        return("Curator [id"+id+"] Salary: $"+salary);
    }
}
