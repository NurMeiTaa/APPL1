//author: Shinta Nurkaafi
package sdk8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PrimePanel extends JPanel{
    private JTextField number;
    private JButton computeButton;
    private JTextArea primeList;
    private JScrollPane primeScroll;

    public PrimePanel (){
        JLabel heading = new JLabel ("Prime Number Listing");
        heading.setFont (new Font("Helvetica", Font.BOLD, 30));

        JLabel inputLabel = new JLabel ("Enter a number: ");
        number = new JTextField (8);
        computeButton = new JButton ("Click to see all primes up to your number!");
        primeList = new JTextArea (10, 30);
        primeScroll = new JScrollPane(primeList);
        primeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        computeButton.addActionListener(new ButtonListener());

        // Add the components to the panel
        add (heading);
        add (inputLabel);
        add (number);
        add (computeButton);
        //add (primeList);
        add (primeScroll);

        setPreferredSize (new Dimension (400, 320));
        setBackground (Color.pink);
    }
    
    public class ButtonListener implements ActionListener {
        public void actionPerformed (ActionEvent event){
            try{
                String textNum = number.getText();
                int num = Integer.parseInt(textNum); //ngubah jadi integer
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
                            if (i % j == 0 || j == Math.sqrt(i))
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
                primeList.setText(ans);
            }catch(NumberFormatException n){
                primeList.setText("Harus berupa angka (integer)!");
            }
        }
    }
}