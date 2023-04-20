class Message {
    public String messageId, text, media;
    public Member sentTo, sentFrom;

    public Message(String messageId, String text, String media, Member sentFrom, Member sentTo) {

        this.messageId = messageId;
        this.text = text;
        this.media = media;
        this.sentTo = sentTo;
        this.sentFrom = sentFrom;
    }

    public String getText() {
        return sentFrom + text ;
    }

    public String getMedia() {
        return media;
    }
}