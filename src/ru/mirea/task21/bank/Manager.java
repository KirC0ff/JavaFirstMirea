package ru.mirea.task21.bank;

public class Manager {
    int id, salary;

    public Manager(int id){
        this.id = id;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return(this.salary);
    }
    public int getID(){
        return(this.id);
    }

    public String toString(){
        return("Manager [id"+id+"] Salary: $"+salary);
    }
}
