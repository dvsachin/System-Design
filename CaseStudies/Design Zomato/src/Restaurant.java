import java.util.ArrayList;

class Restaurant {
    public String name;
    public ArrayList<Branch> branches;

    Restaurant(String name, Branch initialBranch) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
        this.branches.add(initialBranch);
    }

    public void addBranch(Branch branch) {
        this.branches.add(branch);
    }
}