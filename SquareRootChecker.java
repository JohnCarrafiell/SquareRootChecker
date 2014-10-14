/**
*
* Prompts user to enter a value, checks if negative -- if not, prints out the square root
*
* @author <your name here>
* @version <date you finished the code>
*
*/
import java.util.Scanner;

public class SquareRootChecker {
	
	public static void main(String[] args) {

      Scanner scnr = new Scanner(System.in);
      System.out.println("Input an integer: ");
      double double1 = scnr.nextDouble();
      if (double1 > -1){
      System.out.println(Math.sqrt(double1));
      } else {
      System.out.println("Error!");
      }
      
	}

}
