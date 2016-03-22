

import java.util.Vector;


public class MakeMchenryExam {
	 
    public static Exam justDoIt() {
        Vector<Question> questions = new Vector<Question>();
        Exam exam = new Exam("Che Quiz", questions);
        
        {
            Question question = new Question();
            question.setQuery(("What county is Mchenry located?"));
            question.setChoiceA(("Lake"));
            question.setChoiceB(("Cook"));
            question.setChoiceC(("Mchenry"));
            question.setChoiceD(("Kane"));
            question.setAnswer(("c"));
            questions.addElement(question);
        }
        
        {
            Question question = new Question();
            question.setQuery(("What is the high school mascot?"));
            question.setChoiceA(("Bears"));
            question.setChoiceB(("Warriors"));
            question.setChoiceC(("Panthers"));
            question.setChoiceD(("Red Hawks"));
            question.setAnswer(("b"));
            questions.addElement(question);        }
        return exam;
    }

}
