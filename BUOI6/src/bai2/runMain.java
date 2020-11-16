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
public class runMain {
    public static void main(String[] args) {
        Ishape a = new Rectangle(2,2);
        Ishape b = new Circle(4);
        System.out.println( a.Area());
        System.out.println(a.Perimeter());
        System.out.println( b.Area());
        System.out.println(b.Perimeter());
    }
   
}
