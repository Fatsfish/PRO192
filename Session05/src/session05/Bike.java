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
public class Bike {
    void run(){
        System.out.println("Đang chạy");
    }
    
}
class Splender extends Bike{
    @Override
    void run(){
        System.out.println("Chạy an toàn với 60 km");
    }
    public static void main(String[] args){
        Bike b= new Splender();
        b.run();
    }
}