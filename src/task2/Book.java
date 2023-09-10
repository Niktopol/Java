package task2;

public class Book {
    private Author author;
    private String name;
    private int year;
    public Book(Author author, String name, int year){
        this.author = author;
        this.name = name;
        this.year = year;
    }
    public Author getAuthor(){
        return author;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public void setAuthor(Author author){
        this.author = author;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setYear(int year){
        this.year = year;
    }
    @Override
    public String toString(){
        return author.toString() + " " + name + " " + year;
    }
}
