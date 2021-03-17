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
public class Paint {
    private final double coverage;
    public Paint (double c){
        this.coverage = c;
    }
    public double amount (Shape s){
        System.out.println("Computing amount of for " + s);
        return s.getArea()/coverage;
    }
}
