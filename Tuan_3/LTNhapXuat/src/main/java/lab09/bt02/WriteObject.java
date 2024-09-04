/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab09.bt02;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lab09.bt01.SanPham;

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
        Scanner sc = new Scanner(System.in);
        try {
            // Tạo luồng ghi đối tượng vào file 'sanpham.bin'
            FileOutputStream fos = new FileOutputStream("sanpham.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (int i = 0; i < 3; i++) {
            System.out.println("Thong tin san pham thu " + (i + 1));
            System.out.print("Nhap ma so san pham: ");
            String maso = sc.nextLine();
            System.out.print("Nhap ten san pham: ");
            String ten = sc.nextLine();
            System.out.print("Nhap gia san pham: ");
            float gia = sc.nextFloat();
            sc.nextLine();
            SanPham sp = new SanPham(maso, ten, gia);
            ds.add(sp);
            }

            // Ghi danh sách sản phẩm vào file
            oos.writeObject(ds);

            // Đóng luồng
            oos.close();

            System.out.println("Da ghi xong");

        } catch (Exception  ex) {
            System.out.println("Loi xay ra: " + ex.toString());
            System.out.println("Thao tac ghi tap tin that bai");
            
            
        } 
}
}
