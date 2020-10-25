/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author Khac Huy
 */
public class sinhVien {
    private int id;
    private String name;
    private int age;
    private String address;
    private double gpa;

    public sinhVien() {
    }

    public sinhVien(int id, String name, int age, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sv: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên SV: ");
        name = sc.nextLine();
        System.out.println("Nhập tuổi sv: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập địa chỉ sv: ");
        address = sc.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        gpa = sc.nextDouble();
        
    }
    public void output(){
        System.out.println("Mã sv: " + id);
        System.out.println("Tên SV: " + name);
        System.out.println("Tuổi sv: " + age);
        System.out.println("Địa chỉ sv: " + address);
        System.out.println("Điểm trung bình: " + gpa);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "sinhVien{" + "id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", gpa=" + gpa + '}';
    }
    
    
    
    
}
