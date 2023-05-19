import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class Controller {
	
	//controller 역할 : 비즈니스 로직 수행.
	//view 로부터 데이터를 받아서 가공 or 처리 역할
	//model의 데이터를 수정하거나 가지고 오는 역할
	//view에 결과를 전달
	
	//곡 5개를 저장할 수 있는 arrayList 생성
	ArrayList<Model> musicList = new ArrayList<Model>(5);
	
	//노래를 재생, 정지 할수 있는 기능을 가진 객체 생성 -> play.jar(MP3player 활용)
	MP3Player mp3 = new MP3Player(); //다른 패키지에 있는건 import해서 가져와야함.
	
	//musicList에 있는 노래 순서를 관리할 수 있는 변수 생성 - 현재 듣고 있는 음악을 기억하는 변수
	int index = 0; //전역변수 : 모든 메소드들이 공유할 수 있도록 클래스 아래에 쓴다.(특정 메소드 안에쓰지 않고)
	
	//생성자
	public Controller() {
		//controller 객체가 생성이 되자마자 음악을 미리 세팅! -> 바로 재생 가능하도록 만들기.
		//Model m = new Model();
		//musicList.add(m);
		//위에 두줄을 합쳐서 아래의 한줄로... 모델객체를 생성한것을 뮤직리스트에 넣겠다는 의미
		//  / -> 슬러시는 폴더안에 들어감
		musicList.add(new Model("attention","뉴진스",30,"music/attention.mp3")); 
		musicList.add(new Model("cookie","뉴진스",50,"music/cookie.mp3"));
		musicList.add(new Model("ditto","뉴진스",100,"music/ditto.mp3")); 
		musicList.add(new Model("hypeboy","뉴진스",10,"music/hypeboy.mp3")); 
		musicList.add(new Model("OMG","뉴진스",60,"music/OMG.mp3")); 
		
	}
	
	
	//재생기능
	public void play() {
		//현재 재생중인 음악이 있는지. 메서드이름앞에is가 붙으면 불리언타입
		if(mp3.isPlaying()) {
			//현재 재생중인 음악 정지
			mp3.stop();
		}
		//index가 가르키고 있는 위치에 음악을 재생
		mp3.play(musicList.get(index).getMusicPath());
		show();
	}
	
	//정지기능
	public void stop() {
		mp3.stop(); //현재 재생중인 음악 정지
	}
	
	//다음곡 재생
	public void next() {
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		
		if(index < musicList.size()-1) {//인덱스가 0~3은 1증가
			index++; //인덱스 1증가
		}else { //인덱스가 4가 되면 인덱스를 0으로 초기화  -> 어레이리스트 크기가 5라서 넘어가면 에러뜨기때문에..
			index = 0;
		}
		mp3.play(musicList.get(index).getMusicPath());
		show();
		
	}
	
	//이전곡 재생           
	public void befor() {
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		if(index > 0) {
			index--;
		}else {//index가 0일때
			index = musicList.size()-1;
		}
		mp3.play(musicList.get(index).getMusicPath());
		show();
	}
	
	//현재 재생중인 곡의 정보를 출력
	public void show() {
		System.out.println(musicList.get(index).getSongName()+" - "
				+ musicList.get(index).getSinger());
		
	}
	
	

}
