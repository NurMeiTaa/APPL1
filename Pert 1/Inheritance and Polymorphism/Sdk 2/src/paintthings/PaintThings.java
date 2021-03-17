/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintthings;
import java.text.DecimalFormat;
/**
 *
 * @author dell
 */
public class PaintThings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        
        Rectangle deck = new Rectangle(20, 35);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);
        
        double deckAmt, ballAmt, tankAmt;
        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);
        
        DecimalFormat fmt = new DecimalFormat ("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt) + " gallons");
        System.out.println("Big Ball " + fmt.format(ballAmt) + " gallons");
        System.out.println("Tank " + fmt.format(tankAmt) + " gallons");
    }
    
}
