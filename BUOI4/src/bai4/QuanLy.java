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
public class QuanLy {
    private String Maql;
    private String HoTen;

    public QuanLy() {
    }

    public QuanLy(String Maql, String HoTen) {
        this.Maql = Maql;
        this.HoTen = HoTen;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma quan li: ");
        Maql = sc.nextLine();
        System.out.println("Nhap Ho ten: ");
        HoTen = sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ma quan li: " + Maql);
        System.out.println("Ho ten: " + HoTen);
    }
}
