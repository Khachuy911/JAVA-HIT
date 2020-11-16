/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Khac Huy
 */
public class Rectangle implements Ishape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double Perimeter() {
        return width*length;
    }
    @Override
    public double Area(){
        return (width + length)*2;
    }
    
    
}
