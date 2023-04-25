import java.time.LocalDateTime;

class FriendRequest {
    public Member requestFrom, requestTo;
    public RequestStatus status;
    public LocalDateTime created, updated;

    FriendRequest(Member user1, Member user2) {
        this.requestFrom = user1;
        this.requestTo = user2;
        this.created = LocalDateTime.now();
        this.status = RequestStatus.PENDING;
    }

    public void accept() {

    }

    public void reject() {

    }

}