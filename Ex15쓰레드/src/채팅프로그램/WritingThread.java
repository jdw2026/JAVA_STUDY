package 채팅프로그램;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//채팅을 작성하고 작성한 채팅을 -> 어딘가로 내보내야함 그곳은 서버.
//채팅을 사용자가 작성하고 그 채팅을 서버로 보내는작업
public class WritingThread extends Thread{//멀티쓰레딩이 가능하게끔-> 사용자들끼리 동시채팅 가능
	
	//1. 소켓이 필요함 - 임포트해주기
	private Socket socket = null; //클라이언트가 채팅을 보낼 서버의 소켓 정보 저장.
								// 목적지 저장
	
	Scanner sc = new Scanner(System.in);
	
	
	public WritingThread(Socket socket) {//socket : 실제 서버 소켓 정보
		this.socket = socket;
	}
	
	//쓰레드가 수행할 한가지 작업
	public void run() {//클라이언트가 작성한 채팅을 서버로 보내기
		
		//클라이언트 기준으로 작성한 채팅(데이터)을 서버로 전송할 수 있는 통로
		//클라이언트 -> 서버로 나가는 것이기 때문에 output
		try {
			OutputStream out = socket.getOutputStream();
			
			//통로를 통해서 데이터(텍스트)를 출력할 때 쓰는 객체
			//true : autoflush (자동으로 버퍼에 쌓인 데이터를 전송)
			PrintWriter writer = new PrintWriter(out, true); //out이라는 통로로 출력 
		
			while(true) {
				//키보드로 입력한 값을 내보내는역할
				writer.println(sc.nextLine());
			}
		
		
		
		} catch (IOException e) {
			//만약에 소켓정보가 잘못된경우 스트림이 정상적으로 생성되지 않을수 있기 때문에 예외처리해주기.
			e.printStackTrace();
		}
	}
	

}
