import java.util.ArrayList;

class Member extends Account {

    public int id;
    public ArrayList<Member> following, followers;
    public ArrayList<Job> pagesFollow;

    public Member(String id, String password, Person person, AccountStatus status, int id2) {
        super(id, password, person, status);
        this.id = id2;
        this.following = new ArrayList<Member>();
        this.followers = new ArrayList<Member>();
        this.pagesFollow = new ArrayList<Job>();
    }

    public void sendMessage(String msg) {

    }

    public void creatPost(Post post) {

    }

    public void sendRequest(Member name) {

    }

}