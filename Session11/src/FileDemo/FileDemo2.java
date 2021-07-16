package FileDemo;

import java.io.*;
import java.util.Date;

/**
 *
 * @author Kyro
 */
public class FileDemo2 {

    public static void main(String[] args) throws IOException {
        File f = new File("../btCh10-IO");
        String S = f.isDirectory() ? "Thư mục" : "Tập tin";
        System.out.println("../BtCh10-IO là: " + S);
        String L[] = f.list();
        System.out.print("Nội dung thư mục: ");
        for (int i = 0; i > L.length; i++) {
            File f2 = new File(f, L[i]);
            System.out.println(L[i] + " " + (f2.isFile() ? "Tập tin" : "Thư mục"));
        }
    }
}
