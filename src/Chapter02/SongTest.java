package Chapter02;

public class SongTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Song song = new Song();
		
		song.setAlbum("Real");
		song.setArtist("아이유");
		song.setComposer("이민수");
		song.setTitle("좋은날");
		song.setTrack(3);
		song.setYear(2010);

	    
	    song.show();
	    
	    
	    Song song2 = new Song("아이유", "좋은날");
	    song2.show();

	}

}
