
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
public class bai4 {
    public static boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void xuat(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i]+ " ");       
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float s=0;
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int[] prime = new int[10];
        int index=0;
        for (int i = 0; i < 25; i++) {
           
            if(isPrime(i)){
                prime[index++]=i;
               
            }
        }
        for(int i=0;i<arr.length;i++){
        s += (isPrime(arr[i]) ? arr[i] + prime[i]-i : arr[i]);
    }
        System.out.println("KQ= "+s);
    }

}
