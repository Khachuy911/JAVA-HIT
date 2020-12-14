/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khac Huy
 */
import java.util.Scanner;

public class Customer{
    private String idAccount;
    private String nameAccount;
    private String NameFilm;

    public Customer() {
    }

    public Customer(String idAccount, String nameAccount, String NameFilm) {
        this.idAccount = idAccount;
        this.nameAccount = nameAccount;
        this.NameFilm = NameFilm;
    }

    public String getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(String idAccount) {
        this.idAccount = idAccount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public String getNameFilm() {
        return NameFilm;
    }

    public void setNameFilm(String NameFilm) {
        this.NameFilm = NameFilm;
    }
    
    

    public void InputCustomer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tài khoản(VIP giảm 10%): ");
        idAccount = sc.nextLine();
        System.out.print("Nhập tên tài khoản: ");
        nameAccount = sc. nextLine();
        System.out.println("Tên phim muốn đặt: ");
        NameFilm = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Customer{" + "idAccount=" + idAccount + "| nameAccount=" + nameAccount + "| NameFilm=" + NameFilm + '}';
    }

    

}
