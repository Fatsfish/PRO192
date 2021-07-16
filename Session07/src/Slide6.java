/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
/*  public static void main(String[] args) {
        int x = 5, y = 0;
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            y = 2;
            System.out.println(e);
        } finally {
            System.out.println(x / y);
            System.out.println("Hello");
        }

    }*/
public class Slide6 {
    public int divide1(int a, int b)throws ArithmeticException{
        return a/b;
    }
    public int divide2( int a,int b){
        if(b==0)throw new ArithmeticException("Hey. Dominator:0");
        return a/b;
    }
    public static void main(String[] args){
        Slide6 a= new Slide6();
        try {
            System.out.println(a.divide1(9,0));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }


}
