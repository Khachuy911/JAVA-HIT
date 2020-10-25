/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Khac Huy
 */
public class runMain {
    public static void main(String[] args) {
        ArrayList<DieuHoa> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap n: ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            DieuHoa x = new DieuHoa();
            x.input();
            list.add(x);       
        }
//        
        double minMoney = list.get(0).getMoney();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getMoney() < minMoney){
                minMoney = list.get(i).getMoney();
            }
        }
        int count=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getHangSp().compareToIgnoreCase("Electrolux")==0 && list.get(i).getMoney() == minMoney){
                count++;
                break;
            }
        }
        if(count > 0){
            for(int i=0;i<list.size();i++){
                if(list.get(i).getHangSp().compareToIgnoreCase("Electrolux")==0 && list.get(i).getMoney() == minMoney)
                System.out.println(list.get(i));
            } 
        
        }else 
            System.out.println("No");
    }
}
