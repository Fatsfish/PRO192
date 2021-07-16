/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session05;

/**
 *
 * @author User
 */
public class Bike1 {
    int speed=90;
}
class Splender1 extends Bike1{
    int speed =100;
    public static void main(String args[]){
        Bike1 b= new Splender1();
        System.out.println(b.speed);
        
    }
}
    
