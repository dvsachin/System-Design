import java.util.ArrayList;
import java.util.HashMap;

class Database {
    public static HashMap<String, ArrayList<Question>> questions = new HashMap<String, ArrayList<Question>>();
    public static ArrayList<Member> members = new ArrayList<Member>();
    public static ArrayList<Moderator> moderators = new ArrayList<Moderator>();

    public static void addQuestion(Question question, Tag tags) {
        for (String tag : tags.tags) {
            if (questions.containsKey(tag))
                questions.get(tag).add(question);
            else
                questions.put(tag, new ArrayList<Question>());
        }

    }

    public static void addMember(Member member) {
        members.add(member);
    }

    public static void addModerator(Moderator moderator) {
        moderators.add(moderator);
    }

    public static ArrayList<Question> searchQuestions(String tag) {

        return questions.get(tag);
    }
}