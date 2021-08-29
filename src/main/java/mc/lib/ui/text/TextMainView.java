package mc.lib.ui.text;

import mc.lib.domainBook.BookService;

import java.util.Scanner;

public class TextMainView {

    BookService bookService = new BookService();

    public void init(){
        System.out.println("LibApp - system do zarządzania zbiorami bibliotecznymi");
        System.out.println("Wybierz operacje");
        Scanner scan = new Scanner(System.in);
        int option = -1;

        while(option != 0){
            System.out.println("0.Dodaj książkę");
            System.out.println("1.Wyjdź z systemu");
            option = Integer.parseInt(scan.nextLine());
            if(option == 0){
                this.handleCreateNewBook(scan);
            }else if (option == 1) {
                System.out.println("Kończę działanie programu. Do zobaczenia.");
                System.out.println(":)");
            }
        }

    }

    private void handleCreateNewBook(Scanner scan) {
        System.out.println("Podaj tytuł książki");
        String title = scan.nextLine();
        this.bookService.createNewBook(title);

    }


}
