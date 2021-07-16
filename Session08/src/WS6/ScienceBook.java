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
public class ScienceBook extends Book {

    public String type = "";

    public ScienceBook(String c, String t, String tt) {
        super(c, t);
        type = tt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void output() {
        System.out.println("Mã sách: " + code);
        System.out.println("Tên tựa đề: " + title);
        System.out.println("Tên thể loại: " + type);

    }

}
