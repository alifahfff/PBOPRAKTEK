package kasus3;

public class Sasuke extends Itachi {
	String Dojutsu = "Sharingan";
	
	void printDojutsu() {
		super.printDojutsu(); //untuk menampilkan super class dari dojutsu yaitu Rinegan
		System.out.println(this.Dojutsu);
	}
}
