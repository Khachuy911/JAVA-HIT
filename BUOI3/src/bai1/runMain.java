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
public class runMain {
    public static void main(String[] args) {
        Person DoanXinhGai = new Person();
        Person DiepBueDe = new Person();
        DoanXinhGai.setName("A Doan");
        DoanXinhGai.setHobby("Girl");
        DoanXinhGai.setGender("Female");
        DoanXinhGai.setDateOfBirth("I think ...");
        DiepBueDe.setName("A Diep");
        DiepBueDe.setHobby("Girl");
        DiepBueDe.setGender("Female");
        DiepBueDe.setDateOfBirth("I think.....");
        
        System.out.println("Information A Doan: ");
        System.out.println(DoanXinhGai.getName());
        System.out.println(DoanXinhGai.getHobby());
        System.out.println(DoanXinhGai.getGender());
        System.out.println(DoanXinhGai.getDateOfBirth());
        System.out.println("Information A Diep :");
        System.out.println(DiepBueDe.getName());
        System.out.println(DiepBueDe.getHobby());
        System.out.println(DiepBueDe.getGender());
        System.out.println(DiepBueDe.getDateOfBirth());
    }
}
