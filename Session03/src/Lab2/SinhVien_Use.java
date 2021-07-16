/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author User
 */
public class SinhVien_Use {

    public static void main(String[] args) {
        System.out.println("Họ tên sinh viên khởi tạo ban đầu");
        SinhVien SV1 = new SinhVien("Tuấn Khải", "9");
        System.out.println("Hãy nhập mới sinh viên");
        SinhVien SV2 = new SinhVien();
    }
}
