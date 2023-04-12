public class CurrentAccount extends  Account{
    public int withdrawLimit;
    public DebitCard card;

    public CurrentAccount(String accountNumber, Bank bank, int availableBalance, int withdrawLimit, DebitCard card) {
        super(accountNumber, bank, availableBalance);
        this.withdrawLimit = withdrawLimit;
        this.card = card;
    }
}
