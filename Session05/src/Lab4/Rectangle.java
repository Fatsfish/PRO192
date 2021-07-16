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
public class Rectangle extends Shape {

    double width = 1.0;
    double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(double w, double l) {
        width = w;
        length = l;
    }

    public Rectangle(double w, double l, String c, boolean f) {
        super(c, f);
        width = w;
        length = l;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
                          System.out.println("Đây là hình chữ nhật");
        return "Màu sắc: " + color + "; Độ đầy: " + filled + "; Diện tích: " + getArea() + " đơn vị diện tích; Chu vi: " + getPerimeter()+" đơn vị dài";

    }

}
