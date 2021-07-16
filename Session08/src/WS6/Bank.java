/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS6;

import WS6.Menu;
import static WS6.Menu.isNumber;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Bank {

    private Account[] arr = null;
    private VIPAccount[] arrV = null;
    private BusinessAccount[] arrB = null;
    private int count, countB, countV;

    public Bank() {
        arr = new Account[100];
        arrV = new VIPAccount[100];
        arrB = new BusinessAccount[100];
    }

    int find(String aCode) {
        for (int i = 0; i < count; i++) {
            if (aCode.equals(arr[i].getCode())) {
                return i;
            }
        }
        return -1;
    }

    public static int checkName(String name) {
        int cn = 0;
        if (!"".equals(name)) {
            for (int i = 0; i < name.length(); i++) {
                char NN = name.charAt(i);
                //Khai báo tên chỉ nhận ký tự chữ
                if (Character.isLetter(NN)) {
                    cn++;
                }
                if (NN == ' ') {
                    if (name.matches("\\W*")) {
                        cn--;
                    }
                    cn++;
                }
            }
            if (cn == name.length()) {
                return 1;
            }
        } else {
            return 0;
        }
        return 0;
    }

    public void add() {
        if (count == arr.length) {
            System.out.println("Danh sách đầy!");
        } else {
            String newCode, newName;
            String testB, testV, testBB;
            boolean promotion = false;
            double balance = 0;
            boolean V;
            //Nhập mới thông tin
            Scanner sc = new Scanner(System.in);
            int pos; // Biến kiểm tra lệnh mới có trùng hay không
            int N; //Biến kiểm tra tên có hợp lệ?
            do {
                System.out.print("Nhập mã của tài khoản: ");
                newCode = sc.nextLine().toUpperCase();
                pos = find(newCode);
                if (!"".equals(newCode)) {
                    if (pos >= 0) {
                        System.out.println("\t Mã này đã bị trùng");
                    }
                } else {
                    System.out.println("\t Mã này không hợp lệ mời nhập lại!");
                }
            } while (pos >= 0 || "".equals(newCode));
            do {
                System.out.print("Nhập tên của người được nhập: ");
                newName = sc.nextLine().toUpperCase();
                N = checkName(newName);
                if (N == 1) {
                    System.out.println("Tên hợp lệ!");
                }
                if (N == 0) {
                    System.out.println("Tên có chứa ký tự không hợp lệ, mời nhập lại!");
                }
            } while (N == 0);
            do {
                System.out.print("Nhập số dư của tài khoản được nhập: ");
                testB = sc.nextLine().toUpperCase();
                if (!"".equals(testB)) {
                    if (isNumber(testB)) {
                        if (Double.parseDouble(testB) >= 0) {
                            balance = (int) Double.parseDouble(testB);
                        } else {
                            System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                        }
                    } else {
                        System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                    }
                } else {
                    System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                }
            } while (balance < 0 || !isNumber(testB) || "".equals(testB));
            arr[count++] = new Account(newCode, newName, balance);
        }
    }

    public void addVIP() {
        if (count == arr.length) {
            System.out.println("Danh sách đầy!");
        } else {
            String newCode, newName;
            String testB, testV, testBB;
            boolean promotion = false;
            double balance = 0;
            int tv = -1;
            //Nhập mới thông tin
            Scanner sc = new Scanner(System.in);
            int pos; // Biến kiểm tra lệnh mới có trùng hay không
            int N; //Biến kiểm tra tên có hợp lệ?
            do {
                System.out.print("Nhập mã của tài khoản: ");
                newCode = sc.nextLine().toUpperCase();
                pos = find(newCode);
                if (!"".equals(newCode)) {
                    if (pos >= 0) {
                        System.out.println("\t Mã này đã bị trùng");
                    }
                } else {
                    System.out.println("\t Mã này không hợp lệ mời nhập lại!");
                }
            } while (pos >= 0 || "".equals(newCode));
            do {
                System.out.print("Nhập tên của người được nhập: ");
                newName = sc.nextLine().toUpperCase();
                N = checkName(newName);
                if (N == 1) {
                    System.out.println("Tên hợp lệ!");
                }
                if (N == 0) {
                    System.out.println("Tên có chứa ký tự không hợp lệ, mời nhập lại!");
                }
            } while (N == 0);
            do {
                System.out.print("Nhập số dư của tài khoản được nhập: ");
                testB = sc.nextLine().toUpperCase();
                if (!"".equals(testB)) {
                    if (isNumber(testB)) {
                        if (Double.parseDouble(testB) >= 0) {
                            balance = (int) Double.parseDouble(testB);
                        } else {
                            System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                        }
                    } else {
                        System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                    }
                } else {
                    System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                }
            } while (balance < 0 || !isNumber(testB) || "".equals(testB));
            do {
                System.out.print("Nhập tình trạng VIP của tài khoản được nhập (y/n): ");
                testV = sc.nextLine().toUpperCase();
                if ("Y".equals(testV)) {
                    promotion = true;
                    tv = 1;
                } else if ("N".equals(testV)) {
                    promotion = false;
                    tv = 2;
                } else {
                    System.out.println("Tình trạng vừa nhập không hợp lệ, phải nhập ký tự y hoặc n!");
                    tv = 0;
                }
            } while (tv == 0);
            System.out.println("Nhập thành công!");
            arr[count++] = new Account(newCode, newName, balance);
            arrV[countV++] = new VIPAccount(promotion, newCode, newName, balance);
        }
    }

    public void addBusiness() {
        if (count == arr.length) {
            System.out.
                    println("Danh sách đầy!");
        } else {
            String newCode, newName;
            String testB, testV, testBB;
            double BR = 0;
            double balance = 0;
            boolean V;
            //Nhập mới thông tin
            Scanner sc = new Scanner(System.in);
            int pos; // Biến kiểm tra lệnh mới có trùng hay không
            int N; //Biến kiểm tra tên có hợp lệ?
            do {
                System.out.print("Nhập mã của tài khoản: ");
                newCode = sc.nextLine().toUpperCase();
                pos = find(newCode);
                if (!"".equals(newCode)) {
                    if (pos >= 0) {
                        System.out.println("\t Mã này đã bị trùng");
                    }
                } else {
                    System.out.println("\t Mã này không hợp lệ mời nhập lại!");
                }
            } while (pos >= 0 || "".equals(newCode));
            do {
                System.out.print("Nhập tên của người được nhập: ");
                newName = sc.nextLine().toUpperCase();
                N = checkName(newName);
                if (N == 1) {
                    System.out.println("Tên hợp lệ!");
                }
                if (N == 0) {
                    System.out.println("Tên có chứa ký tự không hợp lệ, mời nhập lại!");
                }
            } while (N == 0);
            do {
                System.out.print("Nhập số dư của tài khoản được nhập: ");
                testB = sc.nextLine().toUpperCase();
                if (!"".equals(testB)) {
                    if (isNumber(testB)) {
                        if (Double.parseDouble(testB) >= 0) {
                            balance = (int) Double.parseDouble(testB);
                        } else {
                            System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                        }
                    } else {
                        System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                    }
                } else {
                    System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                }
            } while (balance < 0 || !isNumber(testB) || "".equals(testB));
            do {
                System.out.print("Nhập tỉ số lãi suất: ");
                testV = sc.nextLine().toUpperCase();
                if (isNumber(testV)) {
                    BR = Double.parseDouble(testV);
                } else {
                    System.out.println("Số vừa nhập không hợp lệ, !");
                }
            } while (BR < 0 || !isNumber(testV));
            System.out.println("Nhập thành công!");
            arr[count++] = new Account(newCode, newName, balance);
            arrB[countB++] = new BusinessAccount(newCode, newName, balance, BR);
        }
    }

    public void print(int a) {
        if (a == 1) {
            if (countV == 0) {
                System.out.println("Danh sách trống!");
            } else {
                System.out.println("Danh sách VIP:");
                for (int i = 0; i < countV; i++) {
                    System.out.println("Tài khoản số " + (i + 1) + ":");
                    arrV[i].output();
                }
            }
        }
        if (a == 2) {
            if (countB == 0) {
                System.out.println("Danh sách trống!");
            } else {
                System.out.println("Danh sách VIP:");
                for (int i = 0; i < countB; i++) {
                    System.out.println("Tài khoản số " + (i + 1) + ":");
                    arrB[i].output();
                }
            }
        }
    }

}

class test {

    public static void main(String[] args) {
        Menu menu = new Menu(5);
        menu.add("Thêm 1 tài khoản VIP");
        menu.add("Thêm 1 tài khoản kinh doanh");
        menu.add("In tài khoản VIP");
        menu.add("In tài khoản kinh doanh");
        menu.add("Thoát");
        String S;
        Bank list = new Bank();
        int choice;
        do {
            System.out.println("\n Bài WS6:");
            choice = (int) menu.getChoice();
            switch (choice) {
                case 1:
                    list.addVIP();
                    break;
                case 2:
                   
                    list.addBusiness();
                    break;
                case 3:
                    list.print(1);
                    break;
                case 4:
                    list.print(2);
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
