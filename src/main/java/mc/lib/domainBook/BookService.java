package mc.lib.domainBook;

public class BookService {

    private BookRepository repository = new BookRepository();

    public Book createNewBook(String title){
        return this.repository.createNewBook(title);
    }


}
