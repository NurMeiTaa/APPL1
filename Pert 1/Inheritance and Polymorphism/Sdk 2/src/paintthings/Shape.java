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
abstract public class Shape
{
    private final String shapeName;

    public Shape(String shapeName){
    	this.shapeName = shapeName;
    }
    abstract public double getArea();
    @Override
    public String toString(){
        return shapeName;
    }
}

