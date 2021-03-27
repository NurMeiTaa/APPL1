//Author: Shinta Nurkaafi
package sdk3;
import java.util.Scanner;

public class SdK3 {
    public static void main(String[] args) {
        String keepGoing = "Y";
        Scanner scan = new Scanner(System.in);
        
        while (keepGoing.equals("y") || keepGoing.equals("Y")){
            System.out.print("Enter an integer: ");
            int val = scan.nextInt();
            try{
                System.out.println("Factorial(" + val + ") = "+ MathUtils.factorial(val));
            } catch(IllegalArgumentException exception) {
                System.out.println(exception + "\n");
            }
            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }
    }
}
