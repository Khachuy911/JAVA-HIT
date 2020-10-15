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
    private String maql;
    private String hoTen;

    public QuanLy() {
    }

    public QuanLy(String maql, String hoTen) {
        this.maql = maql;
        this.hoTen = hoTen;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma quan li: ");
        maql = sc.nextLine();
        System.out.println("Nhap Ho ten: ");
        hoTen = sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ma quan li: " + maql);
        System.out.println("Ho ten: " + hoTen);
    }
}
