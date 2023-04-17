import java.util.ArrayList;

class Page {
    public String name, description, id;
    public ArrayList<Member> members;

    Page(String name, String description, String id) {
        this.name = name;
        this.description = description;
        this.id = id;
        members = new ArrayList<Member>();
    }

    public int getTotalMember() {
        return members.size();
    }

}