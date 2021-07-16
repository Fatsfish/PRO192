/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS6;

/*  
Author: Nguyễn Tuấn Khải MSSV: SE151228
   Date:  6/9/2020
   This class represents: Menu của case study  
 */
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Scanner;

public class Menu {

    String[] hints; // Biến số lựa chọn trong menu
    int n = 0; // Số hints hiện tại

    // Tạo mới 1 menu với số lượng thành phần
    public Menu(int size) {
        if (size < 1) {
            size = 10;
        }
        hints = new String[size];
    }

    // Thêm 1 hint
    public void add(String aHint) {
        if (n < hints.length) {
            hints[n++] = aHint;
        }
    }

    // Lấy lựa chọn của người dùng
    public double getChoice() {
        double result = 0;
        String R;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.println((i + 1) + "-" + hints[i]);
            }
            System.out.print("Hãy chọn 1 phương thức:  ");
            Scanner sc = new Scanner(System.in);
            R = sc.nextLine();
            if (!"".equals(R)) {
                if (isNumber(R)) {
                    result = Double.parseDouble(R); //Lấy lựa chọn của người dùng
                } else {
                    System.out.println("Số không hợp lệ mời nhập lại 1 số mới!");
                    System.out.println("Giá trị nhập vào phải là 1 số!");
                    result = 2108; //2108là số để lập lại đối với các trường hợp nhập lựa chọn ko hợp lệ
                }
            } else {
                System.out.println("giá trị nhập vào không hợp lệ mời nhập lại!");
            }
        }
        return result;
    }

    public static boolean isNumber(String a) {

        NumberFormat formatter = NumberFormat.getInstance();
        ParsePosition pos = new ParsePosition(0);
        formatter.parse(a, pos);
        return a.length() == pos.getIndex();

    }
}
