
public class Model {

	//음악에 대한 데이터만 설계 
	
	//VO(Value Object) - 특정한 객체를 부르는말.
	
	//필드
	private String songName; //음악재목
	private String singer; //가수이름
	private int playTime; //음악길이(s)
	private String musicPath; //음악파일 경로
	
	
	//생성자
	public Model(String songName, String singer, int playTime, String musicPath) {
		//매개인자로 넣어준 값으로 필드 초기화
		this.songName = songName;
		this.singer = singer;
		this.playTime = playTime;
		this.musicPath = musicPath;
	}
	//getter , setter

	public void setSongName(String songName) {
		this.songName = songName;
	}


	public void setSinger(String singer) {
		this.singer = singer;
	}


	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}


	public void setMusicPath(String musicPath) {
		this.musicPath = musicPath;
	}


	public String getSongName() {
		return songName;
	}


	public String getSinger() {
		return singer;
	}


	public int getPlayTime() {
		return playTime;
	}


	public String getMusicPath() {
		return musicPath;
	}
	
	
	
	
	
	
}
