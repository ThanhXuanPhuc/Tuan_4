/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab09.bt01;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ADMIN
 */
public class WriteTextFile {
    
    public static void main(String[] args) {
        // Tạo danh sách sản phẩm
        ArrayList<SanPham> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin 3 sản phẩm từ bàn phím
        for (int i = 0; i < 3; i++) {
            System.out.print("Nhap ma so san pham: ");
            String maso = sc.nextLine();
            System.out.print("Nhap ten san pham: ");
            String ten = sc.nextLine();
            System.out.print("Nhap gia san pham: ");
            float gia = Float.parseFloat(sc.nextLine());

            ds.add(new SanPham(maso, ten, gia));
        }

        try {
            // Tạo luồng ghi file
            FileWriter fw = new FileWriter("sanpham.txt");

            // Ghi từng sản phẩm vào file với mỗi dòng là một sản phẩm
            for (SanPham sp : ds) {
                fw.write(sp.toString() + "\n");
            }

            // Đóng luồng
            fw.close();
            System.out.println("Da ghi xong danh sach san pham vao file sanpham.txt");

        } catch (Exception ex) {
            System.out.println("Loi xay ra ra: " + ex.toString());
            System.out.println("Ghi File that bai");
        } 
    }
}
