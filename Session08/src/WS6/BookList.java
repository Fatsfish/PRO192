/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS6;

import static WS6.Bank.checkName;
import static WS6.Menu.isNumber;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class BookList {

    private Book[] arr = null;
    private DetectiveBook[] arrD = null;
    private ScienceBook[] arrS = null;
    private int count, countD, countS;

    public BookList() {
        arr = new Book[100];
        arrD = new DetectiveBook[100];
        arrS = new ScienceBook[100];
    }

    int find(String aCode) {
        for (int i = 0; i < count; i++) {
            if (aCode.equals(arr[i].getCode())) {
                return i;
            }
        }
        return -1;
    }

    int findD(String aCode) {
        for (int i = 0; i < countD; i++) {
            if (aCode.equals(arrD[i].getCode())) {
                return i;
            }
        }
        return -1;
    }

    int findS(String aCode) {
        for (int i = 0; i < countS; i++) {
            if (aCode.equals(arrS[i].getCode())) {
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

    public void add(int a) {
        if (count == arr.length) {
            System.out.println("Danh sách đầy!");
        } else {
            String newCode, newTitle;
            String testC, testT;
            //Nhập mới thông tin
            Scanner sc = new Scanner(System.in);
            int pos; // Biến kiểm tra lệnh mới có trùng hay không
            int N; //Biến kiểm tra tên có hợp lệ?
            do {
                System.out.print("Nhập mã của sách: ");
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
                System.out.print("Nhập tựa đề của sách: ");
                newTitle = sc.nextLine().toUpperCase();
                N = checkName(newTitle);
                if (N == 1) {
                    System.out.println("Tên hợp lệ!");
                }
                if (N == 0) {
                    System.out.println("Tên có chứa ký tự không hợp lệ, mời nhập lại!");
                }
            } while (N == 0);
            arr[count++] = new Book(newCode, newTitle);
            if (a == 1) {
                String testP, testY;
                double newPrice = 0;
                int newYear = 300;
                System.out.println("Sách trinh thám:");
                do {
                    System.out.print("Nhập giá tiền: ");
                    testP = sc.nextLine().toUpperCase();
                    if (!"".equals(testP)) {
                        if (isNumber(testP)) {
                            if (Double.parseDouble(testP) >= 0) {
                                newPrice = (int) Double.parseDouble(testP);
                            } else {
                                System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                            }
                        } else {
                            System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                        }
                    } else {
                        System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                    }
                } while (newPrice < 0 || !isNumber(testP) || "".equals(testP));

                do {
                    System.out.print("Nhập năm xuất bản: ");
                    testY = sc.nextLine().toUpperCase();
                    if (!"".equals(testY)) {
                        if (isNumber(testY)) {
                            if (Double.parseDouble(testY) >= 300) {
                                newPrice = (int) Double.parseDouble(testY);
                            } else {
                                System.out.println("Số vừa nhập không hợp lệ, số năm phải lớn hơn 300, mời nhập lại!");
                            }
                        } else {
                            System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                        }
                    } else {
                        System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                    }
                } while (newYear < 300 || !isNumber(testY) || "".equals(testY));

                arrD[countD++] = new DetectiveBook(newCode, newTitle, newPrice, newYear);
                System.out.println("Nhập sách trinh thám thành công, thoát chương trình add");
            } else if (a == 2) {
                String newType;
                do {
                    System.out.print("Nhập thể loại sách: ");
                    newType = sc.nextLine().toUpperCase();
                    N = checkName(newType);
                    if (N == 1) {
                        System.out.println("Tên hợp lệ!");
                    }
                    if (N == 0) {
                        System.out.println("Tên có chứa ký tự không hợp lệ, mời nhập lại!");
                    }
                } while (N == 0);
                arrS[countS++] = new ScienceBook(newCode, newTitle, newType);
                System.out.println("Nhập sách khoa học thành công, thoát chương trình add");
            } else if (a == 3) {
                System.out.println("Nhập sách thành công, thoát chương trình add");
            } else {
                System.out.println("Chương trình không hỗ trợ tác vụ này, mời nhập lại!");
            }
        }
    }

    public void remove() {
        if (count == 0) {
            System.out.println("Danh sách trống!");
        } else {
            String removedCode;
            // Nhập thông tin người cần xóa
            Scanner sc = new Scanner(System.in);
            int pos, posS, posD;
            do {
                System.out.print("Nhập mã sách cần xóa: ");
                removedCode = sc.nextLine().toUpperCase();
                pos = find(removedCode);
                posS = findS(removedCode);
                posD = findD(removedCode);

                if (!"".equals(removedCode)) {
                    if (pos < 0) {
                        System.out.println("Sách này không tồn tại!");
                    } else {
                        // Dịch chuyển phần còn lại của danh sách
                        for (int i = pos; i < count - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        count--;
                        if (posS < 0) {
                        } else {
                            for (int i = posS; i < countS - 1; i++) {
                                arrS[i] = arrS[i + 1];
                            }
                            countS--;
                        }
                        if (posD < 0) {
                        } else {
                            for (int i = posD; i < countD - 1; i++) {
                                arrD[i] = arrD[i + 1];
                            }
                            countD--;
                        }
                        System.out.println("Sách có mã " + removedCode + " đã được xóa!");
                    }
                } else {
                    System.out.println("Mã này trống mời nhập lại!");
                }
            } while (pos < 0 || "".equals(removedCode));
        }
    }

    public void update() {
        if (count == 0) {
            System.out.println("Danh sách trống!");
        } else {
            String code;
            // Nhập thông tin người cần cập nhật
            Scanner sc = new Scanner(System.in);
            int pos, posS, posD;
            do {
                System.out.print("Nhập mã của sách cần cập nhật thông tin: ");
                code = sc.nextLine().toUpperCase();
                pos = find(code);
                posS = findS(code);
                posD = findD(code);
                if (!"".equals(code)) {
                    if (pos < 0) {
                        System.out.println("Sách này không tồn tại!");
                    } else {
                        String newTitle, newType = null, testY, testP;
                        int N, newYear = 300;
                        double newPrice = 0;
                        do {
                            System.out.print("Nhập tựa đề của sách được nhập: ");
                            newTitle = sc.nextLine().toUpperCase();
                            N = checkName(newTitle);
                            if (N == 1) {
                                System.out.println("Tên hợp lệ!");
                            }
                            if (N == 0) {
                                System.out.println("Tên có chứa ký tự không hợp lệ, mời nhập lại!");
                            }
                        } while (N == 0);
                        if (posS < 0) {
                        } else {
                            do {
                                System.out.print("Nhập tựa đề của sách được nhập: ");
                                newType = sc.nextLine().toUpperCase();
                                N = checkName(newType);
                                if (N == 1) {
                                    System.out.println("Tên hợp lệ!");
                                }
                                if (N == 0) {
                                    System.out.println("Tên có chứa ký tự không hợp lệ, mời nhập lại!");
                                }
                            } while (N == 0);
                            arrS[posS].setType(newType.trim());
                        }
                        if (posD < 0) {
                        } else {
                            System.out.println("Sách trinh thám:");
                            do {
                                System.out.print("Nhập giá tiền: ");
                                testP = sc.nextLine().toUpperCase();
                                if (!"".equals(testP)) {
                                    if (isNumber(testP)) {
                                        if (Double.parseDouble(testP) >= 0) {
                                            newPrice = (int) Double.parseDouble(testP);
                                        } else {
                                            System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                                        }
                                    } else {
                                        System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                                    }
                                } else {
                                    System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                                }
                            } while (newPrice < 0 || !isNumber(testP) || "".equals(testP));

                            do {
                                System.out.print("Nhập năm xuất bản: ");
                                testY = sc.nextLine().toUpperCase();
                                if (!"".equals(testY)) {
                                    if (isNumber(testY)) {
                                        if (Double.parseDouble(testY) >= 300) {
                                            newPrice = (int) Double.parseDouble(testY);
                                        } else {
                                            System.out.println("Số vừa nhập không hợp lệ, số năm phải lớn hơn 300, mời nhập lại!");
                                        }
                                    } else {
                                        System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                                    }
                                } else {
                                    System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                                }
                            } while (newYear < 300 || !isNumber(testY) || "".equals(testY));
                        }
                        arr[pos].setTitle(newTitle.trim());
                        arrD[posD].setYear(newYear);
                        arrD[posD].setPrice(newPrice);
                        System.out.println("Sách có mã " + code + " đã được cập nhật!");

                    }
                } else {
                    System.out.println("\t Mã này không hợp lệ mời nhập lại!");
                }
            } while (pos < 0 || "".equals(code));
        }
    }

    public void print(int a) {
        if (a == 1) {
            double Sum = 0;

            if (countD == 0) {
                System.out.println("Danh sách trống!");
            } else {
                System.out.println("Danh sách sách trinh thám:");
                for (int i = 0; i < countD; i++) {
                    System.out.println("Sách số " + (i + 1) + ":");
                    arrD[i].output();
                    Sum += arrD[i].price;
                }
                System.out.println("Tổng tiền: " + Sum);
            }
        } else if (a == 2) {
            if (countS == 0) {
                System.out.println("Danh sách trống!");
            } else {
                System.out.println("Danh sách sách sách khoa học:");
                for (int i = 0; i < countS; i++) {
                    System.out.println("Sách số " + (i + 1) + ":");
                    arrS[i].output();
                }
            }
        } else {
            if (count == 0) {
                System.out.println("Danh sách trống!");
                return;
            }
            System.out.println("Danh sách:");
            for (int i = 0; i < count; i++) {
                System.out.println("Sách số " + (i + 1) + ":");
                arr[i].output();
            }
        }
    }
}

class BookTest {

    public static void main(String[] args) {
        Menu menu = new Menu(7);
        menu.add("Thêm 1 cuốn sách rinh thám:");
        menu.add("Thêm 1 cuốn sách khoa học:");
        menu.add("Xóa 1 cuốn sách");
        menu.add("Cập nhật 1 cuốn sách");
        menu.add("In sách trinh thám và tổng tiền");
        menu.add("In sách khoa học");
        menu.add("Thoát");
        BookList list = new BookList();
        int choice;
        do {
            System.out.println("\n Bài WS6:");
            choice = (int) menu.getChoice();
            switch (choice) {
                case 1:
                    list.add(1);
                    /* String A;
                    int a = 0;
                    do {
                        System.out.println("Nhập loại sách muốn nhập (1-Trinh thám, 2-Khoa học, 0-Sách thường):");
                        Scanner sc = new Scanner(System.in);
                        A = sc.nextLine();
                        if (isNumber(A)) {
                            a = Integer.parseInt(A);
                            if (a == 1 || a == 2 || a == 0) {
                                list.add(a);
                            } else {
                                System.out.println("Số không hỗ trợ, mời nhập lại!");
                            }
                        } else {
                            System.out.println("Ký tự không hỗ trợ, mời nhập lại!");
                        }
                    } while (a != 1 || a != 2 || a != 0);*/
                    break;
                case 2:
                    list.add(2);
                    break;
                case 3:
                    list.print(0);
                    list.remove();
                    break;
                case 4:
                    list.update();
                case 5:
                    list.print(1);
                    break;
                case 6:
                    list.print(2);
                    break;
            }
            if (choice < 1 || choice > 7 && choice != 2108) {
                System.out.println("Chương trình không hỗ trợ tác vụ số này, mời khởi tạo lại chương trình mới hoặc nhập phím số 7 để thoát!");
            }
            if (choice == 2108) {
                System.out.println("Chương trình không hỗ trợ các ký tự khác số, để tiếp tục sử dụng chương trình, vui lòng chọn các phím menu từ 1-6 hoặc nhập phím 7 để thoát!");
            }
            //2108 là số mẫu cho vòng lập nếu nhập dữ liệu khác số
        } while (choice != 7 || choice == 2108);// Nếu muốn sử dụng vòng lập cho các số khác không thì sửa điều kiện lại isNumber(choice) && choice !=5
        if (choice == 5) {
            System.out.println("Cảm ơn bạn đã sử dụng chương trình! Have a good day!");
        }
    }
}
