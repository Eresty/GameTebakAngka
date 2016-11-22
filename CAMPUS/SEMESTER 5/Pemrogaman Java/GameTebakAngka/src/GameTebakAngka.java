package com.rinaseptiana.app12141380;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 12141380
 * @author Rina Septiana
 */

public class GameTebakAngka {
    private static Object pemain;
    public static void main(String[] args) {
            ArrayList <String> namaPemain = new ArrayList<>(); // Membuat array Nama Pemain
            ArrayList <Integer> sekorPermainan = new ArrayList<>(); // Membuat array Sekor Pemain
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan 'Nama Anda' atau tekan 'Y' untuk keluar, kemudian tekan enter :  ");
            String cariY = null;
            namaPemain.add(cariY);
            String nama = input.nextLine();
        
        int a = (int)(Math.random() *100);
        int c = 4;
            System.out.println("-----------------------------------------------");
            System.out.println("MARI MENEBAK ANGKA 0 - 100 DENGAN 5X KESEMPATAN");
            System.out.println("-----------------------------------------------");
            
    do{
            System.out.println("");
            System.out.println("BERAPAKAH ANGKA YANG ANDA TEBAK????");
            
            Scanner jawab = new Scanner (System.in);
            int b = jawab.nextInt();
             
            
    if (c > 0 ){
    if ( b == a ){
            System.out.println("CONGRATULATION!!! Angka yang anda masukkan BENAR!");
            
            break;}
    
    else if ( b < a ){
            System.out.println("Sorry..., angka yang anda masukkan terlalu KECIL.");}
        
    else if ( b > a ){
            System.out.println("Sorry..., angka yang anda masukkan terlalu BESAR.");}
            System.out.println("Anda Memiliki " + c + " Kesempatan Lagi");
            System.out.println("");
            c--;}
        
    else{
            System.out.println("---------------------------------------------------");
            System.out.println("ANDA SALAH!!KESEMPATAN TELAH HABIS. SILAHKAN COBA LAGI");
            System.out.println("ANGKA YANG DIMAKSUD ADALAH " + a);
            System.out.println("---------------------------------------------------");
            
            break;
            }
        }
    while ( c >=0 );
            }
        }


    
    
