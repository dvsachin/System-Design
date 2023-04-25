class Message {
    public String messageId, text, media;
    public Member sentTo;

    public Message(String messageId, String text, String media, Member sentTo) {
        this.messageId = messageId;
        this.text = text;
        this.media = media;
        this.sentTo = sentTo;
    }

    public String getText() {
        return text;
    }

    public String getMedia() {
        return media;
    }
}