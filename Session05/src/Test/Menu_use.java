/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author User
 */
public class Menu_use {

    public static void main(String[] args) {
        Menu menu = new Menu(9);
        menu.add("Test1.");
        menu.add("Test2.");
        menu.add("Test3.");
        menu.add("Test4.");
        menu.add("Test5.");
        menu.add("Test6.");
        menu.add("Test7.");
        menu.add("Test8.");
        menu.add("Thoát");
        int choice;
        do {
            System.out.println("\n Quản lý bài test chap 5");
            choice = (int) menu.getChoice();
            switch (choice) {
                case 1:
                    Test1 t1 = new Test1();
                    System.out.println("Kết quả là: AB + Compile Error");
                    break;
                case 2:
                    Test2 t2 = new Test2();
                    System.out.println("Kết quả là: AB + Compile Error");
                    break;
                case 3:
                    Test3 t3 = new Test3();
                    System.out.println("Kết quả là: AB + Compile Error");
                    break;
                case 4:
                    Test4 t4 = new Test4();
                    System.out.println("Kết quả là: ABC");
                    break;
                case 5:
                    Test5 t5 = new Test5();
                    System.out.println("Kết quả là: C + Compile Error");
                    break;
                case 6:
                    Test6 t6 = new Test6();
                    System.out.println("Kết quả là: A120");
                    break;
                case 7:
                    Test7 t7 = new Test7();
                    System.out.println("Kết quả là: A7 + Compile Error");
                    break;
                case 8:
                    Test8 t8 = new Test8();
                    System.out.println("Kết quả là: A12 + Compile Error");
                    break;
                default:
                    System.out.println("Phương thức không hỗ trợ mời nhập lại!");
                    break;
            }
            if (choice < 1 || choice > 9 && choice != 2018) {
                System.out.println("Chương trình không hỗ trợ tác vụ số này, mời khởi tạo lại chương trình mới hoặc nhập phím số 9 để thoát!");
            }
            if (choice == 2108) {
                System.out.println("Chương trình không hỗ trợ các ký tự khác số, để tiếp tục sử dụng chương trình, vui lòng chọn các phím menu từ 1-4 hoặc nhập phím 5 để thoát!");
            }
            //2108 là số mẫu cho vòng lập nếu nhập dữ liệu khác số
        } while (choice != 9 || choice == 2108);// Nếu muốn sử dụng vòng lập cho các số khác không thì sửa điều kiện lại isNumber(choice) && choice !=5
        if (choice == 9) {
            System.out.println("Cảm ơn bạn đã sử dụng chương trình! Have a good day!");
        }
    }
}
