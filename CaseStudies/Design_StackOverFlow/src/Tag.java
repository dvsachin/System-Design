import java.util.ArrayList;

class Tag {
    public ArrayList<String> tags = new ArrayList<String>();
    public int frequencyAsked = 0;

    Tag(String... tags) {
        for (String s : tags)
            this.tags.add(s);
    }

    public int getFrequency(String tag) {

        this.frequencyAsked = Database.questions.get(tag).size();
        return this.frequencyAsked;

    }
}