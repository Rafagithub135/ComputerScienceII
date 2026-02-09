package TestExam;

public class Question {
    private String text;
    private String answer;

    public Question(String question, String answer) {
        text = "";
        answer = "";
    }

    public Question() {

    }

    public void setText(String questionText) {
        text = questionText;
    }

    public void setAnswer(String correctResponse) {
        answer = correctResponse;
    }

    public boolean checkAnswer(String Response) {
        return Response.equals(answer);
    }

    public void display() {
        System.out.println(text);
    }
}