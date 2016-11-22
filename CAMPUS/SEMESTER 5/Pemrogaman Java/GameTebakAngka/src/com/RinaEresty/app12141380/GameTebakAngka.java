/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.RinaEresty.app12141380;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 12141380
 * @author Rina Septiana
 */
public class GameTebakAngka {
    public static void main(String[] args) {
        ArrayList <String> namaPemain = new ArrayList<>();
        ArrayList <Integer> sekorPermainan = new ArrayList<>(); 
        Scanner input = new Scanner(System.in); 
        Scanner input2= new Scanner(System.in); 
        Random angkaRandom=new Random(); 
        String cariY; 
        int a = (int)(Math.random() *100);
        int c = 4;
            System.out.println("===============================================");
            System.out.println("MARI MENEBAK ANGKA 1 - 100 DENGAN 5X KESEMPATAN");
            System.out.println("===============================================");
        
    do{
        System.out.println("Masukkan 'Nama Anda' atau tekan 'y' untuk keluar, kemudian tekan enter = ");
        cariY=input.nextLine();
        namaPemain.add(cariY);
        int NilaiJalan = 0; 
        int CekGameOver=0; 
            
        int aKumulasi[]= new int[6]; 
        int NilaiPasJalan=0; 
            
        if(!("y").equals(cariY)){  
            
              // ------------------- START SCRIPT GAME TEBAK ANGKA DISINI -------------------------- //
            
            String nextLevel; 
            int PiLevel=1;   
            System.out.println("Selamat Datang " + cariY);
                
    do{
        int Kout, Ang, Pang;
        System.out.println("# Level " + PiLevel);
        int StarNilaiO=PiLevel-1;    
        Pang=PiLevel*100; 
        System.out.println("Silahkan Tebak Antara 1 s/d " + Pang);
        System.out.println("Anda mempunyai kesempatan menebak 5 kali.");
        int AngKaAcak=angkaRandom.nextInt(Pang); 
                   
    for(Kout=0;Kout<=5;Kout++){
        if(Kout==5){ 
            System.out.println("GAMEOVER! Anda Gagal");
            CekGameOver++; 
            }
        else{  
            System.out.println("Tebakan Anda ? " );
            int AkuTeb=input2.nextInt(); 
            int Kurang=4-Kout;
        if(AkuTeb==AngKaAcak){ 
                                
            if(Kout==0){
                NilaiPasJalan=PiLevel*100; 
                }
            else if(Kout==1){
                NilaiPasJalan=PiLevel*70; 
                }
            else if(Kout==2){
                NilaiPasJalan=PiLevel*50; 
                }
            else if(Kout==3){
                NilaiPasJalan=PiLevel*30; 
                }
            else{
                NilaiPasJalan=0; 
                }
                
            
            int NeTebak=Kout+1;                  
            System.out.println("CONGRATULATION!!! Angka yang anda masukkan BENAR! " + NeTebak + " kali tebakan.");
            System.out.println("Sekor anda adalah " + NilaiPasJalan);
            break;

            }
            else{ 
            if(AkuTeb>AngKaAcak){
                System.out.println("Sorry..., angka yang anda masukkan terlalu BESAR.!"); 
                System.out.println("Anda mempunyai kesempatan " + Kurang + " kali lagi");
                    }
            else{

                System.out.println("Sorry..., angka yang anda masukkan terlalu BESAR.!"); 
                System.out.println("Anda mempunyai kesempatan " + Kurang + " kali lagi");
                                
                }
            }
        }
    }
                    
           