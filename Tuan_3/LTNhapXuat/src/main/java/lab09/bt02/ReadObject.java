/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab09.bt02;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;
/**
 *
 * @author ADMIN
 */
public class ReadObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // Tạo luồng đọc đối tượng từ file 'sanpham.bin'
            FileInputStream fis = new FileInputStream("sanpham.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Đọc danh sách sản phẩm từ file
            List<SanPham> danhSachSanPham = (List<SanPham>) ois.readObject();

            // Đóng luồng
            ois.close();

            // Xuất danh sách sản phẩm ra màn hình
            System.out.println("Danh sach san pham da doc tu file sanpham.bin:");
            for (SanPham sp : danhSachSanPham) {
                System.out.println(sp);
            }

        } catch (Exception ex) {
            System.out.println("Loi xay ra: " + ex.toString());
        }
    }
}