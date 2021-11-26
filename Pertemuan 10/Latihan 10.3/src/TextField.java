import java.util.Scanner;

public class TextField {
	public static void main (String[]args)
	{
		Scanner input = new Scanner (System.in);
		System.out.println("Masukkan bilangan integer :");
		try {
			int Angka = input.nextInt();
			System.out.println("Bilangan integer " + Angka);
		}
		catch(Exception ex) {
			System.out.println("Bilangan bukan integer ");	
		}
		
	}
}
