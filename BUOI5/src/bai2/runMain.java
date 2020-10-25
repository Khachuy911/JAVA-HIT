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
        soPhuc number1 = new soPhuc();
        soPhuc number2 = new soPhuc();
        number1.input();
        number2.input();
        number1.sum(number2);
        number1.minus(number2);
    }
}
