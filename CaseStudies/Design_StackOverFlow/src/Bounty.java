import java.time.LocalDateTime;

class Bounty {
    public int bounty;
    public LocalDateTime expiryDateTime;

    Bounty(int reputaion, LocalDateTime expiryDateTime) {
        this.bounty = reputaion;
        this.expiryDateTime = expiryDateTime;
    }

    public void modifyBounty(int reputation) {
        this.bounty = reputation;

    }
}