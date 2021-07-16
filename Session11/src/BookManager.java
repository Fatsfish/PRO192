import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class BookManager {

    public static void main(String[] args) {
        String filename = "book.dat";
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu(4);
        menu.add("View books");
        menu.add("Add new book");
        menu.add("Save to file");
        menu.add("Quit");
        double choice;
        BookList list = new BookList();
        list.loadBookFromFile(filename);
        do {
            System.out.println("\nBOOK MANAGER");
            choice = menu.getChoice();
            switch ((int) choice) {
                case 1: list.print(); break;
                case 2: list.addNewBook();break;
                case 3: list.saveToFile(filename); break;
                case 4: System.out.println("Thank you for using the program, have a good day!");
            }
             if (choice < 1 || choice > 4 && choice != 2108) {
                System.out.println("Chương trình không hỗ trợ tác vụ số này, mời khởi tạo lại chương trình mới hoặc nhập phím số 4 để thoát!");
            }
            if (choice == 2108) {
                System.out.println("Chương trình không hỗ trợ các ký tự khác số, để tiếp tục sử dụng chương trình, vui lòng chọn các phím menu từ 1-3 hoặc nhập phím 4 để thoát!");
            }
            //2108 là số mẫu cho vòng lập nếu nhập dữ liệu khác số
        } while ( choice !=4 || choice ==2108);
    }
}