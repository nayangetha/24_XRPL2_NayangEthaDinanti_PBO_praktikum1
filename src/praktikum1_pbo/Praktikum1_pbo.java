/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1_pbo;
import java.util.Scanner;
/**
 *
 * @author MOKLET1
 */
public class Praktikum1_pbo {

    //Variabel Instance
    
    //Atribut r (jari-jari bola) dengan tipe data integer
    int r;

    //Atribut pi dengan tipe data double (karena menggunakan desimal)
    double pi = 3.14;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //objek
        Praktikum1_pbo bola = new Praktikum1_pbo();

        System.out.println("Menghitung Luas Permukaan Bola");
        System.out.println("==============================");
        
        //Memasukkan jari-jari bola
        System.out.print("Masukkan Jari-Jari (r) Bola = ");
        bola.r = input.nextInt();
       
        //Memanggil nilai phi
        System.out.println("Nilai phi (ᴫ) = "+bola.pi);
        
        System.out.println("==============================");
        
        //Menampilkan rumus luas permukaan bola
        System.out.println("Rumus Luas Permukaan Bola = 4*ᴫ*r*r");
        
        //Menghitung dan menampilkan hasil luas permukaan bola dengan jari-jari yang telah di inputkan user
        System.out.println("Luas Permukaan Bola dengan jari-jari "+bola.r+" adalah "+(4*bola.pi*bola.r*bola.r));
        
        
        
    }
    
}
