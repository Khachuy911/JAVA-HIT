/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Khac Huy
 */
public class runMain {
    
    public static void main(String[] args) {
        List<News> lists = new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        int n;
        do{
        System.out.println("1.Insert news");
        System.out.println("2.View list news");
        System.out.println("3.Average rate");
        System.out.println("4.Exit");
        System.out.println("Your Option: ");
        n = sc.nextInt();
        switch(n){
            case 1:{
               News a = new News();
               a.input();
               lists.add(a);
               break;
                }
            case 2:{
               for (int i = 0; i < lists.size(); i++) {
                    lists.get(i).Display();
                    }
               break;
                }
            case 3:{
                for (int i = 0; i < lists.size(); i++) {
                    lists.get(i).Calculate();
                    lists.get(i).Display();
                }
                break;
                }
            case 4:{
                System.exit(0);
                }
            }
        }while(n <4);    
    }
}
