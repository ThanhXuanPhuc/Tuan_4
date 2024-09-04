/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab09.bt02;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ADMIN
 */
public class WriteObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Tạo danh sách 3 sản phẩm
        List<SanPham> danhSachSanPham = new ArrayList<>();
        danhSachSanPham.add(new SanPham("SP001", "San pham 1", 10000f));
        danhSachSanPham.add(new SanPham("SP002", "San pham 2", 20000f));
        danhSachSanPham.add(new SanPham("SP003", "San pham 3", 30000f));
        try {
            // Tạo luồng ghi đối tượng vào file 'sanpham.bin'
            FileOutputStream fo = new FileOutputStream("sanpham.bin");
            ObjectOutputStream oo = new ObjectOutputStream(fo);

            // Ghi danh sách sản phẩm vào file
            oo.writeObject(danhSachSanPham);

            // Đóng luồng
            oo.close();
            fo.close();

            System.out.println("Da ghi danh sach san pham vao file sanpham.bin");

        } catch (IOException e) {
            System.out.println("Loi xay ra: " + e.toString());
        } 
}
}
