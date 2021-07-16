/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Slide19 {

    int x = 1;

    public void M() {
        int t = 2; // Inner class chỉ truy xuất được biến local ở modifier final

        class Inner {

            int y = 3;

            void print() {
                System.out.println(y + x + t);
            }
        }

        Inner objInner = new Inner();

        objInner.print();
    }

    public static void main(String[] args) {
        Slide19 obj = new Slide19();
        obj.M();
    }
}
