import java.util.ArrayList;

class Profile {
    public String profilePic, coverPic, gender;
    public ArrayList<String> experiences;
    public String place;

    public Profile(String profilePic, String coverPic, String gender, String place) {
        this.profilePic = profilePic;
        this.coverPic = coverPic;
        this.gender = gender;
        this.place = place;
        this.experiences = new ArrayList<String>();
    }

}