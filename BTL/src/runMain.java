
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.codegen.CompilerConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Khac Huy
 */
public class runMain {

    public static Film convert(String data) {
        String[] a = data.split("\\|");
        Film phim = new Film(Integer.parseInt(a[0]), a[1], a[2], a[3], a[4], a[5], a[6], Long.parseLong(a[7]), a[8]);
        return phim;
    }

    public static List<Film> readFile(String fileName) {
        List<Film> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(Paths.get(fileName));
            while (sc.hasNext()) {
                String readData = sc.nextLine();
                list.add(convert(readData));

            }
        } catch (IOException ex) {
            Logger.getLogger(runMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static void writeFile(List<Film> list) {
        try {
            FileWriter filewriter = new FileWriter("dataFilm.txt", false);
            BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            for (int i = 0; i < list.size(); i++) {
                printWriter.println(list.get(i).getIdFilm()
                        + "|" + list.get(i).getFilmName()
                        + "|" + list.get(i).getCategory()
                        + "|" + list.get(i).getNationalProduct()
                        + "|" + list.get(i).getShowDate()
                        + "|" + list.get(i).getTime()
                        + "|" + list.get(i).getLanguage()
                        + "|" + list.get(i).getPrice()
                        + "|" + list.get(i).getFilmStatus());
            }
            printWriter.close();
            bufferedWriter.close();
            filewriter.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static boolean checkId(List<Film> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getIdFilm()) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIDStaff() {
        Scanner sc = new Scanner(System.in);
        Staff nv1 = new Staff();
        nv1.InputStaff();
        for (int i = 0; i < nv1.getIdStaff().length(); i++) {
            if (nv1.getIdStaff().charAt(0) == 'N' || nv1.getIdStaff().charAt(0) == 'n') {
                return true;
            }
        }
        return false;

    }

    public static void AddFilm(List<Film> list) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập số lượng phim muốn thêm: ");
        n = sc.nextInt();
        List<Film> CkeckList = new ArrayList<>();
        CkeckList = readFile("dataFilm.txt");
        System.out.println("Kiem tra id Film: ");
        int id = sc.nextInt();
        if (checkId(CkeckList, id)) {
            for (int i = 0; i < n; i++) {
                Film phim = new Film();
                phim.InputFilm();
                list.add(phim);
            }
        } else {
            System.out.println("Id đã tồn tại !");
            menuStaff(list);
        }
        try {
            FileWriter filewriter = new FileWriter("dataFilm.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            for (int i = 0; i < list.size(); i++) {
                printWriter.println(list.get(i).getIdFilm()
                        + "|" + list.get(i).getFilmName()
                        + "|" + list.get(i).getCategory()
                        + "|" + list.get(i).getNationalProduct()
                        + "|" + list.get(i).getShowDate()
                        + "|" + list.get(i).getTime()
                        + "|" + list.get(i).getLanguage()
                        + "|" + list.get(i).getPrice()
                        + "|" + list.get(i).getFilmStatus());
            }
            printWriter.close();
            bufferedWriter.close();
            filewriter.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void ShowFilm(List<Film> list) {
        try {
            File file = new File("dataFilm.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String conten = sc.nextLine();
                System.out.println(conten);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void deleteFilm(List<Film> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id phim muốn xóa: ");
        int n = sc.nextInt();
        list = readFile("dataFilm.txt");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdFilm() == n) {
                list.remove(list.get(i));
            }
        }
        writeFile(list);

    }

    public static void updateFilm(List<Film> list) {
        Scanner sc = new Scanner(System.in);
        list = readFile("dataFilm.txt");
        System.out.println("Nhập id phim muốn cập nhật: ");
        int id = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdFilm() == id) {
                list.get(i).InputFilm();
            }
        }
        writeFile(list);
    }

    public static void menuStaff(List<Film> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You Want: ");
        System.out.println("1.Show Film");
        System.out.println("2.Add Film");
        System.out.println("3.Delete Film");
        System.out.println("4.Update Film");
        System.out.println("5.Exit");
        int n1 = sc.nextInt();
        switch (n1) {
            case 1: {
                ShowFilm(list);
                menuStaff(list);
                break;
            }
            case 2: {
                AddFilm(list);
                menuStaff(list);
                break;
            }
            case 3: {
                deleteFilm(list);
                menuStaff(list);
                break;
            }
            case 4: {
                updateFilm(list);
                menuStaff(list);
                break;
            }
            case 5: {
                menuMain(list);
            }
            default: {
                System.out.println("Error Option !");
                System.exit(0);
            }
        }
    }

    public static void Bill(List<Film> list) {
        Scanner sc = new Scanner(System.in);
        Customer ct1 = new Customer();
        System.out.println("Nhập ID phim muốn đặt (0 để exit): ");
        int id = sc.nextInt();
        list = readFile("dataFilm.txt");
        double sum = 0;
        int count = 0;
        for (int j = 0; j < list.size(); j++) {
            if (id == list.get(j).getIdFilm()) {
                ct1.InputCustomer();
                for (int i = 0; i < ct1.getIdAccount().length(); i++) {
                    if (ct1.getIdAccount().charAt(0) == 'V' || ct1.getIdAccount().charAt(0) == 'v') {
                        count++;
                        sum = list.get(j).getPrice() - (list.get(j).getPrice() * 0.1);
                    } else {
                        sum = list.get(j).getPrice();
                    }
                }
                System.out.println("***********");
                System.out.println("* HÓA ĐƠN *");
                System.out.println("***********");
                System.out.println("ID phim: " + list.get(j).getIdFilm());
                if (count > 0) {
                    System.out.println("ID tài khoản(VIP): " + ct1.getIdAccount());
                    System.out.println("Thành tiền(Đã giảm 10%): " + sum);
                } else {
                    System.out.println("ID tài khoản(Nomal): " + ct1.getIdAccount());
                    System.out.println("Thành tiền: " + sum);
                }
                System.out.println("CẢM ƠN QUÝ KHÁCH >.<");

            }
            if (id == 0) {
                menuCustomer(list);
            }
        }

    }

    public static void SortByName(List<Film> list) {
        list = readFile("dataFilm.txt");
        for (int i = 0; i < list.size(); i++) {
            Collections.sort(list, new sortByName());
        }
        System.out.println(list);
    }

    public static void SortByMoney(List<Film> list) {
        list = readFile("dataFilm.txt");
        for (int i = 0; i < list.size(); i++) {
            Collections.sort(list, new sortByMoney());
        }
        System.out.println(list);
    }

    public static void filterByCategory(List<Film> list) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        list = readFile("dataFilm.txt");
        System.out.println("Nhập thể loại: ");
        String tl = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (tl.compareTo(list.get(i).getCategory())==0) {
                System.out.println(list.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có thể loại phim này !");
        }
    }

    public static void filterByNational(List<Film> list) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        list = readFile("dataFilm.txt");
        System.out.println("Nhập Quốc gia của phim: ");
        String qg = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (qg.compareTo(list.get(i).getNationalProduct())==0) {
                System.out.println(list.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có thể loại phim này !");
        }
    }

    public static void SearchFilm(List<Film> list){
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Nhập tên phim: ");
        String name = sc.nextLine();
        System.out.println("Nhập quốc gia của phim: ");
        String qg = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if(name.compareTo(list.get(i).getFilmName())==0 && qg.compareTo(list.get(i).getNationalProduct())==0){
                count++;
                System.out.println(list.get(i));
            }
        }
        if(count==0){
            System.out.println("Không tồn tại phim trong kho !");
        }
    }
    
    public static void menuCustomer(List<Film> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**Welcom to the Cinema*****");
        System.out.println("1.Show Film");
        System.out.println("2.Sort Film by Name(A-Z)");
        System.out.println("3.Sort Film by Money(1-9999)");
        System.out.println("4.Filter Film by Category");
        System.out.println("5.Filter Film by National");
        System.out.println("6.Search Film by Name & National");
        System.out.println("7.Exit");
        System.out.println("You option: ");
        int option = sc.nextInt();
        switch (option) {
            case 1: {
                ShowFilm(list);
                Bill(list);
                break;
            }
            case 2: {
                SortByName(list);
                Bill(list);

                break;
            }
            case 3: {
                SortByMoney(list);
                Bill(list);
                break;
            }
            case 4: {
                filterByCategory(list);
                Bill(list);
                break;
            }
            case 5: {
                filterByNational(list);
                Bill(list);
                break;
            }
            case 6:{
                SearchFilm(list);
                Bill(list);
                break;
            }
            case 7: {
                System.exit(0);
            }
            default: {
                System.out.println("Lựa chọn sai !");
                break;
            }
        }
    }

    public static void menuMain(List<Film> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**MENU**********");
        System.out.println("1.Manage Film");
        System.out.println("2.Buy Ticket");
        System.out.println("You want: ");
        int n = sc.nextInt();
        switch (n) {
            case 1: {
                if (checkIDStaff()) {
                    menuStaff(list);
                } else {
                    System.out.println("Mã Nhân Viên Không Hợp Lệ !");
                    menuMain(list);
                }
                break;
            }
            case 2: {
                menuCustomer(list);
                menuMain(list);
                break;
            }
            case 3: {
                System.exit(0);
            }
            default: {
                System.out.println("Error Option !");
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        List<Film> list = new ArrayList<>();
        menuMain(list);

    }
}
