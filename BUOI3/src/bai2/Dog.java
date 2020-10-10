/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Khac Huy
 */
public class Dog {
    private String name;
    private int MP = 100;
    
    public void InputName(String name){
        this.name = name;
    }
    public void ShowMP(){
        System.out.println(this.MP);
    }
    public void Bark(){
        if(this.name == " "){
            System.out.println("Xin lỗi bạn chưa điền tên!");
        }else{
            System.out.println(name + " gowgow !");
            this.MP = this.MP - 20;
        }
    }
}
