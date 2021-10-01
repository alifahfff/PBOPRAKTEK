import java.math.*;
import java.util.Scanner;

public class BigNumber {
   public static void main(String []args){
       
	   //array string buat nampung nilainya
       String[] angka = new String[3];
       
       //scan nilainya pake perulangan biar 2 kali langsung
       Scanner sc = new Scanner(System.in);
       for(int n=0;n<2;n++) {
       	angka[n] = sc.next();
       }
       
       sc.close();
       System.out.println(new BigInteger(angka[0]).add(new BigInteger(angka[1])));
       System.out.println(new BigInteger(angka[0]).multiply(new BigInteger(angka[1])));
   }
}