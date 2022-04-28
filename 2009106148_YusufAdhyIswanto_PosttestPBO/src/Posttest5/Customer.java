package Posttest5;

import java.util.Scanner;
import java.util.ArrayList;
public class Customer extends SuperAbstract{
    @Override
    public void inputData(){ //Deklarasi dari method abstract
        System.out.print("NAMA ANDA : ");
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
    
    static final void dataPelanggan(){ //Penerapan Final
        Dataku enc = new Dataku();
        int b = 0;
        for(int i = 0; i < enc.pelanggan.size(); i++){
            b = i;
        }
        System.out.println("=================================================");
        for (int j = 0; j < 6 ; j++){
            System.out.println(enc.pelanggan.get(b).get(j));
        }
        System.out.println("=================================================\n");
    }
    
    public final void menuCustomer() { //Penerapan Final
        Dataku enc = new Dataku();
        while (true){
            System.out.println("\n=================================================");
            System.out.println("========== SISTEM PENERIMAAN JASA JOKI ==========");
            System.out.println("================== GAME ONLINE ==================");
            System.out.println("=================================================\n");
            System.out.println("MENU UTAMA");
            System.out.println("1. BUAT ORDERAN");
            System.out.println("2. EXIT\n");    
            System.out.print("MASUKKAN PILIHAN ANDA : ");
            menu = input.nextInt();
            input.nextLine();
            if (menu == 1){
                System.out.println("\nSILAKAN MASUKKAN DATA ANDA");
                inputData();  //pemanggilan overriding
                panggilKonstruktor(1);  //pemanggilan overloading
                System.out.print("DATA BERHASIL DITAMBAHKAN. TEKAN ENTER UNTUK KEMBALI KE MENU UTAMA. ");
                input.nextLine();
                while (true){
                    System.out.println("\n=================================================");
                    System.out.println("========== SISTEM PENERIMAAN JASA JOKI ==========");
                    System.out.println("================== GAME ONLINE ==================");
                    System.out.println("=================================================\n");
                    System.out.println("MENU UTAMA");
                    System.out.println("1. TAMPILKAN ORDERAN ANDA");
                    System.out.println("2. UBAH ORDERAN ANDA");
                    System.out.println("3. HAPUS ORDERAN ANDA");
                    System.out.println("4. EXIT\n");    
                    System.out.print("MASUKKAN PILIHAN ANDA : ");
                    int menu2;
                    menu2 = input.nextInt();
                    input.nextLine();
                    if (menu2 == 1){
                        dataPelanggan();
                        System.out.println("TEKAN ENTER UNTUK MELANJUTKAN.");
                        input.nextLine();
                    }else if (menu2 == 2){
                        System.out.println("\nSILAKAN MASUKKAN DATA BARU ANDA");
                        inputData();
                        int b = 0;
                        for(int i = 0; i < enc.pelanggan.size(); i++){
                            b = i;
                        }
                        panggilKonstruktor(3,b);  //pemanggilan overloading
                        System.out.println("DATA BERHASIL DIUBAH. TEKAN ENTER UNTUK MELANJUTKAN.");
                        input.nextLine();
                    }else if (menu2 == 3){
                        int b = 0;
                        for(int i = 0; i < enc.pelanggan.size(); i++){
                            b = i;
                        }
                        enc.hapus(b);
                        System.out.println("DATA BERHASIL DIHAPUS. TEKAN ENTER UNTUK KEMBALI KE MENU UTAMA.");
                        input.nextLine();
                        break;
                    }else if (menu2 == 4){
                        break;
                    }else{
                        System.out.println("Perintah Yang Anda Masukkan Salah. Tekan Enter Untuk Kembali.");
                        input.nextLine();
                    }
                }
            }else if (menu == 2){
                break;
            }else{
                System.out.println("Perintah Yang Anda Masukkan Salah. Tekan Enter Untuk Kembali.");
                input.nextLine();
            }
        }
    } 
}