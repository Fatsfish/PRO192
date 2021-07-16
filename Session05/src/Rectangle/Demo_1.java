/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle;

/**
 *
 * @author User
 */
public class Demo_1 {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 5);
        System.out.println("Rectangle: " + r.toString());
        System.out.println("   Area: " + r.area());
        Box b = new Box(2, 2, 2);
        System.out.println("Box " + b.toString());
        System.out.println("   Area: " + b.area());
        System.out.println("   Volumn: " + b.volumn());

    }

}
