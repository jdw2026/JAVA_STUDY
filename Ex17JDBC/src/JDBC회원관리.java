import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBC회원관리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. 로그인    2.회원가입   3.닉네임 조회  4.종료
		
		UserDAO dao = new UserDAO();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		int select;
		while(true) {
			System.out.print("[1]로그인 [2]회원가입 [3]전체회원 조회 [4]종료 >> ");
			select = sc.nextInt();
		
			if(select==1) {
				System.out.println("================ 로그인 ================");
				System.out.print("id 입력 : ");
				String inputId = sc.next();
				System.out.print("pw 입력 : ");
				String inputPw = sc.next();
				//입력받은 ID,PW가 DB에 있는 내용과 맞다면 NICK 님 환영합니다 출력

				//계속 반복되는 db 연결~ 해제하기까지 userdao클래스에 넣어 불러 쓰기.
//				try {
//					Class.forName("oracle.jdbc.driver.OracleDriver");
//					
//					String url = "jdbc:oracle:thin:@localhost:1521:xe";
//					String id2 = "service";
//					String pw2 ="12345";
//					
//					conn = DriverManager.getConnection(url, id2, pw2);
//				}catch (ClassNotFoundException | SQLException e) {
//					e.printStackTrace();
//				} 
				
				//2. 쿼리문 실행
			    //연결, 연결해제는 userdao에서 로그인, 회원가입 기능에 넣어주면 로그인, 회원가입 기능만 쓰면됨.
				String nick = dao.login(inputId, inputPw);
				if(nick != null) {
					System.out.println(nick+"님 환영합니다");
				}
				
//				try {
//					String sql = "select nick from member where id=? and pw=?";
//					
//					pstm = conn.prepareStatement(sql);
//					pstm.setString(1,inputId);  
//					pstm.setString(2,inputPw);
//
//					rs = pstm.executeQuery();
//					
//						if(rs.next()) {
//								 String nick = rs.getString("nick");
//									System.out.println(nick+"님 환영합니다");
//						}
//					
//				}catch (SQLException e) {
//					System.out.println("쿼리문 오류");
//					e.printStackTrace();
//				}
				
				//3.연결 해제
			
				
//				try{
//					 if(rs != null) {
//							rs.close();
//					 }
//					 if(pstm != null) {
//						 pstm.close();
//					 }
//					 if(conn != null) {
//						 conn.close();
//					 }
//					 
//				 } catch (SQLException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
				
		
			}else if(select==2) {
				System.out.println("================ 회원가입 ================");
				System.out.print("id 입력 : ");
				String inputId = sc.next();
				System.out.print("pw 입력 : ");
				String inputPw = sc.next();
				System.out.print("닉네임 입력 : ");
				String inputNick = sc.next();
				
				//JDBC 실행순서
				//1. DB연결

				//2. 쿼리문 실행
				int result = dao.join(inputId, inputPw, inputNick);
				if(result>0) {
					System.out.println("회원가입이 완료되었습니다");
				}else {
					System.out.println("회원가입 실패");
				}
				//3.연결 해제

				
			}else if(select==3) {
				System.out.println("================ 전체회원 조회 ================");
				ArrayList<UserDTO> userList = dao.userList(); 
				for(int i=0; i<userList.size(); i++) {
					String id = userList.get(i).getId();
					String pw = userList.get(i).getPw();
					String nick = userList.get(i).getNick();
					System.out.print("ID : "+id+" PW : "+pw + " NICK : "+nick);
					System.out.println();
				}

				
			}else if(select==4) {
				System.out.println("프로그램을 종료합니다");
				break;
				
			}else {
				System.out.println("번호를 다시 입력하세요");
			}
			
		}
		
		
		

	}
	


}
