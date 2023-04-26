import java.time.LocalDateTime;

class Badges {
    public String name;
    public String description;
    public LocalDateTime creationDate = LocalDateTime.now();

    Badges(String name, String description) {
        this.name = name;
        this.description = description;
        this.creationDate = LocalDateTime.now();
    }

    public String getBadgeName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public LocalDateTime getCreationDate() {
        return this.creationDate;
    }
}