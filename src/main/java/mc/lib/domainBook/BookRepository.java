package mc.lib.domainBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookRepository {

    private List<Book> books = new ArrayList<>();

    Book createNewBook(String title){
        Random r = new Random();
        Book newOne = new Book(r.nextInt(), title);
        this.books.add(newOne);
        System.out.println("Utworzyłem nową książkę o tytule " + newOne.getTitle());
        return newOne;

    }
}
