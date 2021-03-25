//Author: Shinta Nurkaafi
package sdk7;
import java.awt.*;
import javax.swing.*;

public class SdK7 {
    public static void main (String[] args){
        JFrame frame = new JFrame ("Currency Converter");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
        RatePanel ratePanel = new RatePanel ();
        frame.getContentPane().add(ratePanel);
        frame.pack();
        frame.setVisible(true);
    }
}
