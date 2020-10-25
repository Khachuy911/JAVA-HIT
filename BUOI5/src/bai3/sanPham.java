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
public class sanPham {
    private String maSp;
    private String tenSp;
    private int soLuong;
    private double donGia;

    public sanPham() {
    }

    public sanPham(String maSp, String tenSp, int soLuong, double donGia) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sp: ");
        maSp = sc.nextLine();
        System.out.println("Nhap ten sp: ");
        tenSp = sc.nextLine();
        System.out.println("Nhap so luong: ");
        soLuong = sc.nextInt();
        System.out.println("Nhap don gia: ");
        donGia = sc.nextDouble();
    }
    public void output(){
        System.out.println("Ma sp: " + maSp);
        System.out.println("Ten sp: " + tenSp);
        System.out.println("So luong: " + soLuong);
        System.out.println("Don gia: " + donGia);
        System.out.println("Thanh tien: " + soLuong*donGia);
    }
}
