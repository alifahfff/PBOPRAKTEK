
public class Toko {
	private String dfood;
	private double hargaDfood, totalHarga;
	
	public String getDfood() {
		return dfood;
	}
	public void setDfood(String dfood) {
		this.dfood = dfood;
	}
	public double getHargaDfood() {
		return hargaDfood;
	}
	public void setHargaDfood(double hargaDfood) {
		this.hargaDfood = hargaDfood;
	}
	public double getTotalHarga() {
		return totalHarga;
	}
	public void setTotalHarga(double totalHarga) {
		this.totalHarga = totalHarga;
	}
	
	public void BuatPesanan() {
		System.out.println("Merk Dry food 	: " + this.dfood);
		System.out.println("Total belanja 	: " + this.totalHarga);
	}
}
