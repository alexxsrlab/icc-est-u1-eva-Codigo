package View;
import Models.Book;
public class ViewConsole {
    
    public void printBookArray(Book[] libros){
        for (Book libro : libros){
            System.out.println(libros);
        }
    }

    public void printMessage(String message){
        System.out.println(message);
    }
}
