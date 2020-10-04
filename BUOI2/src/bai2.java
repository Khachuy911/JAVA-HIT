
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khac Huy
 */
public class bai2 {
    public static void xuat(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void timmax__min(int[] arr){
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("\nmin la: "+min);
        System.out.println("max la: "+max);
    }
    public static void main(String[] args) {
        
        int[] arr = {1,2,4,5,3,6};
        xuat(arr);
        System.out.print("\nsau khi sap xep: ");
        Arrays.sort(arr);
        xuat(arr);
        timmax__min(arr);
    }
}
