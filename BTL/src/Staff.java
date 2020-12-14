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

public class Staff{
    private String idStaff;

    public Staff() {
    }

    public Staff(String idStaff) {
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
        return "Staff{" + "idStaff=" + idStaff +"|"+'}';
    }
}

