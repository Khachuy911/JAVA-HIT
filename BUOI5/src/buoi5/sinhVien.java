/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi5;

import java.util.Scanner;

/**
 *
 * @author Khac Huy
 */
public class sinhVien extends Nguoi{
    private String maSv;
    private String nganh;
    private int khoaHoc;

    public sinhVien() {
    }

    public sinhVien(String maSv, String nganh, int khoaHoc) {
        this.maSv = maSv;
        this.nganh = nganh;
        this.khoaHoc = khoaHoc;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhap ma sv:");
        maSv = sc.nextLine();
        System.out.println("Nhap nganh hoc:");
        nganh = sc.nextLine();
        System.out.println("Nhap khoa hoc:");
        khoaHoc = sc.nextInt();
    }
    public void output(){
        super.output();
        System.out.println("Ma sv: " + maSv);
        System.out.println("Nganh hoc: " + nganh);
        System.out.println("Khoa hoc: " + khoaHoc);
    }
    
    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }
    
}
