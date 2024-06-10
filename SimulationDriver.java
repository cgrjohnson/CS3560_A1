*/
SimulationDriver: automatically simulates the process, i.e.:
          1) creates a question type and configures answers
          2) configures questions for iVote Service
          3) randomly generates a number of students and answers
          4) submit all the students’ answers to iVote Service
          5) calls Voting Service output function to display the result. 
      -contains a main() method -> triggers whole process
          -randomly generate Student IDs and answers
          -simulate submissions
          -check and output results
/*

import java.util.Random;
import java.util.Scanner;

public class SimulationDriver{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in)                                         //intialize scanner for input
        int userChoice = 0;                                                         //init. userChoice to zero(0)
        //variable to hold user's question?
        Boolean flag = false;                                                       //init. flag to false for while loop
        System.out.println("Welcome to CJ's Fabulous Polling Program!");            //output introduction
        System.out.println("Let's get started! *audience cheers*");

    
        //while loop for user choice of question type 
        while(Flag == false) {
            System.out.println("Please choose a type of question to ask...");        //give user typeOfQuestion options
            System.out.println("Type "1" for Multiple Choice");                      
            System.out.println("Type "2" for True/False");
            userChoice == Integer.parseInt(sc.nextLine());                            //read user input

            if(userChoice == 1){                                                      //user has chosen a MC question
                //what happens if they choose MC, var from Question.java
            }
            else if(userChoice == 2){                                                 //user has chosen a T/F question
                //what happens if they choose T/F, var from Question.java
            }
            else{                                                                     //user enters an invalid input
                System.out.println("I'm sorry, that is not an accepted input!")
                System.out.println("Please choose from the following...");
                System.out.println(""1" for Multiple Choice");
                System.out.println(""2" for True/False");
            }
        }
        System.out.println("");

        System.out.println("Please type in the question you would like to ask:");    //ask user for question
        String userQuestion == "";                                                   //init. userQuestion to empty String
        userQuestion == sc.nextLine();                                               //assign input to userQuestion

      //have user input options for MC questions
      System.out.println("What are the options for your Multiple Choice Question?");
          //store MC answer options

      //have user input options for T/F questions
      System.out.println("What are the options for your True or False Question?");
          //store T/F answer options
        
      }

//"ask" participants the question
          System.out.println("Let's see what our participants think! *jeopardy theme music*");
          int min = 1;
          int max = 300;            //so that our results should theothetically follow SD rules, for funsies
          Random rand = new Random();
          int numParticipants = rand.nextInt( (max - min) + 1 ) + min )
          Participant[] arrayParticipants = new Participant[numParticipants]

//Oh NO
          //generate student IDs and answers
 //         rand = new Random; 
          //for loop to ...
 //         for (int i = 0, i < numParticipants; i++; {
 //                   arrayParticipants[i] = new Participant("Participant" + i)
          //need variable for size of optionsForQuestion array, add to Question!!!!!!!!!!!!!! /*

  //submission of student answers

  //call VotingService to display results
  
  }
}
