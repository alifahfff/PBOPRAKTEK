
public class Customer {
	private String NamaCustomer;
	private String NoCustomer;
	
	public String getNamaCustomer() {
		return NamaCustomer;
	}
	public void setNamaCustomer(String namaCustomer) {
		NamaCustomer = namaCustomer;
	}
	public String getNoCustomer() {
		return NoCustomer;
	}
	public void setNoCustomer(String noCustomer) {
		NoCustomer = noCustomer;
	}
	
	public void InfoCustomer() {
		System.out.println("Nama Customer 	: " + this.NamaCustomer);
		System.out.println("Nomor Telpon Customer	: " + this.NoCustomer);
	}
}
