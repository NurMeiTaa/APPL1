//Author: Shinta Nurkaafi
package sdk7;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RatePanel extends JPanel{
    private double[] rate; // exchange rates
    private String[] currencyName;
    private JLabel result;

    public RatePanel (){
        JLabel title = new JLabel ("How much is that in dollars?");
        title.setAlignmentX (Component.CENTER_ALIGNMENT);
        title.setFont (new Font ("Helvetica", Font.BOLD, 20));
        
        // Set up the arrays for the currency conversions
        currencyName = new String[] {"Select the currency..",
            "European Euro", "Canadian Dollar",
            "Japanese Yen", "Australian Dollar",
            "Indian Rupee", "Mexican Peso"};
        rate = new double [] {0.0, 1.2103, 0.7351,
            0.0091, 0.6969,
            0.0222, 0.0880};
        result = new JLabel (" ------------ ");
        add (title);
        add (result);
    }
    private class ComboListener implements ActionListener{
        public void actionPerformed (ActionEvent event){
            int index = 0;
            result.setText ("1 " + currencyName[index] +
                " = " + rate[index] + " U.S. Dollars");
        }
    }
}