
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Book implements Serializable {

    public double price;
    public String title = "";

    //Constructor
    public Book(double p, String t) {
        price = p;
        title = t;
    }

    // Getters and Setters - Lấy và Gán
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void output() {
        System.out.println("Tên tựa đề: " + title);
        System.out.println("Giá sách: " + price);
    }

}
