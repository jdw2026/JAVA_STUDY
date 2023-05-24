import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC테이블추가 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("직원이름 입력 >> ");
			String inputName = sc.next();
			System.out.print("비밀번호 입력 >> ");
			String inputPw = sc.next();
			System.out.print("성별 입력 >> ");
			String inputGender = sc.next();
			System.out.print("나이 입력 >> ");
			int inputAge = sc.nextInt();
			System.out.print("연봉 입력 >> ");
			int inputMoney = sc.nextInt();
			
			//1. DB 연결
			Connection conn = null;
			
			//쿼리문을 실행시키는 객체
			//자바에서 문자열로된 쿼리문을 oracle의 쿼리문으로 바꿔서 실행시켜준다.
			PreparedStatement pstm = null;
			
			//쿼리문을 통해서 발생한 응답(데이터)를 담을 수 잇는 객체
			ResultSet rs = null;
			
			
			try {
				//db 연결할 수 있는 외부 클래스 가져오기 
				//연결될수도 안될수도 있으니 트라이 캐치문에 넣기.
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//연결시 필요한값(url, id, pw)
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String id = "service";
				String pw ="12345";
				
				//매니저를 통해서 db에 접속하겠다.
				//-->자바와 db의 통로를 만들어준다.
				//밑에 줄은 오라클들어가서 비번, 패스워드 넣고 엔터 치는거랑 똑같다고 보면됨.
				//이것도 연결될수도 있고 안될수도 있어서 캐치문에 하나더 추가되게 해주기.
				conn = DriverManager.getConnection(url, id, pw);
				System.out.println("접속 성공");
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("접속실패");
				e.printStackTrace();
			} 
			
			
			//2. 접속후 실행하고 싶은 쿼리문 실행
			
			try {
				//(3)이름, 비밀번호, 성별, 나이, 연봉 데이터를 입력받아서 데이터를 추가하기
				//insert into 직원 values (직원id_seq.nextval,'1234','승환','남',20,null,'123-123',3000,'D006');
			
				String sql = "insert into 직원 values('A000011',?,?,?,?,null,'123-123',?,'D006')";

				
				pstm = conn.prepareStatement(sql);
				pstm.setString(1,inputPw);  //첫번째 물음표에는 인풋네임을
				pstm.setString(2,inputName);  // 두번째 물음표에는 인풋패스워드
				pstm.setString(3,inputGender);  
				pstm.setInt(4,inputAge);  
				pstm.setInt(5,inputMoney);  
				
				//쿼리문이 오라클에 써졌다면 업데이트 시켜주세요.
				//rs = pstm.executeQuery(); -> 데이터 변경없이 조회만할때 사용
				int result = pstm.executeUpdate();  //-> insert, update, delete 같이 데이터 변경이 있을때 사용 / 변경된 행의 갯수를 반환
				if(result>0) {
					System.out.println("회원가입 성공!");
				}
				
				
				
				//while 이 아닌 if로 쓰면 처음에 있는 이름만 출력됨.
				//rs.next() -> 주소값을 바꿔서 데이터가 있는지 없는지 판단
				//-> boolean type
				
				
				
						
				
				
			} catch (SQLException e) {
				System.out.println("쿼리문 오류");
				e.printStackTrace();
			}
			
			
			//3.db 연결 끊기 --> 역순으로 없애주기
//			 try{
//				 if(rs != null) {
//					rs.close();
//				}
//				 if(pstm != null) {
//					 pstm.close();
//				 }
//				 if(conn != null) {
//					 conn.close();
//				 }
//				 
//			 } catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}


		}


}
