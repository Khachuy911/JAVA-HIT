
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
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int sum=0,count=0;
        for(int i=0;i<text.length();i++){
            int x=(int)text.charAt(i);
            if(x>= 48 && x<=57){
                sum+=x-48;
                count++;
            }
        }
        float tbc=(float) sum/count;
        System.out.println("TBC= " + tbc);
    }
}
