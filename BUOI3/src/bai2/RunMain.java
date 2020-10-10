/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bai2;
import bai2.Dog;
/**
 *
 * @author Khac Huy
 */
public class RunMain {
    public static void main(String[] args) {
        Dog osaka = new Dog();
        osaka.InputName("Osaka");
        for(int i=1;i<=3;i++){
            osaka.Bark();
            osaka.ShowMP();
        }
    }
}
