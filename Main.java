
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Java Programming Language", "James Gosling", 123456789);
        BookItem bookItem1 = new BookItem(1, book1);

        LibraryMember member1 = new LibraryMember(101, "John Doe");
        LibraryTransaction transaction1 = new LibraryTransaction(bookItem1, member1);

        transaction1.checkoutItem();
        transaction1.returnItem();
    }
}
