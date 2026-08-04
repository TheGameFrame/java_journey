package java_journey.Day9.QuizProject;
public class MainCode {
    
    
    public static void main(String a[])
    {
        QuestionService service = new QuestionService();
        service.playQuiz();
        service.printScore();
    }

}