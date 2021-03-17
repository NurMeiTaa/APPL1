/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintthings;

/**
 *
 * @author dell
 */
public class Rectangle extends Shape {
    private final double length;
    private final double width;
    
    public Rectangle(double length, double width){
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getArea(){
        return length * width;
    }
    
    @Override
    public String toString(){
        return super.toString() + " of length " +length+ " and width " +width;
    }
}
