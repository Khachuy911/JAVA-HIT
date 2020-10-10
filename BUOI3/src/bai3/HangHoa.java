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
public class HangHoa {
    private int MaHang;
    private String TenHang;
    private double DonGia;
    private int SoLuong;
    
    public HangHoa(){
    }
    
    public HangHoa(int MaHang, String TenHang, double DonGia, int SoLuong){
        this.TenHang=TenHang;
        this.SoLuong=SoLuong;
        this.MaHang=MaHang;
        this.DonGia=DonGia;
    }

    public int getMaHang() {
        return MaHang;
    }

    public void setMaHang(int MaHang) {
        this.MaHang = MaHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
    public void XuatPhieu(){
        System.out.println("Mã hàng là: " + MaHang);
        System.out.println("Tên hàng là: " + TenHang);
        System.out.println("Thành tiền: " + DonGia*SoLuong + " (VND)");
    }
}
