import java.time.LocalDateTime;

class Deposite extends Transaction {

    public int amount;

    public Deposite(String id, String status, LocalDateTime date, int ammount) {
        super(id, status, date);
        this.amount = ammount;
    }

    public void getTotalBalance() {

    }

}