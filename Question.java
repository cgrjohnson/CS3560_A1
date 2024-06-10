*/ Question should:
    -Configure the question types and candidate answers
    -Support 2 types of questions: 
          1) multiple-choice question (more than one choice can be chosen including one choice), “A”, “B”, “C”, “D”
          2) single choice question (only one choice can be chosen) “1. Right”, “2. Wrong”   /*

import java.util.Vector;                                                    //import Vectors for storage of options/answers

public class Question{
    private int typeOfQuestion;                                             //MC = 1, Single Answer = 2
    private String question;                                                //String to hold question asked
    private Vector<Integer> optionsForQuestion = new Vector<integer>(0);    //options given for MC questions
    private Vector<String> answersToQuestion = new Vector<String>(0);       //possible answers for single answer Qs

    public Question{
        typeOfQuestion = 1;                                                //questions are MC by default via init.
    }

    //getter & setter method for typeOfQuestion
    void setTypeOfQuestion(int tipo) {                                     //setter
        typeOfQuestion = tipo;
    }
    int getTypeOfQuestion(){                                               //getter
        return typeOfQuestion;

    //getter & setter method for question
    void setQuestion(String val) {                                         //setter
        question = val;
    }
    String getQuestion(){                                                  //getter
        return question;
    }
    
    //add optionsForQuestion and record answers
    void addToOptionsForQuestion(String val) {
        optionsForQuestion.add(val);
        answersToQuestion.add(0);
    }

    //almost missed these(lines 41- 45), remember to be mundful of array sizes when based on user input
    String getOptionsToQuestion(int index){
        return optionsToQuestion.get(index);
    }
    int getOptionsToQuestionSize(){
        return optionsToQuestions.size();
    }
    
    //increase size of answers vector with each submission, record
    void updateAnswersToQuestion(int index, int val) {
        answersToQuestion.set(index, answersToQuestion.get(index) + val );
    }
    
    int getAnswersToQuestions(int index) {
        return answersToQuestions.get(index);
    }    
}
