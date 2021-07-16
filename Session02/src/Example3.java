/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Example3 {
    public static void main(String[] args){
            int a=2;
            int b=3;
            if((a<10)&&(b>5)){
                System.out.println("True");
            }   else{
                System.out.println("False");
            }
             if((a<10)||(b>5)){
                System.out.println("True");
            }   else{
                System.out.println("False");
            }
    }       
}
/* nếu dùng 1 dấu &hoặc| hay 2 dấu && hoặc || thì kết quả vẫn như nhau - xem thêm bảng true table */