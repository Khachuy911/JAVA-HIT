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
public class Nguoi {
    private String hoTen;
    private String ngaySinh;
    private String queQuan;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten:");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh:");
        ngaySinh = sc.nextLine();
        System.out.println("Nhap que quan:");
        queQuan = sc.nextLine();
    }
    public void output(){
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Que qua: " +queQuan);
        
    }
}
