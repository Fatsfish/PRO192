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
public class Book {
    public String code = "", title = "";


    //Constructor
    public Book(String c, String t) {
        code = c;
        title = t;
    }

    // Getters and Setters - Lấy và Gán
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void output() {
        System.out.println("Mã sách: " + code);
        System.out.println("Tên tựa đề: " + title);
    }
    
}
