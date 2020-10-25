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
public class DieuHoa extends SanPham{
    private String congsuat;
    private double money;

    public DieuHoa(String congsuat, double money, String maSp, String tenSp, String hangSp, String ngayNhap) {
        super(maSp, tenSp, hangSp, ngayNhap);
        this.congsuat = congsuat;
        this.money = money;
    }

    public DieuHoa() {
    }

    public String getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(String congsuat) {
        this.congsuat = congsuat;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "DieuHoa{" +super.toString()+ "congsuat=" + congsuat + ", money=" + money + '}';
    }
    
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap cong suat: ");
        congsuat = sc.nextLine();
        System.out.println("nhap so tien: ");
        money = sc.nextDouble();
    }
    public void output(){
        System.out.println("cong suat: " + congsuat);
        System.out.println("so tien: " + money);
        super.output();
    }
    
    
}
