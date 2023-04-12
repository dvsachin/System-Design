import java.time.LocalDateTime;

class Transaction {
    public String id;
    public LocalDateTime date;
    public TransactionStatus status;
    public TransactionType type;

    public Transaction(String id, TransactionStatus status, TransactionType type, LocalDateTime date) {
        this.id = id;
        this.status = status;
        this.date = date;
        this.type = type;
    }

    public Transaction(String id2, String status2, LocalDateTime date2) {
    }

    public void makeTransaction() {

    }

    public void saveTransaction() {

    }
}