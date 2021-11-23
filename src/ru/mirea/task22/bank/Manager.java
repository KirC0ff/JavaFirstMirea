package ru.mirea.task22.bank;

public class Manager extends User{
    int salary;

    public Manager(){
        salary = 1000+(int)(Math.random()*1000);
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return(this.salary);
    }

    public String toString(){
        return("Manager [id"+id+"] Salary: $"+salary);
    }
}
