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

public class PersonList {
    
    private Person[] list = null; //Khởi tạo mảng danh sách mới
    private int count = 0; //Biến số lượng người trong danh sách khởi tạo mới =0

    // Tạo mới 1 danh sách với số lượng người cho trước
    public PersonList(int size) {
        if (size < 10) {
            size = 10;
        }
        list = new Person[size];
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
            String newCode, newName, testAge;
            int newAge;
            //Nhập mới thông tin
            Scanner sc = new Scanner(System.in);
            int pos; // Biến kiểm tra lệnh mới có trùng hay không
            int N; //Biến kiểm tra tên có hợp lệ?
            do {
                System.out.print("Nhập mã của người được nhập: ");
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
            System.out.print("Nhập tuổi của người được nhập: ");
            testAge = sc.nextLine().toUpperCase();
            isNumber(testAge);
            if (!"".equals(testAge)) {
                if (isNumber(testAge)) {
                    newAge = (int) Double.parseDouble(testAge);
                    if (newAge < 0 || newAge >= 100) {
                        System.out.println("Tuổi không hợp lệ, tuổi mặc định là 0 đã được khởi tạo!");
                        System.out.println("Mời nhập lại tuổi mới bằng phương thức chọn menu cập nhật!");
                        newAge = 0;
                    }
                } else {
                    System.out.println("Tuổi không hợp lệ, tuổi mặc định là 0 đã được khởi tạo!");
                    System.out.println("Mời nhập lại tuổi mới bằng phương thức chọn menu cập nhật!");
                    newAge = 0;
                }
            } else {
                System.out.println("Tuổi không hợp lệ, tuổi mặc định là 0 đã được khởi tạo!");
                System.out.println("Mời nhập lại tuổi mới bằng phương thức chọn menu cập nhật!");
                newAge = 0;
            }
            list[count++] = new Person(newCode, newName.trim(), newAge);
            System.out.println("Thông tin đã được nhập mới! ");
        }
    }

    // Phương thức xóa
    public void remove() {
        if (count == 0) {
            System.out.println("Danh sách trống!");
            return;
        }
        String removedCode;
        // Nhập thông tin người cần xóa
        Scanner sc = new Scanner(System.in);
        int pos;
        do {
            System.out.print("Nhập mã của người cần xóa: ");
            removedCode = sc.nextLine().toUpperCase();
            pos = find(removedCode);
            if (!"".equals(removedCode)) {
                if (pos < 0) {
                    System.out.println("Người này không tồn tại!");
                } else {
                    // Dịch chuyển phần còn lại của danh sách
                    for (int i = pos; i < count - 1; i++) {
                        list[i] = list[i + 1];
                    }
                    count--;
                    System.out.println("Người có mã " + removedCode + " đã được xóa!");
                }
            } else {
                System.out.println("Mã này trống mời nhập lại!");
            }
        } while (pos < 0 || "".equals(removedCode));
    }

    // Cập nhật tên và tuổi
    public void update() {
        if (count == 0) {
            System.out.println("Danh sách trống!");
            return;
        }
        String code;
        // Nhập thông tin người cần cập nhật
        Scanner sc = new Scanner(System.in);
        int pos;
        do {
            System.out.print("Nhập mã của người cần cập nhật thông tin: ");
            code = sc.nextLine().toUpperCase();
            pos = find(code);
            if (!"".equals(code)) {
                if (pos < 0) {
                    System.out.println("Người này không tồn tại!");
                } else {
                    String newName, testAge;
                    int newAge;
                    int N;
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
                    System.out.print("Nhập tuổi của người được nhập: ");
                    testAge = sc.nextLine().toUpperCase();
                    if (!"".equals(testAge)) {
                        if (isNumber(testAge)) {
                            newAge = (int) Double.parseDouble(testAge);
                            if (newAge < 0 || newAge >= 100) {
                                System.out.println("Tuổi không hợp lệ, tuổi mặc định là 0 đã được khởi tạo!");
                                System.out.println("Mời nhập lại tuổi mới bằng phương thức chọn menu cập nhật!");
                                newAge = 0;
                            }
                        } else {
                            System.out.println("Tuổi không hợp lệ, tuổi mặc định là 0 đã được khởi tạo!");
                            System.out.println("Mời nhập lại tuổi mới bằng phương thức chọn menu cập nhật!");
                            newAge = 0;
                        }
                    } else {
                        System.out.println("Tuổi không hợp lệ, tuổi mặc định là 0 đã được khởi tạo!");
                        System.out.println("Mời nhập lại tuổi mới bằng phương thức chọn menu cập nhật!");
                        newAge = 0;
                    }
                    list[pos].setName(newName.trim());
                    list[pos].setAge(newAge);
                    System.out.println("Người có mã " + code + " đã được cập nhật!");
                }
            } else {
                System.out.println("\t Mã này không hợp lệ mời nhập lại!");
            }
        } while (pos < 0 || "".equals(code));
    }
// Phương thức in ra màn hình

    public void print() {
        if (count == 0) {
            System.out.println("Danh sách trống!");
            return;
        }
        System.out.println("Danh sách:");
        for (int i = 0; i < count; i++) {
            System.out.println(list[i].toString());
        }
    }

    //Phương thức sắp xếp
    void sort() {
        if (count == 0) {
            return;
        }
        // Dùng thuật toán bubble sort dựa vào tuổi của người
        for (int i = 0; i < count - 1; i++) {
            for (int j = count - 1; j > i; j--) {
                if (list[j].getAge() < list[j - 1].getAge()) {
                    Person p = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = p;
                }
            }
        }
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
}
