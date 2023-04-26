class Admin extends Member {
    Admin(String id, String pass, String name, String email, String address, String phone) {
        super(id, pass, name, email, address, phone);

    }

    public boolean blockMember(Member person) {
        return true;
    }

    public boolean unBlockMember(Member person) {
        return true;
    }

    public void resetPassword(Member person) {
        person.password = "";
    }

}