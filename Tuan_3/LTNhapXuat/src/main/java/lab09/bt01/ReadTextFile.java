/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab09.bt01;
import java.io.*;
import java.util.ArrayList;/**
 *
 * @author ADMIN
 */
public class ReadTextFile {
    public static void main(String[] args) {
       ArrayList<SanPham> ds = new ArrayList<>();
        try{
            // Tạo luồng đọc file
            FileReader rd = new FileReader("sanpham.txt");
            BufferedReader br = new BufferedReader(rd);

            String data = null;
            // Đọc từng dòng trong file và tái tạo danh sách sản phẩm
            while ((data = br.readLine()) != null) {
                String[] arr = data.split(";");
                   ds.add(new SanPham(arr[0], arr[1], Float.parseFloat(arr[2])));
                }
            

            // Đóng luồng
            br.close();
            System.out.println("Da doc xong");
            // Xuất danh sách sản phẩm ra màn hình
            System.out.println("Danh sach san pham da doc tu file sanpham.txt:");
            for (SanPham sp : ds) {
                System.out.println(sp);
            }

        } catch (Exception ex) {
            System.out.println("Loi xay ra: " + ex.toString());
            System.out.println("Doc File that bai");
        }
    }
}
