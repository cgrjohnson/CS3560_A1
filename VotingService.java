*/ The Voting Service can be first configured with a given question type and candidate answers. 
Then, it can start accepting submissions from students. 
The important thing to keep in mind about accepting submissions is that each student can only submit one answer. 
If multiple submissions are received from the same student, only the last submission will be counted.

The Voting Service can also output the statistics of the submission results. 
You don’t have to use the graphical interface. 
Simply use the standard output (System.out) to print out the count for each answer. 
For example, “A : 5, B : 12”, or “1. Right : 15, 2. Wrong : 20”. Feel free to customize the format for your output. /*

package pollingSim;
    
public class VotingService{
    private int typeOfQuestion = 1;                                                  //intialize question type to MC
    private Question questionn;                                                      //declare Question

    //configure question types, variables: type and -actual- question
    void configurationService(int tipo, Question newQ) {
        typeOfQuestion = tipo;
        question = newQ;
    }

    //check for prior submissions from participant  
    void submission(Student participant){
      if(participant.getSubmitted) == false) {    //no prior submission occurred
          question.updateAnswersToQuestion(participant.getPriorSub(), -1);
          participant.setSubmitted(true);                                            //show that a submission by student exists
      }
      else(){    //prior submission exists
          question.updateAnswersToQuestion(participant.getPriorSub(), -1);
          question.updateAnswersToQuestion(participant.getAnswer(), 1);              //replace priorSub with new input

      }
    }
  
  //output statistics
    void output() {
        System.out.println("All done!");                                             //let user know poll is complete
        System.out.println("Let's take a look at the stats, shall we?"!");
        System.out.prtinln("");
        System.out.println("*** FINAL POLL RESULTS ***");
        
    //if and else statement for MC versus T/F poll
    if(typeOfQuestion == 1) {                                                        //for MC questions
            char alphabet = 'A';
            for(int i = 0; i < question.getOptionsToAnswerSize(); i++) {
                System.out.print(alphabet + ": ";                                    //print letter and number of submissions
                System.out.println(question.getAnswersToQuestion(i));
                alphabet++;
            }
    }
    else {                                                                           //forT/F questions
                System.out.println("True: " + question.getAnswersToQuestion(0));     //print True or False and number of submissions
                System.out.println("False: " + question.getAnswersToQuestion(1));
        
        
  //add graphical interface if you have time

}
