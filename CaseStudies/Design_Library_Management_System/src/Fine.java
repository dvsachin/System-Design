import java.util.*;
class Fine {
    private Date creationDate;
    private String bookId;
    private String memberId;
    private int finePerDay = 1;

    public int calFine(int days) {
        return days * finePerDay;
    }
}
