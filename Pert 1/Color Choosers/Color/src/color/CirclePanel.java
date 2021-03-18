/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package color;

/**
 *
 * @author dell
 */

// ******************************************************************
// CirclePanel.java
//
// A panel with a circle drawn in the center and buttons on the
// bottom that move the circle.
// ******************************************************************
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CirclePanel extends JPanel
{
private final int CIRCLE_SIZE = 50;
private int x,y;
private Color c;
//---------------------------------------------------------------
// Set up circle and buttons to move it.
//---------------------------------------------------------------
public CirclePanel(int width, int height)
{
// Set coordinates so circle starts in middle
x = (width/2)-(CIRCLE_SIZE/2);
y = (height/2)-(CIRCLE_SIZE/2);
c = Color.green;
// Need a border layout to get the buttons on the bottom
this.setLayout(new BorderLayout());
// Create buttons to change the circle's color
JButton red = new JButton("Red");
JButton yellow = new JButton("Yellow");
JButton green = new JButton("Green");
JButton blue = new JButton("Blue");
// Add listeners to the buttons
red.addActionListener(new ColorListener(Color.RED));
yellow.addActionListener(new ColorListener(Color.YELLOW));
green.addActionListener(new ColorListener(Color.GREEN));
blue.addActionListener(new ColorListener(Color.BLUE));
// Add panel to put the buttons
JPanel colorbuttonPanel = new JPanel();
colorbuttonPanel.add(red);
colorbuttonPanel.add(yellow);
colorbuttonPanel.add(green);
colorbuttonPanel.add(blue);
// Add the color panel to the north part of the main panel.
this.add(colorButtonPanel, "North");
}
//Add BG
red.setBackground(Color.RED);
yellow.setBackground(Color.YELLOW);
green.setBackground(Color.GREEN);
blue.setBackground(Color.BLUE);

private JButton chooseColor = new JButton("Choose Color");
chooseColor.addActionListener(new ColorListener(null));
colorButtonPanel.add(chooseColor);
chooseColor.setBackground(Color.PINK);
//---------------------------------------------------------------
// Draw circle on CirclePanel
//---------------------------------------------------------------
public void paintComponent(Graphics page)
{

super.paintComponent(page);
page.setColor(c);
page.fillOval(x,y,CIRCLE_SIZE,CIRCLE_SIZE);
}
//---------------------------------------------------------------
// Class to listen for button clicks that move circle.
//---------------------------------------------------------------
private class MoveListener implements ActionListener
{
private int dx;
private int dy;
//---------------------------------------------------------------
// Parameters tell how to move circle at click.
//---------------------------------------------------------------
public MoveListener(int dx, int dy)
{
this.dx = dx;
this.dy = dy;
}
//---------------------------------------------------------------
// Change x and y coordinates and repaint.
//---------------------------------------------------------------
public void actionPerformed(ActionEvent e)
{
x += dx;
y += dy;
repaint();
}
}
}