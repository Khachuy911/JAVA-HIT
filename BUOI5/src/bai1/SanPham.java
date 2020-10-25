/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Khac Huy
 */
public class SanPham {
    private String maSp;
    private String tenSp;
    private String hangSp;
    private String ngayNhap;

    public SanPham() {
    }

    public SanPham(String maSp, String tenSp, String hangSp, String ngayNhap) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.hangSp = hangSp;
        this.ngayNhap = ngayNhap;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getHangSp() {
        return hangSp;
    }

    public void setHangSp(String hangSp) {
        this.hangSp = hangSp;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSp=" + maSp + ", tenSp=" + tenSp + ", hangSp=" + hangSp + ", ngayNhap=" + ngayNhap + '}';
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma sp:");
        maSp = sc.nextLine();
        System.out.println("nhap ten sp:");
        tenSp = sc.nextLine();
        System.out.println("nhap hang sp:");
        hangSp = sc.nextLine();
        System.out.println("nhap ngay nhap: ");
        ngayNhap = sc.nextLine();
    }
    public void output(){
        System.out.println("ma sp: " + maSp);
        System.out.println("ten sp: " + maSp);
        System.out.println("hang sp: " + hangSp);
        System.out.println("ngay nhap: " + ngayNhap);
    }
    
    
}
