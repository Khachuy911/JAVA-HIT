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
public class Circle implements Ishape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double Area() {
        return Math.PI * radius *radius;
    }

    @Override
    public double Perimeter() {
        return 2* Math.PI * radius;
    }

    
  
    
    
}
