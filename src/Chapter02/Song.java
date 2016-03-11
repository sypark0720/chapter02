package Chapter02;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	
	public Song (){
		
	}
	
	public Song (String artist, String title, String album, String composer, int track, int year){ //스택에 저장되게 된다.
		this.artist = artist; //heap에 있는 artist에 stack의 artist를 넣는다
		this.title = title;
		this.album = album;
		
	}
	
	
	public Song(String title, String artist){
		//this.title = title;
		//this.artist=artist;
		//this.composer = " ";
		this(artist,title,"no","no",0,0);
	}

	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void show(){
		System.out.println( artist+" "+title+" ( Real, "+year+", "+track+"번 track, "+composer+" 작곡 )");	
		
	}
	
	/*public static void main(String[] args){
		
		Song song = new Song();
		
		song.album = "Real";
	    song.artist = "아이유";
	    song.composer = "이민수";
	    song.title = "좋은날";
	    song.track = 3;
	    song.year = 2010;
	    
	    song.show();
	    
	}*/
	



	
}
