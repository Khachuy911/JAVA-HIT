/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

/**
 *
 * @author Khac Huy
 */
public class RunMain {
    public static void main(String[] args) {
        Guns Ak47 = new Guns("AK47",60);
        Guns MP90 = new Guns("MP90",40);
        while(Ak47.getAmmoNumber()>0 && MP90.getAmmoNumber()>0){
            Ak47.Shoot(30);
            MP90.Shoot(20);
            
      
        if(Ak47.getAmmoNumber()<=0 && MP90.getAmmoNumber()<=0){
            System.out.println("GAME OVER");
            System.out.println("Hòa");
            break;
        }
        if(Ak47.getAmmoNumber()<=0){
            System.out.println("GAME OVER");
            System.out.println("MP90 WIN");
            break;
            
        }
        if(MP90.getAmmoNumber()<=0){
            System.out.println("GAME OVER");
            System.out.println("AK47 WIN");
            break;
        }
        
        Ak47.Load(10);
        MP90.Load(20);
        }
        
    }
}
