//Author: Shinta Nurkaafi
package sdk2;
import java.util.Scanner;

public class SdK2 {
    public static void main(String[] args){
        int val, sum=0;
        Scanner scan = new Scanner(System.in);
        String line;
        
        System.out.println("Enter a line of text: ");
        Scanner scanLine = new Scanner(scan.nextLine());
        
        while (scanLine.hasNext()){
            try{
                val = Integer.parseInt(scanLine.next());
                sum += val;
            }catch(NumberFormatException n){ }
        }
        System.out.println("The sum of the integers on this line is " + sum);
    }
}