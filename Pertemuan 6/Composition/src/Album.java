import java.io.*;
import java.util.*;


class Album
	{
		public String title;
		public String author;
		Album(String title, String produser) 
		{
			this.title = title;
			this.author = produser;
		}
	}


class Library {

	private final List<Album> albums;
	Library (List<Album> albums)
	{
		this.albums = albums;
	}

public List<Album> getTotalAlbumsInLibrary(){
	return albums;
	}
}
