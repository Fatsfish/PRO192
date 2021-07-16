/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS6;

/**
 *
 * @author User
 */
public class DetectiveBook extends Book {
    public double price;
    public int year;
    public DetectiveBook(String c, String t, double p, int y){
        super(c,t);
        price =p >=0? p: 0;
        year = y>= 300? y:300;
    }
     public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void output() {
        System.out.println("Mã sách: " + code);
        System.out.println("Tên tựa đề: " + title);
        System.out.println("Giá: " + price);
        System.out.println("Năm phát hành: " + year);
    }
}
    