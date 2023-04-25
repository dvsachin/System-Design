import java.util.ArrayList;

interface Search {
    public ArrayList<Account> searchAccount(String name);

    public ArrayList<Job> searchPost(Job jobId);
}