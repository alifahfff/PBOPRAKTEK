import java.util.Scanner;

public class InputnOutput2 {

    public static void main(String[] args) {
    		
    	   	String[] kata = new String[3]; // deklarasi array string buat  kata
            int[] angka = new int[3]; // deklarasi array int buat angka
           
            Scanner sc=new Scanner(System.in);
            for(int n=0;n<3;n++) {	//perulangan biar bisa masukin 3 kali langsung
            	kata[n] = sc.next();
            	angka[n] = sc.nextInt();
            }
            
            System.out.println("================================");
            for(int i=0;i<3;i++){
                System.out.printf("%-14s %03d\n", kata[i], angka[i]);
            }
            System.out.println("================================");

    }
}