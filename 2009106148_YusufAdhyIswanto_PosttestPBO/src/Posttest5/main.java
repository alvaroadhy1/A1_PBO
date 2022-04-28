package Posttest5;

import java.util.Scanner;

public class main {
    static int menu;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Direktur dir = new Direktur();
        Admin adm = new Admin();
        Customer cst = new Customer();
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
                String userIn, passIn;
                
                System.out.print("Masukkan Username : ");
                userIn = input.nextLine();
                
                System.out.print("Masukkan Password : ");
                passIn = input.nextLine();
                
                if (userIn.equalsIgnoreCase(dir.getUsDir()) && passIn.equalsIgnoreCase(dir.getPassDir())){
                    dir.menuDirektur();
                }else{
                    System.out.println("Username & Passsword Tidak Cocok. Tekan Enter untuk kembali");
                    input.nextLine();
                }
                
            }else if(menu == 2){
                String userIn, passIn;
                
                System.out.print("Masukkan Username : ");
                userIn = input.nextLine();
                
                System.out.print("Masukkan Password : ");
                passIn = input.nextLine();
                
                if (userIn.equalsIgnoreCase(adm.getUsDir()) && passIn.equalsIgnoreCase(adm.getPassDir())){
                    adm.menuAdmin();
                }else{
                    System.out.println("Username & Passsword Tidak Cocok. Tekan Enter untuk kembali");
                    input.nextLine();
                }
                
                
            }else if (menu == 3){
                cst.menuCustomer();
            }else if (menu == 4){
                break;
            }else{
                System.out.println("Perintah Yang Anda Masukkan Salah. Tekan ENTER Untuk Kembali.");
                input.nextLine();
            }
        }
    }
}
