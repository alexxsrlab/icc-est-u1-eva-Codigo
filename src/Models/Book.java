package Models;

public class Book{

    private String name;
    private int year;

    
    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return "Libros [Year "+ year + ", Name "+ name +"]";
    }
}