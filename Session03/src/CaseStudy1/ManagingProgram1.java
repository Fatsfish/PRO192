
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

public class ManagingProgram1 {

    public static void main(String[] args) {
        Menu menu = new Menu(5);
        menu.add("Nhập mới một người");
        menu.add("Xóa một người");
        menu.add("Cập nhật thông tin một người");
        menu.add("In danh sách");
        menu.add("Thoát");
        String S;
        int choice;
        PersonList list = new PersonList(50);
        do {
            System.out.println("\n Quản lý nhân sự");
            choice = (int) menu.getChoice();
            switch (choice) {
                case 1:
                    list.add();
                    break;
                case 2:
                    list.print();
                    list.remove();
                    break;
                case 3:
                    list.print();
                    list.update();
                    break;
                case 4:
                    list.sort();
                    list.print();
                    break;
            }
            if (choice < 1 || choice > 5 && choice != 2108) {
                System.out.println("Chương trình không hỗ trợ tác vụ số này, mời khởi tạo lại chương trình mới hoặc nhập phím số 5 để thoát!");
            }
            if (choice == 2108) {
                System.out.println("Chương trình không hỗ trợ các ký tự khác số, để tiếp tục sử dụng chương trình, vui lòng chọn các phím menu từ 1-4 hoặc nhập phím 5 để thoát!");
            }
            //2108 là số mẫu cho vòng lập nếu nhập dữ liệu khác số
        } while (choice != 5 || choice == 2108);// Nếu muốn sử dụng vòng lập cho các số khác không thì sửa điều kiện lại isNumber(choice) && choice !=5
        if (choice == 5) {
            System.out.println("Cảm ơn bạn đã sử dụng chương trình! Have a good day!");
        }
    }
}
