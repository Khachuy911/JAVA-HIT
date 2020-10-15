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
public class runMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        Sach[] book = new Sach[n];
        for (int i = 0; i < book.length; i++) {
            book[i] = new Sach();
            book[i].nhap();
            
        }
        for(Sach i : book){
            i.xuat();
        }
        
    }
}
