package Controllers;
import Models.Book;
public class LibroController {
    public void sortByName(Book[] libros){
        int tam = libros.length;

        for (int i = 0; i < tam -1; i++){
            int pos = 1;
            for (int j = i + 1; j < tam; j++){
                if(libros[j].getName().compareToIgnoreCase(libros[pos].getName()) > 0){
                    pos = j;
                }
            }
            Book tem = libros[i];
            libros[i] = libros[pos];
            libros[pos] = tem;
        }

    }

    public Book searchByName(Book[] libros, String name) {
        int bajo = 0;
        int alto = libros.length;

        while(alto >= bajo){
            int central = (bajo+alto)/2;

            if (libros[central].getName().equalsIgnoreCase(name)){
 
                return central;
            }

            if (libros[central].getName().compareToIgnoreCase(name) > 0){
                alto = central -1;

            }else{
                bajo = central +1;
            }
        }
        return null;
    }
}
