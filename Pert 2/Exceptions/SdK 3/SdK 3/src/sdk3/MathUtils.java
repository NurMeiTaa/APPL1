//Author: Shinta Nurkaafi
package sdk3;

public class MathUtils{
    public static int factorial(int n) throws IllegalArgumentException{
        if (n > -1 && n <= 16){
            int fac = 1;
            for (int i=n; i>0; i--)
                fac *= i;
            return fac;
        }else if (n <= -1){
            throw new IllegalArgumentException("Invald Input!");
        }else {
            throw new IllegalArgumentException("Sorry, only can count 1 until 16 for the integer");
        }
    }
}