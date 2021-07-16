/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_WS3;

import static CaseStudy1.PersonList.checkName;
import static Lab1.Lab1_1.isNumber;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Employee {

    private String code;
    private String surName;
    private String firstName;
    double salary;

    public Employee() {
    }

    public double income() {
        return salary * 12;
    }

    // Phương thức nhập thông tin của 1 người
    public void input() {
        String testSalary;
        Scanner sc = new Scanner(System.in);
        int N; //Biến kiểm tra tên có hợp lệ?

        System.out.print("Nhập mã của người được nhập: ");
        code = sc.nextLine().toUpperCase();
        do {
            System.out.print("Nhập họ của người được nhập: ");
            surName = sc.nextLine().toUpperCase();
            N = checkName(surName);
            if (N == 1) {
                System.out.println("Tên hợp lệ!");
            }
            if (N == 0) {
                System.out.println("Tên có chứa ký tự không hợp lệ, mời nhập lại!");
            }
        } while (N == 0);
        do {
            System.out.print("Nhập tên của người được nhập: ");
            firstName = sc.nextLine().toUpperCase();
            N = checkName(firstName);
            if (N == 1) {
                System.out.println("Tên hợp lệ!");
            }
            if (N == 0) {
                System.out.println("Tên có chứa ký tự không hợp lệ, mời nhập lại!");
            }
        } while (N == 0);
        System.out.print("Nhập lương của người được nhập: ");
        testSalary = sc.nextLine().toUpperCase();
        if (isNumber(testSalary)) {
            if (Double.parseDouble(testSalary) >= 0) {
                salary = (int) Double.parseDouble(testSalary);
            } else {
                System.out.println("Lương không hợp lệ, Lương mặc định là 0 đã được khởi tạo!");
                salary = 0;
            }
        } else {
            System.out.println("Lương không hợp lệ, Lương mặc định là 0 đã được khởi tạo!");
            salary = 0;

        }
    }
    // Phương thức xuất

    public void display() {
        System.out.println("Thông tin nhân viên " + surName + " " + firstName);
        System.out.println("Mã nhân viên: " + code);
        System.out.println("Lương: " + salary + " USD");
        System.out.println("Tổng thu nhập: " + income() + " USD");
    }
}
