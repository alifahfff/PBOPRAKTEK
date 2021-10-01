import java.util.*;

public class Berhitung {
	public static void main (String args[]) {
		 int hasil;
		 Scanner sc=new Scanner(System.in);
		 String input = sc.nextLine();
		 
		 String[] nilai = input.split(" ");
		 int a = Integer.parseInt(nilai[0]); //parseint ngerubah string jadi int 
		 int b = Integer.parseInt(nilai[2]); //parseint ngerubah string jadi int 
		 
		 if (1 <= a && b <= 1000){
			 switch(nilai[1]) {
				 case "+":
						 hasil = a + b;
						 System.out.println(hasil);
						 break;
				 case "-":
						 hasil = a - b;
						 System.out.println(hasil);
						 break;
				 case "*":
						 hasil = a * b;
						 System.out.println(hasil);
						 break;
				 case "%":
						 hasil = a % b;
						 System.out.println(hasil);
						 break;
				 case "/":
					 	hasil = a / b;
					 	System.out.println(hasil);
					 	break;
			 
			 }
		 }else {
             System.out.println("angka salah silahkan masukkan angka sesuai aturan! (1 ≤ A, B ≤ 1.000)");
         }	 
	}
}

