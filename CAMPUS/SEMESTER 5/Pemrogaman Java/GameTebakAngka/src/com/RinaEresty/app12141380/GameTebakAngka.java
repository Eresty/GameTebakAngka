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
                   
   
