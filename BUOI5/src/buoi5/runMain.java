/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi5;

import java.awt.Font;

/**
 *
 * @author Khac Huy
 */
public class runMain {
    public static void main(String[] args) {
       LopHoc room = new LopHoc();
       room.input();
//       room.filterKhoa();
       room.sortByKhoa();
       room.output();
    }
}
