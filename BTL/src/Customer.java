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

public class Customer extends Person{
    private String idAccount;
    private String nameAccount;

    public Customer() {
    }

    public Customer(String name, int age, String address, String idAccount, String nameAccount) {
        super(name, age, address);
        this.idAccount = idAccount;
        this.nameAccount = nameAccount;
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

    public void InputCustomer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tài khoản(VIP giảm 10%): ");
        idAccount = sc.nextLine();
        System.out.print("Nhập tên tài khoản: ");
        nameAccount = sc. nextLine();
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "idAccount='" + idAccount + '\'' +
                ", nameAccount='" + nameAccount + '\'' +
                '}';
    }
}
