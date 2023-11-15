
/**
 * Write a description of class BookItem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BookItem extends LibraryItem {
    private Book book;

    public BookItem(int itemId, Book book) {
        super(itemId);
        this.book = book;
    }

    @Override
    public void checkOut() {
        if (isAvailable()) {
            System.out.println("Buku \"" + book.getTitle() + "\" berhasil dipinjam.");
            setAvailable(false);
        } else {
            System.out.println("Buku \"" + book.getTitle() + "\" sedang tidak tersedia.");
        }
    }

    @Override
    public void returnItem() {
        setAvailable(true);
        System.out.println("Buku \"" + book.getTitle() + "\" berhasil dikembalikan.");
    }
}

