public class SavingAccount extends Account{
    public SavingAccount(String accountNumber, Bank bank, int availableBalance, int withdrawLimit, DebitCard card) {
        super(accountNumber, bank, availableBalance);
        this.withdrawLimit = withdrawLimit;
        this.card = card;
    }

    public int withdrawLimit;
    public DebitCard card;
}
