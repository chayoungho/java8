package Day12;

public class Song {
	String title,artist,country;
	int year;
	Song( int year,String country,String artist,String title){
		this.year=year;
		this.country=country;
		this.artist=artist;
		this.title=title;
	
	}
	void show() {
		System.out.println(year+"년"+country+"국적의"+artist+"부른"+title);
	}
	
}
