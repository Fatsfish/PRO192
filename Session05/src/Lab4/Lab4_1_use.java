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
public class Lab4_1_use {

    public static void main(String[] args) {
        System.out.println("Bài lab kế thừa bài 1:");

        Rectangle c = new Rectangle(4, 8, "đỏ", true);
        System.out.println(c.toString());
        Circle a = new Circle(1, "xanh", false);
        System.out.println(a.toString());
        Square b = new Square(4, "Đen", false);
        System.out.println(b.toString());

    }
}
