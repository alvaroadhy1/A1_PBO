package Posttest5;

import java.util.Scanner;
import java.util.ArrayList;
public class Admin extends SuperAbstract{
    private final String usernameAdm = "admin"; //Penerapan Final
    private final String passwordAdm = "admin123"; //Penerapan Final
    
    public String getUsDir(){
        return usernameAdm;
    }
    
    public String getPassDir(){
        return passwordAdm;
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
    
    public final void menuAdmin() { //Penerapan Final
        Dataku enc = new Dataku();
        while (true){
            System.out.println("\n=================================================");
            System.out.println("========== SISTEM PENERIMAAN JASA JOKI ==========");
            System.out.println("================== GAME ONLINE ==================");
            System.out.println("=================================================\n");
            System.out.println("MENU UTAMA");
            System.out.println("1. BUAT ORDERAN");
            System.out.println("2. TAMPILKAN ORDERAN");
            System.out.println("3. UBAH ORDERAN");
            System.out.println("4. HAPUS ORDERAN");
            System.out.println("5. EXIT\n");    
            System.out.print("MASUKKAN PILIHAN ANDA : ");
            menu = input.nextInt();
            input.nextLine();
            if (menu == 1){
                inputData();
                panggilKonstruktor(1);  //pemanggilan overloading
                System.out.print("DATA BERHASIL DITAMBAHKAN. TEKAN ENTER UNTUK KEMBALI KE MENU UTAMA. ");
                input.nextLine();
                
            }else if (menu == 2){
                enc.baca();
                System.out.print("TEKAN ENTER UNTUK KEMBALI KE MENU UTAMA. ");
                input.nextLine();
            }else if (menu == 3){
                pilih(3);
                inputData();
                panggilKonstruktor(3,a);  //pemanggilan overloading
                System.out.print("DATA BERHASIL DIUBAH. TEKAN ENTER UNTUK KEMBALI KE MENU UTAMA. ");
                input.nextLine();
            }else if (menu == 4){
                pilih(4);
                enc.hapus(a);
                System.out.print("DATA BERHASIL DIHAPUS. TEKAN ENTER UNTUK KEMBALI KE MENU UTAMA. ");
                input.nextLine();
            }else if (menu == 5){
                break;
            }else{
                System.out.println("Perintah Yang Anda Masukkan Salah. Tekan Enter Untuk Kembali.");
                input.nextLine();
            }
        }
    } 
}