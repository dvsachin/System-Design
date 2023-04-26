import java.time.LocalDateTime;

class Comments {
    public String text;
    public LocalDateTime creationTime;
    public int voteCount = 0;
    public boolean flag = false;

    Comments(String text) {
        this.text = text;
        this.creationTime = LocalDateTime.now();

    }

    public void incrementVoteCount() {
        this.voteCount += 1;
    }

    public void flagOn() {
        this.flag = true;

    }

}
