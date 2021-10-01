import java.util.Scanner;

public class GajiAgent {
	public static void main(String[] args){
    	int a , gaji, bonus, total, kurang;
    	
        Scanner sc = new Scanner(System.in);
        
        for(;;) {
        a = sc.nextInt();
        if (a >= 40) {
        	total = a * 50000;
        	bonus = (int) 0.25 * total ;
        	gaji = 500000 + bonus;
        }else if (a > 80) {
        	total = a * 50000;
        	bonus = (int) 0.35 * total;
        	gaji = 500000 + bonus;
        }else if (a < 15) {
        	total = 15 - a;
        	kurang = (int) (0.15 * 50000) * total;
        	gaji = 500000 - kurang;
        }else{
            bonus = (int) (0.10*50000)*a;
            gaji = 500000+bonus;
        }
        System.out.println(gaji);
	}
  }
}
