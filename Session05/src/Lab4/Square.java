/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

/**
 *
 * @author User
 */
public class Square extends Rectangle {

    double side;

    public Square() {

    }

    public Square(double s) {
        side = s;
    }

    public Square(double s, String c, boolean f) {
        super(s,s,c,f);
        side = s;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.width = side;
    }

    public void setLength(double side) {
        this.length = side;
    }

    public String toString() {
        System.out.println("Đây là hình vuông!");
        return "Màu sắc: " + color + "; Độ đầy: " + filled + "; Diện tích: " + getArea() + "đơn vị diện tích; Chu vi: " + getPerimeter()+" đơn vị dài";
    }

}
