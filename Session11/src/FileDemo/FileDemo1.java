package FileDemo;

import java.io.*;
import java.util.Date;

/**
 *
 * @author Kyro
 */
public class FileDemo1 {

    public static void main(String[] args) throws IOException {
        File f = new File("f1.txt");
        System.out.println("Tên file là: " + f.getName());
        System.out.println("Tên file tuyệt đối là: " + f.getAbsoluteFile());
        System.out.println("Đường dẫn tuyệt đối là: " + f.getAbsolutePath());
        System.out.println("Path chuẩn là: " + f.getCanonicalPath());
        System.out.println("Ngày cập nhật cuối cùng là: " + new Date(f.lastModified()));
        System.out.println("Thuộc tính Hidden: " + f.isHidden());
        System.out.println("Thuộc tính can-read: " + f.canRead());
        System.out.println("Thuộc tính can-write: " + f.canWrite());
        System.out.println("Kích thước file: " + f.length() + " byte");
    }
}
