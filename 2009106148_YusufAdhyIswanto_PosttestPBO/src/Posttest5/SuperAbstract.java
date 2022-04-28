package Posttest5;

import java.util.Scanner;
import java.util.ArrayList;

public abstract class SuperAbstract { //Penerapan Abstract
    static int menu,a;
    static Scanner input = new Scanner(System.in);
    static String nama,game,tier,login,email,pass;

    public abstract void inputData(); //Penerapan Abstract
    
    static final void panggilKonstruktor(int pil){  //overloading //Penerapan Final
        Dataku enc = new Dataku();
        enc.setNama(nama);
        enc.setGame(game);
        enc.setTier(tier);
        enc.setLogin(login);
        enc.setEmail(email);
        enc.setPass(pass);
        new Dataku(enc.getNama(), enc.getGame(), enc.getTier(), enc.getLogin(), enc.getEmail(), enc.getPass(),pil,0);
    }
    
    static final void panggilKonstruktor(int pil, int a){  //overloading //Penerapan Final
        Dataku enc = new Dataku();
        enc.setNama(nama);
        enc.setGame(game);
        enc.setTier(tier);
        enc.setLogin(login);
        enc.setEmail(email);
        enc.setPass(pass);
        new Dataku(enc.getNama(), enc.getGame(), enc.getTier(), enc.getLogin(), enc.getEmail(), enc.getPass(),pil,a);
    }
    
    static final void pilih(int pil){ //Penerapan Final
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
}
