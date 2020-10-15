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
    private String maMay;
    private String kieuMay;
    private String tinhTrang;

    public May() {
    }

    public May(String maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }

   
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma may:"); 
        maMay = sc.nextLine();
        System.out.println("Nhap kieu may:");
        kieuMay = sc.nextLine();
        System.out.println("Nhap tinh trang:");
        tinhTrang = sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ma may:" + maMay);
        System.out.println("Kieu may:" + kieuMay);
        System.out.println("Tinh trang may:" + tinhTrang);
    }
}
