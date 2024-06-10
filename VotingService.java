*/ The Voting Service can be first configured with a given question type and candidate answers. 
Then, it can start accepting submissions from students. 
The important thing to keep in mind about accepting submissions is that each student can only submit one answer. 
If multiple submissions are received from the same student, only the last submission will be counted.

The Voting Service can also output the statistics of the submission results. 
You don’t have to use the graphical interface. 
Simply use the standard output (System.out) to print out the count for each answer. 
For example, “A : 5, B : 12”, or “1. Right : 15, 2. Wrong : 20”. Feel free to customize the format for your output. /*

public class VotingService{
  //configure question types, variables: type and -actual- question
  
  //take submissions from students 

  //check for prior submission
    //if one exists, save new answer to student ID, discard priorSub value

  //output statistics
  //add graphical interface if you have time

}
