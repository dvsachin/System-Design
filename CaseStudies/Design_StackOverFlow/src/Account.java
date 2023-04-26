abstract class Account {
    public String id, password, name, email;
    public String address, phone;
    boolean status = true;

    Account(String id, String pass, String name, String email, String address, String phone) {
        this.id = id;
        this.password = pass;
        this.email = email;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

}
