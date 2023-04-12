import java.time.LocalDateTime;

class BalanceInquiry extends Transaction {
    public String accountNumber;

    public BalanceInquiry(String id, String status, LocalDateTime date, String accountId) {
        super(id, status, date);
        this.accountNumber = accountId;
    }

    public void getDetails() {

    }
}