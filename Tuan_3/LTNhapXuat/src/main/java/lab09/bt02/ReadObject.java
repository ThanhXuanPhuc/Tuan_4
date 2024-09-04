/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab09.bt02;
import lab09.bt01.SanPham;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ReadObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<SanPham> ds;
        // TODO code application logic here
        try {
            // Tạo luồng đọc đối tượng từ file 'sanpham.bin'
            FileInputStream fis = new FileInputStream("sanpham.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ds = (ArrayList<SanPham>) ois.readObject();
            // Đọc danh sách sản phẩm từ file

            // Đóng luồng
            ois.close();

            // Xuất danh sách sản phẩm ra màn hình
            System.out.println("Da doc xong");
            for (SanPham sp : ds) {
                System.out.println(sp);
            }

        } catch (Exception ex) {
            System.out.println("Loi xay ra: " + ex.toString());
        }
    }
}