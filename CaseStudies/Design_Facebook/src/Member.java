import java.util.ArrayList;

class Member extends Account {


    String text, media;

    Member sentTo, sentFrom;
    public ArrayList<Member> following, followers;
    public ArrayList<Page> pagesFollow;

    public Member(String id, String password, Person person, AccountStatus status) {
        super(id, password, person, status);
        this.following = new ArrayList<Member>();
        this.followers = new ArrayList<Member>();
        this.pagesFollow = new ArrayList<Page>();
    }

    public void sendMessage(String text, String media, Member sentTo ) {
        Message m = new Message( (String.valueOf((int)Math.random())), text, media,  this, sentTo );
        java.lang.System.out.println(m.getText());
    }
    public void creatPost(Post post)
    {
        new Post(this, id, text);
    }

    public void sendRequest(Member name)
    {
        new FriendRequest(this, name);
    }

    @Override
    public String toString() {
        return this.person.name+":  ";
    }
}