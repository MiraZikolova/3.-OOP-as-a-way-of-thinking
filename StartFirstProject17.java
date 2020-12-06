package associationAggregationAndComposition17;

import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class StartFirstProject17 {

	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Creates Library */
        LibraryFirstProject17 library = new LibraryFirstProject17();
        library.name = "Saint Library";
        /* Creates Authors */
        AuthorFirstProject17 fiodor = new AuthorFirstProject17();
        fiodor.name = "Fiódor Dostoiévski";
        AuthorFirstProject17 aristoteles = new AuthorFirstProject17();
        aristoteles.name = "Aristóteles";
        /* Creates Books */
        BookFirstProject17 book1 = new BookFirstProject17();
        book1.author = fiodor;
        book1.ISBN = "978-3-16-148410";
        BookFirstProject17 book2 = new BookFirstProject17();
        book2.author = aristoteles;
        book2.ISBN = "789-3-61-123456";
        
        fiodor.books = new ArrayList<BookFirstProject17>(Arrays.asList(book1)); // association
        aristoteles.books = new ArrayList<BookFirstProject17>(Arrays.asList(book2)); // association
        
        /* Put the books in the library */
        library.books = new ArrayList<BookFirstProject17>(Arrays.asList(book1, book2)); // aggregation
        /* Shows Library Books */
        System.out.println("Collection of: " + library.name);
        for (BookFirstProject17 book : library.books) {
            System.out.println(book.ISBN + " " + book.author.name);

        }
    }
}
