/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Khac Huy
 */
public class NhanSu {
    private String maNhanVien;
    private String hoTen;
    private Date ns;

    public NhanSu() {
    }

    public NhanSu(String maNhanVien, String hoTen, Date ns) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.ns = ns;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien: ");
        maNhanVien = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        ns = new Date();
        ns.nhap();
    }
    public void xuat(){
        System.out.println("Mã nhân viên là:" + maNhanVien);
        System.out.println("Họ Tên nhân viên là: " + hoTen);
        ns.xuat();
    }
    
}
