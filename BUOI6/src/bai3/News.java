/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Khac Huy
 */
public class News implements INews{
    private int Id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void Display() {
        System.out.println("Title: " + title);
        System.out.println("PublishDate: " + publishDate);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
        System.out.println("AverageRate: " + averageRate);
    }
    int[] rateList = new int[3];
    public void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap title: ");
        title = sc.nextLine();
        System.out.println("Nhap publishDate: ");
        publishDate =sc.nextLine();
        System.out.println("Nhap author: ");
        author = sc.nextLine();
        System.out.println("Nhap content: ");
        content = sc.nextLine();
        System.out.println("Nhap 3 danh gia: "); 
        for(int i=0;i<3;i++){
            System.out.println("Danh gia so "+ i+1 +" la: " );
            rateList[i]=sc.nextInt();
        }
        
    }
    
    public double Calculate(){
        averageRate =0;
        int count=0;
        for(int i=0;i<3;i++){
            averageRate+=rateList[i];
            count++;
        }
        return (double) averageRate/count;
    }
    
    
    
}
