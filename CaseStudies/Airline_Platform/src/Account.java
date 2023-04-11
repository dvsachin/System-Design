public class Account {
    public String id, password;
    public AccountStatus status;
    public String name, email, phone;
    public Passport passport;

    Account(String id, String pass, String name, String email, String phone, Passport passport) {
        this.id = id;
        this.password = pass;
        this.status = AccountStatus.ACTIVE;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.passport = passport;
    }
}
