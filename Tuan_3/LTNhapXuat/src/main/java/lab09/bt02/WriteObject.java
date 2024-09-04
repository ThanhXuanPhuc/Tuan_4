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
        ArrayList<SanPham> ds = new ArrayList<>();
        ds.add(new SanPham("SP001", "San pham 1", 10000f));
        ds.add(new SanPham("SP002", "San pham 2", 20000f));
        ds.add(new SanPham("SP003", "San pham 3", 30000f));
        try {
            // Tạo luồng ghi đối tượng vào file 'sanpham.bin'
            FileOutputStream fos = new FileOutputStream("sanpham.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Ghi danh sách sản phẩm vào file
            oos.writeObject(ds);

            // Đóng luồng
            oos.close();

            System.out.println("Da ghi danh sach san pham vao file sanpham.bin");

        } catch (Exception  ex) {
            System.out.println("Loi xay ra: " + ex.toString());
            System.out.println("Thao tac ghi tap tin that bai");
        } 
}
}
