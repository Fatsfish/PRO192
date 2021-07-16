/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Slide17 {

    int x = 5;

    class Inner1 {

        int y = 7;

        void M_Inner() {
            System.out.print(x + y);
        }
    }
    Inner1 inner = new Inner1();//Phải khai báo như vầy để khởi tạo biến ý nếu ko bị sai

    void M_Outer() {
        System.out.print(x + inner.y);//x+y sai vì ko khời tạo inner
    }

    public static void main(String[] args) {
        Slide17 obj = new Slide17();
        obj.M_Outer();
    }
}
