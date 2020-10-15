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
public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private String dienTich;
    private QuanLy x;
    private May[] y;
    private int n;

    public PhongMay() {
    }

    public PhongMay(String maPhong, String tenPhong, String dienTich, QuanLy x, May[] y, int n) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma phong: ");
        maPhong = sc.nextLine();
        System.out.println("Nhap ten phong:");
        tenPhong = sc.nextLine();
        System.out.println("Nhap dien tich:");
        dienTich = sc.nextLine();
        System.out.println("Nhap so luong may(n)");
        n = sc.nextInt();
        x = new QuanLy();
        x.nhap();
        y = new May[n];
        for (int i = 0; i < y.length; i++) {
            y[i] = new May();
            y[i].nhap();
        }
    }
    public void xuat(){
        System.out.println("Ma phong: " + maPhong);
        System.out.println("Ten phong:" + tenPhong);
        System.out.println("Dien tich:" + dienTich);
        System.out.println("So luong may(n)" + n);
        x.xuat();
        for(May i : y){
            i.xuat();
        }
    }
}
