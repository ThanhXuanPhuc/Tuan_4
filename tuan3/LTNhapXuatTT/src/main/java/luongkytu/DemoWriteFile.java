/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luongkytu;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ADMIN
 */
public class DemoWriteFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "em la co gai hay nang tien\n Em co tuoi hay khong co tuoi";
        try {
            //tao luong
            FileWriter fw = new FileWriter("baitho.txt");
            //Ghi du lieu
            fw.write(str);
            //dong luong
            fw.close();
            System.out.println("Da ghi xong");
            
        } catch (Exception ex){
            System.out.println("Loi xay ra:" + ex.toString());
        }
    }
    
}
