//author: Shinta Nurkaafi
package sdk8;
import java.awt.*;
import javax.swing.*;

public class SdK8 {
    public static void main (String[] args){
        JFrame frame = new JFrame ("Primes");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        PrimePanel primePanel = new PrimePanel ();
        frame.getContentPane().add(primePanel);
        frame.pack();
        frame.setVisible(true);
    }
}