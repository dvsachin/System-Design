class Comment {
    public String commentId, text;
    public int totalLikes;
    public Member owner;

    public Comment(String commentId, String text, Member owner) {
        this.commentId = commentId;
        this.text = text;
        this.owner = owner;
    }

    public void addLike() {
        totalLikes++;
    }
}