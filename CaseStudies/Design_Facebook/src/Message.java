class Message {
    public String messageId, text, media;
    public Member sentTo, sentFrom;

    public Message(String messageId, String text, String media, Member sentTo, Member sentFrom) {
        this.messageId = messageId;
        this.text = text;
        this.media = media;
        this.sentTo = sentTo;
        this.sentFrom = sentFrom;
    }

    public String getText() {
        return text;
    }

    public String getMedia() {
        return media;
    }
}