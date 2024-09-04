/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab09.bt01;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ADMIN
 */
public class ReadTextFile {
    public static void main(String[] args) {
        List<SanPham> danhSachSanPham = new ArrayList<>();

        try {
            // Tạo luồng đọc file
            FileReader fr = new FileReader("sanpham.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            // Đọc từng dòng trong file và tái tạo danh sách sản phẩm
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 3) {
                    String maso = parts[0];
                    String ten = parts[1];
                    float gia = Float.parseFloat(parts[2]);

                    danhSachSanPham.add(new SanPham(maso, ten, gia));
                }
            }

            // Đóng luồng
            br.close();
            fr.close();

            // Xuất danh sách sản phẩm ra màn hình
            System.out.println("Danh sach san pham da doc tu file sanpham.txt:");
            for (SanPham sp : danhSachSanPham) {
                System.out.println(sp);
            }

        } catch (Exception ex) {
            System.out.println("Loi xay ra: " + ex.toString());
        }
    }
}
