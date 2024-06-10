*/ Question should:
    -Configure the question types and candidate answers
    -Support 2 types of questions: 
          1) multiple-choice question (more than one choice can be chosen including one choice), “A”, “B”, “C”, “D”
          2) single choice question (only one choice can be chosen) “1. Right”, “2. Wrong”   /*

public class Question{
    private int typeOfQuestion;                                             //MC = 1, Single Answer = 2
    private String Question;                                                //String to hold question asked
    private Vector<Integer> optionsForQuestion = new Vector<integer>(0);    //options given for MC questions
    private Vector<String> answersToQuestion = new Vector<String>(0);       //possible answers for single answer Qs

    public Question{
        typeOfQuestion = 1;                                                //questions are MC by default via init.
    }

    //getter & setter method for typeOfQuestion
    //getter & setter method for Question

    //add and get optionsForQuestion

}
