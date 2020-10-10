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
public class Array {
    private int[] arr;
    private int n;
    
     Scanner sc = new Scanner(System.in);
    public Array(){
        
    }
    public Array(int [] arr,int n){
        this.arr=arr;
        this.n=n;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void InputData(){
       
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
    }
    public void show(){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public int sum(){
        int sumArr=0;
        for (int i = 0; i < n; i++) {
            sumArr+=arr[i];
        }
        return sumArr;
    }
    
    
}
