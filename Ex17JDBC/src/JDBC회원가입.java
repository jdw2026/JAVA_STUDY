import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC회원가입 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("직원이름 입력 >> ");
		String inputName = sc.next();
		System.out.print("비밀번호 입력 >> ");
		String inputPw = sc.next();
		
		
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
			//(1)나이가 40살 이상인 직원의 이름만 출력 시켜주세요.
			//(2)위에서 입력받은 name, pw 를 이용해서 해당하는 직원의 나이를 출력 시켜주세요!
			//String sql ="select * from 직원 where 이름='"+inputName+"'and 패스워드='"+inputPw+"'";
			//위와 아래가 같은 뜻. 이렇게 쓰고나서 밑에 pstm 쪽 보기
			String sql = "select * from 직원 where 이름 = ? and 패스워드 = ? ";
			
			//String sql ="select * from 직원"; 
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,inputName);  //첫번째 물음표에는 인풋네임을
			pstm.setString(2,inputPw);  // 두번째 물음표에는 인풋패스워드
			
			//쿼리문이 오라클에 써졌다면 실행시켜주세요.
			rs = pstm.executeQuery();
			
			//while 이 아닌 if로 쓰면 처음에 있는 이름만 출력됨.
			//rs.next() -> 주소값을 바꿔서 데이터가 있는지 없는지 판단
			//-> boolean type
			
			if(rs.next()) {
				int age = rs.getInt("나이");
				System.out.println("입력한 직원의 나이는 >> "+age);
			}
			
			
			
//			while(rs.next()) {
//				if(rs.getString("이름").equals(inputName) && rs.getString("패스워드").equals(inputPw)) {
//					System.out.println("입력한 직원의 나이는 >> "+rs.getString("나이"));
//				}
//			}
			
			
			
//			while(rs.next()) {//rs.next -> rs가 처음 가리키는 것은 컬럼명들이다. 그 밑으로 내려보내기위해씀.
//				String name = rs.getString(1);
//				System.out.println(name);
				
//				if(rs.getInt(5)>=40) { //()괄호안에 5말고 "나이" 라고 써도됨. 5는 인덱스번호
//					//String name = rs.getString("이름");
//					//getString(인덱스) db에서 인덱스는 1부터 시작이다.
//					String name = rs.getString(3);//위처럼 이름으로 써도되고 인덱스값 3으로 써도됨.
//					System.out.println(name);
//				}
				
//			}
			
			
		} catch (SQLException e) {
			System.out.println("쿼리문 오류");
			e.printStackTrace();
		}
		
		
		
//		3.db 연결 끊기 --> 역순으로 없애주기
//		 try{
//			 if(rs != null) {
//				rs.close();
//			}
//			 if(pstm != null) {
//				 pstm.close();
//			 }
//			 if(conn != null) {
//				 conn.close();
//			 }
//			 
//		 } catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
		
		

	}

}
