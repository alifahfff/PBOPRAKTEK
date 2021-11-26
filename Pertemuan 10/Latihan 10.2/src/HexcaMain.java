import java.util.Scanner;

public class HexcaMain {
	public static int parseHexInt(String hex) {
	    try {
	        return Integer.parseInt(hex, 16);
	    } catch (NumberFormatException e) {
	        return 0;
	    }
	}
	
	
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukkan bilangan : ");
		String hexaDes = sc.next();
		sc.close();
		
		int inputHex = parseHexInt(hexaDes);
		if(inputHex != 0)
		{
			System.out.println(hexaDes + " bilangan hexadesimal");
			System.out.println("Nilai desimal : " + inputHex);
		}else
			System.out.println(hexaDes + " bukan bilangan hexadesimal");
	}
}
