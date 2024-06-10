*/ Student:
      -have unique Id (String)
      -can submit answers to Voting Service /*

      
//define Student class and corr. variables
public class Student {
      private String ID;                        //unique ID as Str variable
      private int Answer;                       //Answers to Questions as int
      private Boolean submitted = false;        //student made prior submission, auto. set to false
      private int priorSub;                     //stored Answers to prior submission

      //initialize all remaining variables in Student class(all, save "submitted"
      public Student(){
            ID = "";                            //ID initialized to empty string
            Answer = 0;                         //Answer init. to zero(0)
            priorSub = 0;                       //priorSub init. to zero(0)
      }
      
      //create Student object using variables, newVariables
      public Student(String newID, int newAnswer){
            ID = newID;
            Answer = newAnswer;
      }
      
      //getter & setter method for ID
      String getID(){                           //getter
            return ID;
      }
      void setID(String val){                   //setter
            ID = val;
      }
      
      //getter & setter method for Answer
      int getAnswer(){                          //getter
            return Answer;
      }
      coid setAnswer(int ans){                  //setter
            Answer = ans;
      }
      
      //getter & setter method for submitted
      Boolean getSubmitted(){                   //getter
            return submitted;
      }
      void setSubmitted(Boolean val){           //setter
            submitted = val;
      }
      
      //getter & setter method for priorSub     
      int getPriorSub{                          //getter
            return priorSub;
      }
      void setPriorSub(int val){                //setter
            priorSub = val;
      }
      
}

