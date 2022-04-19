package Posttest4;

import java.util.Scanner;
import java.util.ArrayList;
public class Direktur extends main{
    public static void menuDirektur() {
        Dataku enc = new Dataku();
        while (true){
            System.out.println("=================================================");
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