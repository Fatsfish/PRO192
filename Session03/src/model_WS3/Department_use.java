/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_WS3;

/**
 *
 * @author User
 */
public class Department_use {

    public static void main(String[] args) {
        Department pb = new Department();
        pb.input();
        pb.display();
        System.out.println("Lương cao nhất phòng là: " + pb.getMaxSalary() + " USD");
    }

}
