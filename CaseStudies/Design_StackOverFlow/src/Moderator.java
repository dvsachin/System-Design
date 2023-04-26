class Moderator extends Member {

    Moderator(String id, String pass, String name, String email, String address, String phone) {
        super(id, pass, name, email, address, phone);
        // TODO Auto-generated constructor stub
        Database.addModerator(this);
    }

    public boolean closeQuestion(Question question) {
        return true;
    }

    public boolean deleteQuestion(Question question) {
        return true;
    }

    public void deleteComment(Comments comment) {
        // delete comment
    }

}