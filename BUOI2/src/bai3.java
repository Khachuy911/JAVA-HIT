
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khac Huy
 */
public class bai3 {
    
    public static void xuat(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i]+ " ");       
        }
    }
    public static void dao(int[] arr){
        System.out.println("");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print( arr[i]+ " "); 
        }
    }
    public static int[] chen(int[]arr,int v,int x){
        
        int[] arrnew = new int[arr.length+1];
        int index=0;
        for(int i=0;i<arr.length;i++){
            arrnew[index++]=arr[i];
        }
        for(int i=arrnew.length-1;i>=v;i--){
            arrnew[i]=arrnew[i-1];
        }
        arrnew[v]=x;
        return arrnew;
    }
    public static int [] xoa(int []arr,int v){
        for(int i=v;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        int[] arrnew = new int[arr.length-1];
        int index=0;
        for(int i=0;i<arr.length-1;i++){
            arrnew[index++]=arr[i];
        }
        
        return arrnew;
    }
    
    public static void mumbersFilter(int []arr){
        System.out.println("\narr[1]= "+arr[1]);
        System.out.print("List: ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%arr[1]==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,v;
        System.out.print("nhap n:");
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //xuat(arr);
//        dao(arr);
//        mumbersFilter(arr);

//        System.out.print("\nnhap v: ");
//        v=sc.nextInt();
//        System.out.print("\nnhap x: ");
//        x=sc.nextInt();
//        arr= chen(arr,v,x);
//        xuat(arr);



           arr=xoa(arr, 4);
           xuat(arr);
  }

}
