/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseStudy1;

/*  
Author: Nguyễn Tuấn Khải MSSV: SE151228
   Date:  6/9/2020
   This class represents: Menu của case study  
 */
import static Lab1.Lab1_1.isNumber;
import java.util.Scanner;

public class Person {

    private String code = "", name = "";
    private int age = 0;

    public Person() {
    }

    //Constructor
    public Person(String c, String n, int a) {
        code = c;
        name = n;
        age = a > 0 ? a : 0;
    }

    // Getters and Setters - Lấy và Gán
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Phương thức nhập thông tin của 1 người
    public void input() {
        String testAge;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã của người được nhập: ");
        code = sc.nextLine();
        System.out.print("Nhập tên của người được nhập: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi của người được nhập: ");
        testAge = sc.nextLine().toUpperCase();
        isNumber(testAge);
        if (isNumber(testAge)) {
            age = (int) Double.parseDouble(testAge);
        } else {
            System.out.println("Tuổi không hợp lệ, tuổi mặc định là 0 đã được khởi tạo!");
            System.out.println("Mời nhập lại tuổi mới bằng phương thức chọn menu cập nhật!");
            age = 0;
        }
    }

    // Phương thức xuất
    public String toString() {
        return "Mã người dùng: " + code + "; Tên người dùng: " + name + "; Tuổi người dùng: " + age;
    }
}
