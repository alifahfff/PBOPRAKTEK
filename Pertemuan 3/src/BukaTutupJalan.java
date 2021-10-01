import java.util.Scanner;

public class BukaTutupJalan {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] nomor = new String[4];
		
		nomor[0]=sc.next();
		nomor[1]=sc.next();
		nomor[2]=sc.next();
		nomor[3]=sc.next();
		
		String plat = nomor[0] + nomor[1] + nomor[2] + nomor[3];
		
		long i = Long.parseLong(plat);
		
		if((i-999999)%5==0) {
			System.out.print("Berhenti");
		}else {
			System.out.print("Jalan");
		}
	}
	
}
