//author: Shinta Nurkaafi
package sdk8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PrimePanel extends JPanel{
    private JTextField number;
    private JButton computeButton;
    private JTextArea primeList;

    public PrimePanel (){
        JLabel heading = new JLabel ("Prime Number Listing");
        heading.setFont (new Font("Helvetica", Font.BOLD, 30));

        JLabel inputLabel = new JLabel ("Enter a number: ");
        number = new JTextField (8);
        computeButton = new JButton ("Click to see all primes up to your number!");
        primeList = new JTextArea (10, 30);

        computeButton.addActionListener(new ButtonListener());

        // Add the components to the panel
        add (heading);
        add (inputLabel);
        add (number);
        add (computeButton);
        add (primeList);

        setPreferredSize (new Dimension (400, 320));
        setBackground (Color.yellow);
    }
    
    public class ButtonListener implements ActionListener {
        public void actionPerformed (ActionEvent event){
            String textNum = number.getText();
            int num = Integer.parseInt (textNum);
            String ans = "";

            int count = 0;
            if (num < 2)
                ans = "There no primes less than " + num;
            else {
                ans = " " + 2;
                count++;
                for (int i = 3; i <= num; i += 2){
                    boolean foundDivisor = false;
                    int j = 3;
                    while (j < i && !foundDivisor){
                        if (i % j == 0)
                            foundDivisor = true;
                        else
                            j++;
                    }
                    
                    // Add i to the list if it is prime
                    if (j == i){
                        ans += " " + i;
                        count++;
                        if (count % 10 == 0)
                            ans += "\n";
                    }
                }
            }
            primeList.setText (ans);
        }
    }
}