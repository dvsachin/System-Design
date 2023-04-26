import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class StackOverflow {

    public static void main(String args[]) {
        Admin admin = new Admin("admin", "admin123", "name", "a@b.com", "address", "8758149799");
        Member user = new Member("id", "pass", "name", "email", "address", "7016790646");

        // System.out.println("Test");
    }

    public static void printDate(LocalDateTime date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(date));
    }
}