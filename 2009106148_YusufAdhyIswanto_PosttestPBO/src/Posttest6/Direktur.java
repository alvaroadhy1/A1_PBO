package Posttest6;

import java.util.Scanner;
import java.util.ArrayList;
public class Direktur extends SuperAbstract{
    private final String usernameDir = "direktur"; //Penerapan Final
    private final String passwordDir = "direktur123"; //Penerapan Final
    
    public String getUsDir(){
        return usernameDir;
    }
    
    public String getPassDir(){
        return passwordDir;
    }
    
    @Override
    public void inputData(){ //Deklarasi dari method abstract
        System.out.println("\nSILAKAN MASUKKAN DATA PELANGGAN");

        System.out.print("NAMA PELANGGAN : ");
        nama = input.nextLine();
        System.out.print("NAMA GAME : ");
        game = input.nextLine();
        System.out.print("RANK TUJUAN : ");
        tier = input.nextLine();
        System.out.print("SOSMED LOGIN : ");
        login = input.nextLine();
        System.out.print("EMAIL : ");
        email = input.nextLine();
        System.out.print("PASSWORD : ");
        pass = input.nextLine();
    }
    
    public final static void menuDirektur() { //Penerapan Final
        Dataku enc = new Dataku();
        while (true){
            System.out.println("\n=================================================");
            System.out.println("========== SISTEM PENERIMAAN JASA JOKI ==========");
            System.out.println("================== GAME ONLINE ==================");
            System.out.println("=================================================\n");
            System.out.println("MENU UTAMA");
            System.out.println("1. TAMPILKAN ORDERAN");
            System.out.println("2. EXIT\n");    
            System.out.print("MASUKKAN PILIHAN ANDA : ");
            menu = input.nextInt();
            input.nextLine();
            if (menu == 1){
                enc.baca();
                System.out.print("TEKAN ENTER UNTUK KEMBALI KE MENU UTAMA. ");
                input.nextLine();
            }else if (menu == 2){
                break;
            }else{
                System.out.println("Perintah Yang Anda Masukkan Salah. Tekan ENTER Untuk Kembali.");
                input.nextLine();
            }
        }
    } 
}