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
public  class Customer extends Person{
    private int balance;

    public Customer() {
    }

    public Customer(int balance) {
        this.balance = balance;
    }

    public Customer(int balance, String name, String address) {
        super(name, address);
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("Customer name: "+ getName());
        System.out.println("Customer address: "+getAddress());
        System.out.println("Customer balance: "+ balance);
    }
    

    
}
