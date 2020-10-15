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
public class phieu {
   private String maPhieu;
   private hang[] repo;
   private int n;

    public phieu() {
    }
   
   public phieu(String maPhieu, hang[] repo, int n){
       this.maPhieu = maPhieu;
       this.repo = repo;
       this.n = n;
   }
   public void nhap(){
       Scanner sc = new Scanner(System.in);
       System.out.println("ma phieu: ");
       maPhieu = sc.nextLine();
       System.out.println("nhap n: ");
       n = sc.nextInt();
       repo = new hang[n];
       for(int i=0; i<repo.length;i++){
           repo[i] = new hang();
           repo[i].nhap();
       }
   }
   public void xuat(){
       System.out.println("Ma Phieu la: " + maPhieu);
       for(int i=0;i<n;i++){
           repo[i].xuat();
       }
   }
}
