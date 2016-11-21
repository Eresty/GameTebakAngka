import java.util.Scanner;
public class GameTebakAngka {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Nama Anda: ");
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
        
   


    
    
