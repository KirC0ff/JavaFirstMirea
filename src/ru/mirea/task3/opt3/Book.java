package ru.mirea.task3.opt3;

public class Book {
    private String name, author;
    private int numberOfSheets;
    private int year;

    public Book(String author, String name, int y, int n)
    {
        this.author = author;
        this.name = name;
        year = y;
        numberOfSheets = n;
    }

    public Book(String author, String name, int y)
    {
        this.author = author;
        this.name = name;
        year = y;
        numberOfSheets = 0;
    }

    public Book(String author, String name)
    {
        this.author = author;
        this.name = name;
        year = 0;
        numberOfSheets = 0;
    }

    public Book(String author)
    {
        this.author = author;
        this.name = "N/S";
        year = 0;
        numberOfSheets = 0;
    }

    public Book()
    {
        this.author = "N/S";
        this.name = "N/S";
        year = 0;
        numberOfSheets = 0;
    }

    public void changeName(String newName){
        name = newName;
    }
    public void changeAuthor(String newAuthor){
        author = newAuthor;
    }
    public int getYear(){
        return year;

    }
    public int getNumber(){
        return numberOfSheets;
    }

    public String getAuthor(){
        return author;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        return this.author+" \""+this.name+"\", "+this.year+", "+this.numberOfSheets+" sheets";
    }
}
