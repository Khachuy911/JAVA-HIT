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
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array arr1 = new Array();
        Array arr2 = new Array();
        arr1.InputData();
        arr2.InputData();
        float tbc1 = (float)arr1.sum()/(arr1.getN());
        float tbc2 = (float)arr2.sum()/(arr2.getN());
        if(tbc1<tbc2){
            System.out.println(tbc2);
        }else if(tbc1>tbc2){
            System.out.println(tbc1);
        }else 
            System.out.println("Hi !");
    }
}
