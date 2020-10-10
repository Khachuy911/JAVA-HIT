/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author Khac Huy
 */
public class RunMain {
    public static void main(String[] args) {
        HangHoa TiVi = new HangHoa(0123,"TiVi",7000000,2);
        TiVi.XuatPhieu();
        HangHoa Fan = new HangHoa();
        Fan.setTenHang("Fan");
        Fan.setSoLuong(3);
        Fan.setMaHang(911);
        Fan.setDonGia(400000);
        Fan.XuatPhieu();
    }
}
