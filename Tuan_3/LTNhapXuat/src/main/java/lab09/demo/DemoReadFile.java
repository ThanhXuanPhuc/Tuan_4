/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab09.demo;

import java.io.*;

/**
 *
 * @author ADMIN
 */
public class DemoReadFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //tao luong
            FileReader fr = new FileReader("baitho.txt");
            BufferedReader br = new BufferedReader(fr);
            //Doc du lieu
            int ch;
            do{
                ch = fr.read();
                if(ch!=-1){
                    System.out.print((char)ch);
                }
            } while(ch!=-1);
            String line;
            while ((line = br.readLine())!=null){
                System.out.print(line);
            }
            //dong luong
            fr.close();
            
            System.out.println("Da doc xong");
            
        } catch (Exception ex){
            System.out.println("Loi xay ra:" + ex.toString());
        }
    }
    
}
