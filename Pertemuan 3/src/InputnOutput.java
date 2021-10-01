import java.io.*;
import java.util.*;
import java.util.regex.*; 

public class InputnOutput {
	   public static void main(String args[]){  

		   	System.out.printf("Masukan kata :");
		    Scanner sc=new Scanner(System.in);
		   	String pesan=sc.nextLine();
		    
		   	//split string buat misahin inputan yang dimasukkin
		   	String[] kata=pesan.split("[, !._?'@]");
		   	System.out.println(kata.length); //menghitung kata yang udah pisahin pake length
		    for(String n:kata){ 
		       System.out.println(n);  
		      }  
	   }
}
