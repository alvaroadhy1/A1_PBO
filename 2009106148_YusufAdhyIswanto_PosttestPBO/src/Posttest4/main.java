package Posttest4;

import java.util.Scanner;
import java.util.ArrayList;

public class main {
    static int menu,a;
    static Scanner input = new Scanner(System.in);
    static String nama,game,tier,login,email,pass;

    static void panggilKonstruktor(int pil){  //overloading
        Dataku enc = new Dataku();
        enc.setNama(nama);
        enc.setGame(game);
        enc.setTier(tier);
        enc.setLogin(login);
        enc.setEmail(email);
        enc.setPass(pass);
        new Dataku(enc.getNama(), enc.getGame(), enc.getTier(), enc.getLogin(), enc.getEmail(), enc.getPass(),pil,0);
    }
    
    static void panggilKonstruktor(int pil, int a){  //overloading
        Dataku enc = new Dataku();
        enc.setNama(nama);
        enc.setGame(game);
        enc.setTier(tier);
        enc.setLogin(login);
        enc.setEmail(email);
        enc.setPass(pass);
        new Dataku(enc.getNama(), enc.getGame(), enc.getTier(), enc.getLogin(), enc.getEmail(), enc.getPass(),pil,a);
    }
    
    static void inputData(){
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
    
    static void pilih(int pil){
        Scanner input = new Scanner(System.in);
        Dataku enc = new Dataku();
        enc.baca();
        if(pil==3){
            System.out.print("INGIN MENGUBAH DATA PELANGGAN KE : ");
        }else if(pil==4){
            System.out.print("INGIN MENGHAPUS DATA PELANGGAN KE : ");
        }
        a = input.nextInt();
        a = a - 1;
        input.nextLine();
    }
    
    public static void main(String[] args) {
        Dataku enc = new Dataku();
        while (true){
            System.out.println("=================================================");
            System.out.println("========== SISTEM PENERIMAAN JASA JOKI ==========");
            System.out.println("================== GAME ONLINE ==================");
            System.out.println("=================================================\n");
            System.out.println("LOGIN SEBAGAI: ");
            System.out.println("1. DIREKTUR");
            System.out.println("2. ADMIN");
            System.out.println("3. CUSTOMER");
            System.out.println("4. EXIT\n");    
            System.out.print("MASUKKAN PILIHAN ANDA : ");
            menu = input.nextInt();
            input.nextLine();
            if (menu == 1){
                Direktur.menuDirektur();
            }else if(menu == 2){
                Admin.menuAdmin();
            }else if (menu == 3){
                Customer.menuCustomer();
            }else if (menu == 4){
                break;
            }else{
                System.out.println("Perintah Yang Anda Masukkan Salah. Tekan ENTER Untuk Kembali.");
                input.nextLine();
            }
        }
    }
}
