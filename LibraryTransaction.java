
/**
 * Write a description of class LibraryTransaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Date;

public class LibraryTransaction {
    private LibraryItem item;
    private LibraryMember member;
    private Date transactionDate;

    public LibraryTransaction(LibraryItem item, LibraryMember member) {
        this.item = item;
        this.member = member;
        this.transactionDate = new Date();
    }

    public void checkoutItem() {
        item.checkOut();
        System.out.println("Peminjaman oleh " + member.getMemberName() + " pada " + transactionDate);
    }

    public void returnItem() {
        item.returnItem();
        System.out.println("Pengembalian oleh " + member.getMemberName() + " pada " + transactionDate);
    }
}
