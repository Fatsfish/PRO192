/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import WS6.Menu;
import static WS6.Menu.isNumber;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class CollectionLab {

    public static void main(String[] args) {
        Random rd = new Random();
        Vector v = new Vector();
        int max = -1000;
        int Sum = 0;
        int n = 10;
        int r = 0;
        v.setSize(10);
        System.out.println(v);
        for (int i = 0; i < v.size(); i++) {
            v.set(i, rd.nextInt(2001) - 1000);
        }
        for (int i = 0; i < v.size(); i++) {
            max = (int) v.get(i) > max ? (int) v.get(i) : max;
            Sum += (int) v.get(i);
        }
        System.out.println("Chuoi random:" + v);
        System.out.println("Gia tri max: " + max);
        System.out.println("Tong các giá trị: " + Sum);
        for (int i = 0; i < v.size(); i++) {
            for (int j = v.size() - 1; j >= i; j--) {
                if ((int) v.get(j) < 0) {
                    v.remove(v.get(j));
                }
            }
        }
        System.out.println("Chuoi mới sau khi bỏ số âm: " + v);
        for (int i = 0; i < v.size(); i++) {
            for (int j = v.size() - 1; j > i; j--) {
                r = (int) v.get(j - 1);
                v.set(j - 1, v.get(j));
                v.set(j, r);
            }
        }
        System.out.println("Lật chuỗi lại thành: " + v);
        int a = 0;
        for (int i = 0; i < v.size(); i++) {
            for (int j = v.size() - 1; j > i; j--) {
                if ((int) v.get(j) < (int) v.get(j - 1)) {
                    r = (int) v.get(j - 1);
                    v.set(j - 1, v.get(j));
                    v.set(j, r);
                }
            }
        }
        System.out.println("Sau khi sort: " + v);
        System.out.println("Tìm số có tổng bằng 2 số liền kề trước:");
        for (int i = 2; i < v.size(); i++) {
            if ((int) v.get(i) == (int) v.get(i - 1) + (int) v.get(i - 2)) {
                System.out.println("Số thỏa điều kiền ở vị trí " + i + ": " + v.get(i));

            } else {
                System.out.println("Số ở " + i + " không thỏa điều kiện!");
            }
        }
    }
}

class Lab2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("PHP");
        list.add("C++");
        list.add("Java");
        list.add("Java");
        System.out.println(list);
        System.out.println("List: " + list.size());
        System.out.println(list.contains("PHP"));
        System.out.println("Vi tri cuoi cung cua \"java\": " + list.lastIndexOf("Java"));
    }
}

class Lab3 {

    public static void main(String[] args) {
        HashMap mymap = new HashMap();
        mymap.put(1, "One");
        mymap.put(2, "Two");
        mymap.put(3, "Three");
        mymap.put(4, "Four");
        System.out.println("Từ điển chỉ gồm 4 chữ số để tra:\"1\", \"2\", \"3\", \"4\"!");
        System.out.println(mymap);
        Menu menu = new Menu(2);
        menu.add("Tìm số");
        menu.add("Thoát");
        int choice;
        do {
            System.out.println("\n Bài Lab Collection:");
            choice = (int) menu.getChoice();
            switch (choice) {
                case 1:
                    String a;
                    int d = 0;
                    do {
                        System.out.println("Nhập vào giá trị tìm:");
                        Scanner sc = new Scanner(System.in);
                        a = sc.nextLine();
                        if (!"".equals(a)) {
                            if (isNumber(a)) {
                                d = (int) Double.parseDouble(a);
                                if (mymap.containsKey(d)) {
                                    System.out.println(d + ": " + mymap.get(d));
                                } else {
                                    System.out.println("giá trị tìm không có:");
                                }
                            } else {
                                System.out.println("tác vụ không hỗ trợ ký tự này, mời nhập lại!");
                            }
                        } else {
                            System.out.println("ký tự trống, mời nhập lại!");
                        }
                    } while ("".equals(a) || !isNumber(a) || d < 1 || d > 4);
                    break;
            }
            if (choice < 1 || choice > 2 && choice != 2108) {
                System.out.println("Chương trình không hỗ trợ tác vụ số này, mời khởi tạo lại chương trình mới hoặc nhập phím số 2 để thoát!");
            }
            if (choice == 2108) {
                System.out.println("Chương trình không hỗ trợ các ký tự khác số, để tiếp tục sử dụng chương trình, vui lòng chọn các phím menu từ 1 hoặc nhập phím 2 để thoát!");
            }
            //2108 là số mẫu cho vòng lập nếu nhập dữ liệu khác số
        } while (choice != 2 || choice == 2108);// Nếu muốn sử dụng vòng lập cho các số khác không thì sửa điều kiện lại isNumber(choice) && choice !=5
        if (choice == 2) {
            System.out.println("Cảm ơn bạn đã sử dụng chương trình! Have a good day!");
        }
    }
}
