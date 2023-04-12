import java.time.LocalDateTime;

class Withdraw extends Transaction {
    public int ammount;
    public String accountNumber;

    public Withdraw(String id, String status, LocalDateTime date, int ammount, String accountNumber) {
        super(id, status, date);
        this.ammount = ammount;
        this.accountNumber = accountNumber;
    }

    public int getAmount() {
        return ammount;
    }

}