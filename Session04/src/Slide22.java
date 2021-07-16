/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Slide22 {
    
    public int x = 0;
    
    class FirstLevel {
        
        public int x = 1;//Shadowing

        void methodinFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + Slide22.this.x);
        }
    }

    public static void main(String... args) {
        Slide22 st = new Slide22();
        Slide22.FirstLevel f1 = st.new FirstLevel();
        f1.methodinFirstLevel(2108);
    }
}
