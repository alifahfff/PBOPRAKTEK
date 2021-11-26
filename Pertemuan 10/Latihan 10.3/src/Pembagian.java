import java.util.Scanner;

public class Pembagian {
	public static void main (String[]args) {
		//try {
			Scanner sc = new Scanner (System.in);
			System.out.println("Masukkan bilangan : ");
			int Angka = sc.nextInt();
			System.out.println("Masukkan pembagi : ");
			int AngkaBagi = sc.nextInt();
			System.out.println("Hasil bagi " + Angka/AngkaBagi);
		
//		catch (Exception ex) {
//			System.out.println("Pembagi tidak boleh 0!");
//		}
	}
}
