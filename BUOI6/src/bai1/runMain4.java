/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Khac Huy
 */
public class runMain4 {
    public static void main(String[] args) {
        Person person1 = new Employee(1000, "huy", "hanoi");
        Person person2 = new Customer(1500,"trung", "baoviec");
        person1.display();
        person2.display();
    }
}
