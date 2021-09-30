import java.io.*;
import java.util.*;
import java.util.regex.*; 

public class main {
	   public static void main(String args[]){  

		   	System.out.printf("Masukan kata :");
		    Scanner sc=new Scanner(System.in);
		   	String pesan=sc.nextLine();
		    
		   	String[] kata=pesan.split("\\s");
		   	System.out.println(kata.length);
		    for(String n:kata){ 
		       System.out.println(n);  
		      }  
	   }
}
