/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author Khac Huy
 */
public class Guns {
    private String weaponName;
    private int ammoNumber;
    
    public Guns(){
        
    }
    public Guns(String weaponName, int ammoNumbers){
        this.weaponName=weaponName;
        this.ammoNumber=ammoNumbers;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getAmmoNumber() {
        return ammoNumber;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }
    
    
    public void Load(int x){
       this.ammoNumber+=x;
    }
    public void Shoot(int x){
        if(this.ammoNumber-x>=0){
         this.ammoNumber-=x;
        if(this.ammoNumber==0){
        System.out.println(weaponName + " Hết đạn !");
        }
        }else {
            System.out.println(weaponName + " Thiếu đạn để bắn !");
            this.ammoNumber=0;
        }
    }
        
        
}
