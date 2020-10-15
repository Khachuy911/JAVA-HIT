/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author Khac Huy
 */
public class May {
    private String Mamay;
    private String Kieumay;
    private String Tinhtrang;

    public May() {
    }

    public May(String Mamay, String Kieumay, String Tinhtrang) {
        this.Mamay = Mamay;
        this.Kieumay = Kieumay;
        this.Tinhtrang = Tinhtrang;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma may:"); 
        Mamay = sc.nextLine();
        System.out.println("Nhap kieu may:");
        Kieumay = sc.nextLine();
        System.out.println("Nhap tinh trang:");
        Tinhtrang = sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ma may:" + Mamay);
        System.out.println("Kieu may:" + Kieumay);
        System.out.println("Tinh trang may:" + Tinhtrang);
    }
}
