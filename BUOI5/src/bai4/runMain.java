/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Khac Huy
 */
public class runMain {
    
    int n;
    public static void addStudent(ArrayList<sinhVien> list){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("How many student: ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
        sinhVien x = new sinhVien();
        x.input();
        list.add(x);
        }
    }
    public static void showStudent(ArrayList<sinhVien> list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static ArrayList editById(ArrayList<sinhVien> list){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhập mã sv: ");
        a = sc.nextInt();
        for(int i=0;i<list.size();i++){
        if(list.get(i).getId()==a){
            list.get(i).input();
            }
        }
        return list;
    }
    public static ArrayList removeById(ArrayList<sinhVien> list){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhập mã sv: ");
        a = sc.nextInt();
        for(int i=0;i<list.size();i++){
        if(list.get(i).getId()==a){
            list.remove(i);
        }  
    }
        return list;
}
    public static void sortByName(ArrayList<sinhVien> list){
        
        for(int i=0;i<list.size()-1;i++){
            for(int j=i;j<list.size();j++){
                if(list.get(i).getName().compareTo(list.get(j).getName()) >0){
                        sinhVien tmp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, tmp);
                }
            
            }
        }
        
    }
    public static void sortByGpa(ArrayList<sinhVien> list){
        for(int i=0;i<list.size()-1;i++){
            for(int j=i;j<list.size();j++){
                if(list.get(i).getGpa() > list.get(j).getGpa()){
                    sinhVien tmp = list.get(i);
                           list.set(i, list.get(j));
                           list.set(j, tmp);         
                }
            }
        }
    }
    
    public static void menu(ArrayList<sinhVien> list ){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("*********MENU********");
        System.out.println("1.add student");
        System.out.println("2.edit student by id");
        System.out.println("3.delete student by id");
        System.out.println("4.show student");
        System.out.println("5.Sort student by gpa");
        System.out.println("6.Sort student by name");
        System.out.println("7.Exit");
        System.out.print("Input your select: ");
        int select;
        select = sc.nextInt();
        switch(select){
            case 1: addStudent(list);menu(list); break;
            case 2: editById(list);menu(list); break;
            case 3: removeById(list);menu(list); break;
            case 4: showStudent(list);menu(list); break;
            case 5: sortByGpa(list); menu(list); break;
            case 6: sortByName(list); menu(list); break;
            case 7: {
                break;
            }
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sinhVien> list = new ArrayList<>();
        menu(list);   
    }
}
