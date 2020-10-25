/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Khac Huy
 */
public class Phieu {
    private String maPhieu;
    private String tenPhieu;
    private dateTime a;
    private sanPham x[];
    private int n;
    
    public void inputPhieu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma phieu: ");
        maPhieu = sc.nextLine();
        System.out.println("Nhap ten phieu: ");
        tenPhieu = sc.nextLine();
        a = new dateTime();
        a.nhap();
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        x = new sanPham[n];
        for(int i=0;i<n;i++){
            x[i] = new sanPham();
            x[i].input();
        }
    }
    public void outputPhieu(){
        System.out.println("Nhap ma phieu: " + maPhieu);
        System.out.println("Nhap ten phieu: " + tenPhieu);
        a.xuat();
        for(int i=0;i<n;i++){
            x[i].output();
        }
    }
}
