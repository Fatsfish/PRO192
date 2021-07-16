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
public class ProductManager {

    private Electric[] list = null; //Khởi tạo mảng danh sách mới
    private int count = 0; //Biến số lượng người trong danh sách khởi tạo mới =0

    // Tạo mới 1 danh sách với số lượng người cho trước
    public ProductManager(int size) {
        if (size < 10) {
            size = 10;
        }
        list = new Electric[size];
    }
//Tìm vị trí mã trong list

    int find(String aCode) {
        for (int i = 0; i < count; i++) {
            if (aCode.equals(list[i].getCode())) {
                return i;
            }
        }
        return -1;
    }
// Thêm mới

    public void add() {
        if (count == list.length) {
            System.out.println("Danh sách đầy!");
        } else {
            String newCode, newName, testMake, testPrice;
            int newMake = 0, tt;
            double newPrice = 0;
            //Nhập mới thông tin
            Scanner sc = new Scanner(System.in);
            int pos; // Biến kiểm tra lệnh mới có trùng hay không
            int N; //Biến kiểm tra tên có hợp lệ?
            do {
                System.out.print("Nhập mã của sản phẩm được nhập: ");
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
            System.out.print("Nhập tên của sản phẩm được nhập: ");
            newName = sc.nextLine().toUpperCase();
            do {
                System.out.print("Nhập số lượng của sản phẩm được nhập: ");
                testMake = sc.nextLine().toUpperCase();
                isNumber(testMake);
                if (!"".equals(testMake)) {
                    if (isNumber(testMake)) {
                        newMake = (int) Double.parseDouble(testMake);
                        tt = 0;
                        if (newMake < 0) {
                            System.out.println("Số không hợp lệ, số mặc định là 0 đã được khởi tạo!");
                            newMake = 0;
                            tt = 1;
                        }
                    } else {
                        System.out.println("Số không hợp lệ, số mặc định là 0 đã được khởi tạo!");
                        newMake = 0;
                        tt = 1;
                    }
                } else {
                    System.out.println("Số không hợp lệ, số mặc định là 0 đã được khởi tạo!");
                    newMake = 0;
                    tt = 1;
                }
            } while (newMake < 0 || tt == 1 || !isNumber(testMake) || "".equals(testMake));
            do {
                System.out.print("Nhập giá của sản phẩm được nhập: ");
                testPrice = sc.nextLine().toUpperCase();
                if (!"".equals(testPrice)) {
                    if (isNumber(testPrice)) {
                        newPrice = Double.parseDouble(testPrice);
                        tt = 0;
                        if (newPrice < 0) {
                            System.out.println("Số không hợp lệ, số mặc định là 0 đã được khởi tạo!");
                            newPrice = 0;
                            tt = 1;
                        }
                    } else {
                        System.out.println("Số không hợp lệ, số mặc định là 0 đã được khởi tạo!");
                        newPrice = 0;
                        tt = 1;
                    }
                } else {
                    System.out.println("Số không hợp lệ, số mặc định là 0 đã được khởi tạo!");
                    newPrice = 0;
                    tt = 1;
                }
            } while (newPrice < 0 || tt == 1 || !isNumber(testPrice) || "".equals(testPrice));
            list[count++] = new Electric(0, 0, 0, newCode, newName.trim(), newMake, newPrice);
            System.out.println("Thông tin đã được nhập mới! ");
        }
    }

    public void addElectric() {
        if (count == list.length) {
            System.out.println("Danh sách đầy!");
        } else {
            String newCode, newName, testMake, testPrice, testG, testV, testP;
            int newMake = 0, tt, newG = 0, newV = 0;
            double newPrice = 0, newP = 0;
            //Nhập mới thông tin
            Scanner sc = new Scanner(System.in);
            int pos; // Biến kiểm tra lệnh mới có trùng hay không
            int N; //Biến kiểm tra tên có hợp lệ?
            do {
                System.out.print("Nhập mã của sản phẩm được nhập: ");
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
            System.out.print("Nhập tên của sản phẩm được nhập: ");
            newName = sc.nextLine().toUpperCase();
            do {
                System.out.print("Nhập số lượng của sản phẩm được nhập: ");
                testMake = sc.nextLine().toUpperCase();
                isNumber(testMake);
                if (!"".equals(testMake)) {
                    if (isNumber(testMake)) {
                        newMake = (int) Double.parseDouble(testMake);
                        tt = 0;
                        if (newMake < 0) {
                            System.out.println("Số không hợp lệ, số mặc định là 0 đã được khởi tạo!");
                            newMake = 0;
                            tt = 1;
                        }
                    } else {
                        System.out.println("Số không hợp lệ, số mặc định là 0 đã được khởi tạo!");
                        newMake = 0;
                        tt = 1;
                    }
                } else {
                    System.out.println("Số không hợp lệ, số mặc định là 0 đã được khởi tạo!");
                    newMake = 0;
                    tt = 1;
                }
            } while (newMake < 0 || tt == 1 || !isNumber(testMake) || "".equals(testMake));
            do {
                System.out.print("Nhập giá của sản phẩm được nhập: ");
                testPrice = sc.nextLine().toUpperCase();
                if (!"".equals(testPrice)) {
                    if (isNumber(testPrice)) {
                        newPrice = Double.parseDouble(testPrice);
                        tt = 0;
                        if (newPrice < 0) {
                            System.out.println("Số không hợp lệ, số mặc định là 0 đã được khởi tạo!");
                            newPrice = 0;
                            tt = 1;
                        }
                    } else {
                        System.out.println("Số không hợp lệ, số mặc định là 0 đã được khởi tạo!");
                        newPrice = 0;
                        tt = 1;
                    }
                } else {
                    System.out.println("Số không hợp lệ, số mặc định là 0 đã được khởi tạo!");
                    newPrice = 0;
                    tt = 1;
                }
            } while (newPrice < 0 || tt == 1 || !isNumber(testPrice) || "".equals(testPrice));
            do {
                System.out.print("Nhập số năm bảo hành của sản phẩm được nhập: ");
                testG = sc.nextLine().toUpperCase();
                isNumber(testG);
                if (!"".equals(testG)) {
                    if (isNumber(testG)) {
                        newG = (int) Double.parseDouble(testG);
                        tt = 0;
                        if (newG < 0) {
                            System.out.println("Số không hợp lệ, số mặc định là 0 đã được khởi tạo!");
                            newG = 0;
                            tt = 1;
                        }
                        if (newG > 10) {
                            System.out.println("Số không hợp lệ, số năm bé hơn 10 năm, số mặc định là 10 đã được khởi tạo!");
                            newG = 10;
                            tt = 1;
                        }
                    } else {
                        System.out.println("Số không hợp lệ, số mặc định là 0 đã được khởi tạo!");
                        newG = 0;
                        tt = 1;
                    }
                } else {
                    System.out.println("Số không hợp lệ, số mặc định là 0 đã được khởi tạo!");
                    newG = 0;
                    tt = 1;
                }
            } while (newG < 0 || tt == 1 || !isNumber(testG) || "".equals(testG));
            do {
                System.out.print("Nhập điện áp của sản phẩm được nhập: ");
                testV = sc.nextLine().toUpperCase();
                isNumber(testV);
                if (!"".equals(testV)) {
                    if (isNumber(testV)) {
                        newV = (int) Double.parseDouble(testV);
                        tt = 0;
                        if (newV < 0) {
                            System.out.println("Số không hợp lệ, số mặc định là 0 đã được khởi tạo, mời nhập lại!");
                            newV = 0;
                            tt = 1;
                        }
                        if (newV == 0) {
                            System.out.println("Điện áp bằng 0 thì sao là đồ điện? Mời nhập lại");
                        }
                    } else {
                        System.out.println("Số không hợp lệ, số mặc định là 0 đã được khởi tạo, mời nhập lại!");
                        newV = 0;
                        tt = 1;
                    }
                } else {
                    System.out.println("Số không hợp lệ, số mặc định là 0 đã được khởi tạo, mời nhập lại!");
                    newV = 0;
                    tt = 1;
                }
            } while (newV <= 0 || tt == 1 || !isNumber(testV) || "".equals(testV));

            do {
                System.out.print("Nhập giá của sản phẩm được nhập: ");
                testP = sc.nextLine().toUpperCase();
                if (!"".equals(testP)) {
                    if (isNumber(testP)) {
                        newP = Double.parseDouble(testP);
                        tt = 0;
                        if (newP < 0) {
                            System.out.println("Số không hợp lệ, số mặc định là 0 đã được khởi tạo!");
                            newP = 0;
                            tt = 1;
                        }
                        if (newP == 0) {
                            System.out.println("Công suất sao bằng 0 được :>?, mời nhập lại!");
                        }
                    } else {
                        System.out.println("Số không hợp lệ, số mặc định là 0 đã được khởi tạo!");
                        newP = 0;
                        tt = 1;
                    }
                } else {
                    System.out.println("Số không hợp lệ, số mặc định là 0 đã được khởi tạo, mời nhập lại!");
                    newP = 0;
                    tt = 1;
                }
            } while (newP <= 0 || tt == 1 || !isNumber(testP) || "".equals(testP));

            list[count++] = new Electric(newG, newV, newP, newCode, newName.trim(), newMake, newPrice);
            System.out.println("Thông tin đã được nhập mới! ");
        }
    }

    public void printD() {
        if (count == 0) {
            System.out.println("Danh sách trống!");
            return;
        }
        System.out.println("Danh sách:");
        for (int i = 0; i < count; i++) {
            if (list[i].guaranty != 0 || list[i].voltage != 0 || list[i].power != 0) {
                System.out.println(list[i].toString());
            }
        }
    }

    public void printHV() {
        int t = 0;
        if (count == 0) {
            System.out.println("Danh sách trống!");
        }
        System.out.println("Danh sách điện áp lớn:");
        for (int i = 0; i < count; i++) {
            if (list[i].voltage >= 220) {
                t += 1;
                System.out.println(list[i].toString());
            }
        }
        if (t == 0) {
            System.out.println("Danh sách trống!");
        }
    }

    public int SumP() {
        double P = 0;
        int p;
        for (int i = 0; i < count; i++) {
            P = list[i].price * list[i].make;
            P += list[i].price * list[i].make;
        }
        p = (int) P;
        return p;
    }

    public static void main(String[] args) {
        Menu menu = new Menu(6);
        menu.add("Thêm 1 sản phẩm");
        menu.add("Thêm 1 sản phẩm điện");
        menu.add("In sản phẩm điện");
        menu.add("In sản phẩm có số điện áp cao");
        menu.add("Giá tổng các sản phẩm");
        menu.add("Thoát");
        String S;
        int choice;
        ProductManager list = new ProductManager(50);

        do {
            System.out.println("\n Bài WS6:");
            choice = (int) menu.getChoice();
            switch (choice) {
                case 1:
                    list.add();
                    break;
                case 2:
                    list.addElectric();
                    break;
                case 3:
                    list.printD();
                    break;
                case 4:
                    list.printD();
                    list.printHV();
                    break;
                case 5:
                    int a = list.SumP();
                    System.out.println("Tổng tiền: " + a);
                    break;
            }
            if (choice < 1 || choice > 6 && choice != 2108) {
                System.out.println("Chương trình không hỗ trợ tác vụ số này, mời khởi tạo lại chương trình mới hoặc nhập phím số 6 để thoát!");
            }
            if (choice == 2108) {
                System.out.println("Chương trình không hỗ trợ các ký tự khác số, để tiếp tục sử dụng chương trình, vui lòng chọn các phím menu từ 1-5 hoặc nhập phím 6 để thoát!");
            }
            //2108 là số mẫu cho vòng lập nếu nhập dữ liệu khác số
        } while (choice != 6 || choice == 2108);// Nếu muốn sử dụng vòng lập cho các số khác không thì sửa điều kiện lại isNumber(choice) && choice !=5
        if (choice == 6) {
            System.out.println("Cảm ơn bạn đã sử dụng chương trình! Have a good day!");
        }
    }
}
