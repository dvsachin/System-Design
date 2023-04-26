import java.time.LocalDateTime;
import java.util.ArrayList;

class Question {
    public String title, description;
    public int viewCount = 0, voteCount = 0;
    public LocalDateTime creationTime, updateTime;
    public boolean status = true, closed = false;
    public int questionId;// unique and question number
    public static int temp = 1;
    public Bounty bounty;
    public ArrayList<Comments> comments = new ArrayList<Comments>();
    public ArrayList<Answers> answers = new ArrayList<Answers>();

    Question(String title, String description, Tag tag) {
        this.title = title;
        this.description = description;
        this.questionId = temp;
        temp += 1;
        Database.addQuestion(this, tag);
    }

    Question(String title, String description, Tag tag, Bounty bounty) {
        this.title = title;
        this.description = description;
        this.bounty = bounty;
        this.questionId = temp;
        temp += 1;
        Database.addQuestion(this, tag);
    }

    public void addComment(Comments comment) {
        comments.add(comment);
    }

    public void addBounty(Bounty bounty) {
        this.bounty = bounty;
    }

    public void close() {
        this.closed = true;
    }

    public void delete() {
        this.status = false;
    }
}