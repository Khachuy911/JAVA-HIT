
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
    
    public static void menu(int []arr){
        Scanner sc = new Scanner(System.in);
        int v,x;
        System.out.println("\nMENU:");
        System.out.println("1.Hiển thị");
        System.out.println("2.Chèn mảng");
        System.out.println("3.Xóa 1 phần tử");
        System.out.println("4.Đảo ngược mảng");
        System.out.println("5.Các số chia hết cho a[i]");
        System.out.println("6.Exit");
        int option ;
        option= sc.nextInt();
        switch(option){
            case 1:{
                System.out.print("\nMảng là: ");
                xuat(arr);
                menu(arr);
                break;       
            }
            case 2:{
                System.out.print("\nnhap v: ");
                v=sc.nextInt();
                System.out.print("\nnhap x: ");
                x=sc.nextInt();
                arr= chen(arr,v,x);
                xuat(arr);
                menu(arr);
                break;
            }
            case 3:{
                System.out.print("\nnhap v: ");
                v=sc.nextInt();
                arr=xoa(arr, v);
                xuat(arr);
                menu(arr);
                break;
            }
            case 4:{
                dao(arr);
                menu(arr);
                break;
            }
            case 5:{
               mumbersFilter(arr); 
               menu(arr);
               break;
            }
            case 6:{
                break;
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
        menu(arr);
  }

}
