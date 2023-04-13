import java.time.LocalDateTime;

public class Receptionist extends Account{
    public LocalDateTime joiningDate;

    public Receptionist(String id, String password, Person person, AccountStatus status) {
        super(id, password, person, status);
        this.joiningDate = LocalDateTime.now();

    }
}
