
/**
 * Write a description of class LibraryItem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class LibraryItem {
    private int itemId;
    private boolean available;

    public LibraryItem(int itemId) {
        this.itemId = itemId;
        this.available = true;
    }

    public int getItemId() {
        return itemId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public abstract void checkOut();

    public abstract void returnItem();
}
