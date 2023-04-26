import java.time.LocalDateTime;

class Answers {
    public String ansText;
    public LocalDateTime creationTime;
    public int voteCount = 0;
    public int flagCount = 0;

    Answers(String text) {
        this.ansText = text;
        this.creationTime = LocalDateTime.now();

    }

    public void incrementVoteCount() {
        this.voteCount += 1;
    }

    public void incrementFlagCount() {
        this.flagCount += 1;

    }

}