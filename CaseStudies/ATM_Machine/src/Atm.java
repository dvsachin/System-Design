class Atm {
    public String atmId;
    public Bank bank;
    public Address address;

    public Atm(String atmId, Bank bank, Address address) {
        this.atmId = atmId;
        this.bank = bank;
        this.address = address;
    }

    public Boolean authenticateUser(String id, String pass) {
        if (id == "id" && pass == "password")
            return true;

        else
            return false;
    }

    public Boolean makeTransaction(Account user, int ammount) {

        if (user.availableBalance < ammount)
            return false;
        else {
            user.availableBalance -= ammount;
            return true;
        }
    }
}