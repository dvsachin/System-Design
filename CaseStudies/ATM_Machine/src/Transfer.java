import java.time.LocalDateTime;

class Transfer extends Transaction {
    public String sourceAccountNumber, destAccountNumber;

    public Transfer(String id, String status, LocalDateTime date, String sourceAccountNumber,
                    String destAccountNumber) {
        super(id, status, date);
        this.sourceAccountNumber = sourceAccountNumber;
        this.destAccountNumber = destAccountNumber;
    }

    public void send(int ammount) {

    }
}