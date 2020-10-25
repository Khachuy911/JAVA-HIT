/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Khac Huy
 */
public class LopHoc {
    private String maLh;
    private String tenLh;
    private String ngayMo;
    private ArrayList<sinhVien> x = new ArrayList<>();
    private int n;
    private Nguoi giaoVien;

    public LopHoc() {
    }

    public LopHoc(String maLh, String tenLh, String ngayMo, ArrayList<sinhVien> x, int n, Nguoi giaoVien) {
        this.maLh = maLh;
        this.tenLh = tenLh;
        this.ngayMo = ngayMo;
        this.x = x;
        this.n = n;
        this.giaoVien = giaoVien;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma lop:");
        maLh = sc.nextLine();
        System.out.println("Nhap ten lop:");
        tenLh = sc.nextLine();
        System.out.println("Nhap ngay mo:");
        ngayMo= sc.nextLine();
        System.out.println("Nhap so luong sv:");
        n = sc.nextInt(); 
        for(int i=0;i<n;i++){
           sinhVien a = new sinhVien();
           a.input();
           x.add(a);
        }
        giaoVien = new Nguoi();
        System.out.println("infor giao vien: ");
        giaoVien.input();
    }
    public void output(){
        ArrayList<sinhVien> list = new ArrayList<>();
        System.out.println("Ma lop: " + maLh);
        System.out.println("Ten lop:" + tenLh);
        System.out.println("Ngay mo:" + ngayMo);
        for(sinhVien i : x){
            i.output();
        }
        giaoVien.output();
        
    }
     public void filterKhoa(){
        int count =0;
        for(int i=0;i<x.size();i++){
            if(x.get(i).getKhoaHoc() == 14){
                count++;
            }
        }
         System.out.println("Sinh vien khoa 14 co: " + count);
    }
     
    public void sortByKhoa(){
        for(int i=0;i<x.size()-1;i++){
            for(int j=i;j<x.size();j++){
                if(x.get(i).getKhoaHoc() > x.get(j).getKhoaHoc()){
                    sinhVien tmp = x.get(i);
                    x.set(i, x.get(j));
                    x.set(j, tmp);
                }
            }
        }
    }
}
