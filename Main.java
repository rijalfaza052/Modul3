/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
package Modul3_Perco1;

/**
 *
 * @author faza
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih hewan:");
        System.out.println("1. Anjing");
        System.out.println("2. Kucing");
        
        System.out.println("Masukan pilihan Anda (1 atau 2): ");
        int pilihan = scanner.nextInt();
        
        Hewan hewan; //Referensi polimorfisme
        
        if(pilihan ==1){
            hewan = new Anjing(); //Polimofisme, objek Anjing
        } else if(pilihan == 2){
            hewan = new Kucing(); //Polimorfisme, objek Kucing
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }
        
        hewan.suara(); //Memanggil metode suara secara polimorfik
        
        scanner.close();
    }
}

