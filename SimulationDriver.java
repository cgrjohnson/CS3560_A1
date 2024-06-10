*/ You need a SimulationDriver to automatically simulate the whole process. 
  Basically, the driver will:
        1) create a question type and configure the answers
        2) configure the question for iVote Service
        3) randomly generate a number students and the answers
        4) submit all the students’ answers to iVote Service
        5) call the Voting Service output function to display the result

  SimulationDriver should contain a main() method that triggers the whole process. 
  You can randomly generate the IDs and answers for a group of students to simulate the submission process and check the results. /*

import java.util.Random;
import java.util.Scanner;

public class SimulationDriver{
  //create question type
      //MC
      //single answer

  //random generation of students & answers

  //submit student snwers to iVote service

  //call VotingService to display results

}
