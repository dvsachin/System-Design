import java.util.ArrayList;

class Member extends Account {

    public Integer reputaion = 0;
    public ArrayList<Badges> badges = new ArrayList<Badges>();

    Member(String id, String pass, String name, String email, String address, String phone) {
        super(id, pass, name, email, address, phone);
        Database.addMember(this);

    }

    public void askQuestion(Question question) {

    }

    public void addBadges(Badges badge) {
        badges.add(badge);
    }

}