import java.util.ArrayList;

class Member extends Account {

    public String id;
    String messageId, text, media, sentFrom;
    Member sentTo;
    public ArrayList<Member> following, followers;
    public ArrayList<Page> pagesFollow;

    public Member(String id, String password, Person person, AccountStatus status, String id2) {
        super(id, password, person, status);
        this.id = id2;
        this.following = new ArrayList<Member>();
        this.followers = new ArrayList<Member>();
        this.pagesFollow = new ArrayList<Page>();
    }

    public void sendMessage(String msg)
    {
        new Message(messageId, text, media, sentTo, this);
    }
    public void creatPost(Post post)
    {
        new Post(this, id, text);
    }

    public void sendRequest(Member name)
    {
        new FriendRequest(this, name);
    }

}