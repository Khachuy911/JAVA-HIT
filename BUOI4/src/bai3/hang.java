/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author Khac Huy
 */
public class hang {
    private String maHang;
    private  String tenHang;
    private int donGia;
    
    public hang(){
        
    }
    public hang(String maHang ,String tenHang, int donGia){
        this.tenHang = tenHang;
        this.maHang = maHang;
        this.donGia = donGia;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma hang: ");
        maHang = sc.nextLine();
        System.out.println("nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.println("nhap don gia");
        donGia = sc.nextInt();
    }
    public void xuat(){
        System.out.println("ten hang: " + tenHang);
        System.out.println("ma hang: " + maHang);
        System.out.println("don gia: " + donGia);
    }
}
