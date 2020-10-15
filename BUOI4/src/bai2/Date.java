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
public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(){
        
    }
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ngay: ");
        day = sc.nextInt();
        System.out.println("nhap thang: ");
        month = sc.nextInt();
        System.out.println("nhap nam: ");
        year = sc.nextInt();
    }
    public void xuat(){
        System.out.println("Ngay: " + day);
        System.out.println("Thang:" + month);
        System.out.println("Nam:" + year);
    }
}
