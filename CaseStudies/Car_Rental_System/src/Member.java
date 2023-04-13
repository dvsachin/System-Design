public class Member extends Account{
    public Member(String id, String password, Person person, AccountStatus status, int totalVehicles) {
        super(id, password, person, status);
        this.totalVehicles = totalVehicles;
    }

    public int totalVehicles = 0;
}
