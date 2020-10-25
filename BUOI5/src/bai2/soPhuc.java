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
public class soPhuc {
    private double soThuc;
    private double soAo;

    public soPhuc(double soThuc, double soAo) {
        this.soThuc = soThuc;
        this.soAo = soAo;
    }

    public soPhuc() {
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thuc: ");
        soThuc = sc.nextDouble();
        System.out.println("Nhap so ao: ");
        soAo = sc.nextDouble();
    }
    public void sum(soPhuc a){
        double sumThuc =  this.soThuc + a.soThuc;
        double sumAo = this.soAo + a.soAo;
        System.out.println("Tong la: " + sumThuc+ " + " + sumAo + "i");
    }
    public void minus(soPhuc a){
        double miThuc =  this.soThuc - a.soThuc;
        double miAo = this.soAo - a.soAo;
         System.out.println("Hieu la: " + miThuc + " + " + miAo + "i");
    }

    public double getSoThuc() {
        return soThuc;
    }

    public double getSoAo() {
        return soAo;
    }
    
}
