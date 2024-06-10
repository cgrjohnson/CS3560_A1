*/ CS3560_A1

Problem Description

Build a Java-based simulation tool based on the live poll idea (mentimeter). This is going to be a pure desktop-based console program, WITHOUT web interactions or graphical UIs required.

The basic functions of the system include:
    -Configure the question types and candidate answers:
        It should support 2 types of questions: 
            1) multiple-choice question (more than one choice can be chosen including one choice), e.g. “A”, “B”, “C”, “D” 
            2) single choice question (only one choice can be chosen), e.g. “1. Right”, “2. Wrong” 
      
  -Allow students to submit answers
          Every student has:
              -unique ID stored as a STRING
              -can submit an answer to the iVote service

  -Voting Service, Configuration Notes:
      1) given question type and candidate answers
      2) accept submissions from students
          -each student can only submit ONE answer
          -if multiple submissions from the same student: only the LAST submission is counted
      3) output the statistics of the submission results
          -no graphical interface necessary
          -use standard output (System.out) to print out the count for answers, e.g. “A : 5, B : 12”, or “1. Right : 15, 2. Wrong : 20”. 
          -customize the format for your output to personal preference
        
  -has SimulationDriver to automatically simulate the whole process, i.e.:
          1) create a question type and configure the answers
          2) configure the question for iVote Service
          3) randomly generate a number students and the answers
          4) submit all the students’ answers to iVote Service
          5) call the Voting Service output function to display the result. 
      -should contain a main() method that triggers whole process
          -randomly generate Student IDs and answers
          -simulate submissions
          -check and output results

-should be written in JAVA

-include the following classes:
    1) Student
    2) Question
    3) VotingService
    4) SimulationDriver

-include more classes where necessary(not required)

/*
