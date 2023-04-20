class App {

    public static void main(String[] args) {
            // Initialization and working on components
        Address personOneAddress = new Address("Saint Martha House","Citta del Vaticano","Vatican", "00120","Rome");
        Address personTwoAddress = new Address("351 Farmington Ave","Hartford","Conn", "06105","USA");

        Person personOne = new Person("Bethany","Bethany123@gmail.com","34243223",personOneAddress);
        Person personTwo = new Person("Farmington", "Farmington007@gmail.com", "65432232",personTwoAddress);

        Member personOneAccount = new Member("101","BethanyRocks",personOne,AccountStatus.ACTIVE);
        Member personTwoAccount = new Member("302","FarmingtonBond",personTwo,AccountStatus.ACTIVE);

        FriendRequest friendRequest = new FriendRequest(personOneAccount,personTwoAccount);
        friendRequest.accept();

        personOneAccount.sendMessage("Hello! I am ready", "", personTwoAccount);
        personTwoAccount.sendMessage("Let's begin", "", personOneAccount);

    }
}
