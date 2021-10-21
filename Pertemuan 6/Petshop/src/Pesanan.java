import java.util.*;

public class Pesanan {
	public static void main(String[]args) {
	
		Scanner in = new Scanner (System.in);
		Toko toko = new Toko ();
		Customer customer = new Customer ();
		
		int pilih;
		String nomor;
		String nama;
		
		System.out.println("====== Merk Dry food ======");
		System.out.println("  	Merk				Harga	");
		System.out.println("  1. Whiskas			Rp. 30.000	");
		System.out.println("  2. Me-o				Rp. 35.000	");
		System.out.println("  3. Proplan			Rp. 40.000	");
		
		System.out.print("Pilih merk dryfood :");
		pilih = in.nextInt();
		
		switch (pilih) {
			case 1 :
			{
				System.out.println("Anda memesan whiskas");
				toko.setDfood("Whiskas");
				toko.setHargaDfood(30000.0);
				break;
			}
			case 2 :
			{
				System.out.println("Anda memesan Me-o");
				toko.setDfood("Me-o");
				toko.setHargaDfood(35000.0);
				break;
			}
			case 3 :
			{
				System.out.println("Anda memesan proplan");
				toko.setDfood("Proplan");
				toko.setHargaDfood(40000.0);
				break;
			}
		}
		
		System.out.println("======Isi data Customer=======");
		System.out.print("Nama customer");
		nama = in.next();
		customer.setNamaCustomer(nama);
		System.out.print("Nomor telepon customer");
		nomor = in.next();
		customer.setNoCustomer(nomor);
		
		toko.setTotalHarga(pilih);
		customer.InfoCustomer();
		toko.BuatPesanan();
	}
}



class mamalia {
	String name;
	int jumlahkaki;
	void attack(){
		System.out.println("Lucu");
	}
}