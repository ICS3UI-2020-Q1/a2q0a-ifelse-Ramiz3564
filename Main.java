import java.util.Scanner;

/**
 * lets the user know if they can drive or not
 * @author Zach Ramirez
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
   public static void main(String[] args) {
   //creates a scanner for the user \
   Scanner input = new Scanner(System.in); 

   //define the minimum age 
   final int MIN_DRIVER_AGE = 16; 
   final int VOTING_AGE = 18; 

   //prompt the user for their age 
   System.out.println("please enter your age"); 
   // get the age from the user 
   int age = input.nextInt(); 


   if(age >= VOTING_AGE){
     System.out.println("you can legally vote");
     System.out.println("you can legally drive");
   } else {

   }

   //determine if they can drive 
   if(age >= MIN_DRIVER_AGE){
     //tell them they can drive
     System.out.println("you can legally get your license");
   } else {
     //not old enough to drive 
     System.out.println("No"); 
   }  
    

    //boolean logical operators
    //between 18 and 30  
    if(age >= && age <= 30){
      //age is bigger than or equal to 18
      //age is less than or equal to 30 
      System.out.println("college time")
    } 

    
  }
}
