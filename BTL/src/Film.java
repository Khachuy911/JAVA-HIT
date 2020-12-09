
import java.util.Scanner;

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

public class Film {
    private int idFilm;
    private String filmName;
    private String category;
    private String nationalProduct;
    private String showDate;
    private String time;
    private String language;
    private long price;
    private String filmStatus;

    public Film() {
    }

    public Film(int idFilm, String filmName, String category, String nationalProduct, String showDate, String time, String language, long price, String filmStatus) {
        this.idFilm = idFilm;
        this.filmName = filmName;
        this.category = category;
        this.nationalProduct = nationalProduct;
        this.showDate = showDate;
        this.time = time;
        this.language = language;
        this.price = price;
        this.filmStatus = filmStatus;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public String getFilmName() {
        return filmName;
    }

    public String getCategory() {
        return category;
    }


    public String getNationalProduct() {
        return nationalProduct;
    }

    public String getShowDate() {
        return showDate;
    }

    public String getTime() {
        return time;
    }

    public String getLanguage() {
        return language;
    }

    public long getPrice() {
        return price;
    }

    public String getFilmStatus() {
        return filmStatus;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public void setNationalProduct(String nationalProduct) {
        this.nationalProduct = nationalProduct;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setFilmStatus(String filmStatus) {
        this.filmStatus = filmStatus;
    }

    public void InputFilm(){      
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập lại id phim: ");
        idFilm = sc.nextInt();
        System.out.print("Nhập tên phim: ");
        sc.nextLine();
        filmName = sc.nextLine();
        System.out.print("Nhập thể loại: ");
        category = sc.nextLine();
        System.out.print("Nhập quốc gia sản xuất: ");
        nationalProduct = sc.nextLine();
        System.out.print("Nhập ngày chiếu: ");
        showDate = sc.nextLine();
        System.out.print("Nhập giờ chiếu: ");
        time = sc.nextLine();
        System.out.print("Nhập ngôn ngữ: ");
        language = sc.nextLine();
        System.out.print("Nhập giá tiền: ");
        price = sc.nextLong();
        System.out.print("Nhập tình trạng phim: ");
        sc.nextLine();
        filmStatus = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Film: " +
                "ID= " + idFilm +
                " | Name= '" + filmName + '\'' +
                " | Category= '" + category + '\'' +
                " | National= '" + nationalProduct + '\'' +
                " | Show Date= '" + showDate + '\'' +
                " | Time= " + time +
                " | Language= '" + language + '\'' +
                " | Price= " + price +
                " | FilmStatus= '" + filmStatus + '\'' +
                "  \n";
    }
}