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

public class Staff extends Person {
    private String idStaff;

    public Staff() {
    }

    public Staff(String name, int age, String address, String idStaff) {
        super(name, age, address);
        this.idStaff = idStaff;
    }

    public String getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(String idStaff) {
        this.idStaff = idStaff;
    }

    public void InputStaff(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        idStaff = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Staff{" + super.toString() +
                "idStaff='" + idStaff + '\'' +
                '}';
    }
}

