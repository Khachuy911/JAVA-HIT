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
public class Sach {
    private String MaSach;
    private String TenSach;
    private String Nxb;
    private int SoTrang;
    private double GiaTien;

    public Sach() {
    }

    public Sach(String MaSach, String TenSach, String Nxb, int SoTrang, double GiaTien) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.Nxb = Nxb;
        this.SoTrang = SoTrang;
        this.GiaTien = GiaTien;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã sách: ");
        MaSach = sc.nextLine();
        System.out.println("Tên sách: ");
        TenSach = sc.nextLine();
        System.out.println("Nxb: ");
        Nxb = sc.nextLine();
        System.out.println("Số trang: ");
        SoTrang = sc.nextInt();
        System.out.println("Giá tiền: ");
        GiaTien = sc.nextDouble();
    }
    public void xuat(){
        System.out.println("Mã sách: " + MaSach);
        System.out.println("Tên sách: " + TenSach);
        System.out.println("Nxb: " + Nxb);
        System.out.println("Số trang: " + SoTrang);
        System.out.println("Giá tiền: " + GiaTien + " VND");
    }
    }
    

