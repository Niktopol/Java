package task2;

import java.util.ArrayList;
import java.util.Comparator;

public class Bookshelf {
    private ArrayList<Book> books = new ArrayList<Book>();
    public void addBook(Book book){
        books.add(book);
    }
    public Book getOldBook(){
        if (!books.isEmpty()){
            int i = 0;
            int year = books.get(0).getYear();
            for (int b = 1; b < books.size(); b++){
                if (books.get(b).getYear() < year){
                    i = b;
                }
            }
            return books.get(i);
        }
        return null;
    }
    public Book getNewBook(){
        if (!books.isEmpty()){
            int i = 0;
            int year = books.get(0).getYear();
            for (int b = 1; b < books.size(); b++){
                if (books.get(b).getYear() > year){
                    i = b;
                }
            }
            return books.get(i);
        }
        return null;
    }
    public void sortShelf(){
        books.sort(Comparator.comparing(obj -> obj.getYear()));
    }
    @Override
    public String toString(){
        String s = "";
        for (int i = 0; i < books.size(); i++){
            s += books.get(i).toString() + (i+1 < books.size()? "\n" : " ");
        }
        return s;
    }
}
