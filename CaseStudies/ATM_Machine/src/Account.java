public class Account {
    public String accountNumber;
    public int availableBalance;
    public Bank bank;
    public Status status = Status.ACTIVE;

    public Account(String accountNumber, Bank bank, int availableBalance) {
        this.accountNumber = accountNumber;
        this.bank = bank;
        this.availableBalance = availableBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAvailableBalance() {
        return availableBalance;
    }
}
