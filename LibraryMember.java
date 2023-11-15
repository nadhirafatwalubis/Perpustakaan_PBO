
/**
 * Write a description of class LibraryMember here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LibraryMember {
    private int memberId;
    private String memberName;

    public LibraryMember(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }
}
