import java.io.*;
import java.util.*;

class MainClass
{
	public static void main (String[] args)
	{
		
		// Creating the Objects of Book class.
		Album b1 = new Album("Miroh", "3Racha, StrayKids");
		Album b2 = new Album("You Make Me", "Day6");
		Album b3 = new Album("Fever", "Ateez");
	// Creating the list which contains the
	// no. of books.
		List<Album> books = new ArrayList<Album>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		Library library = new Library(books);
		List<Album> bks = library.getTotalAlbumsInLibrary();
		for(Album bk : bks)
		{
		System.out.println("Judul : " + bk.title + " - " + " Produser : " + bk.author);
		}
	}
}
