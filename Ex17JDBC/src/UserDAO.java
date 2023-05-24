import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO {
	//DAO : data access object 
	//데이터에 접근하는 기능을 가지고 있다.
	
	
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;


	//1. DB연결
	public void getConn() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id2 = "service";
			String pw2 ="12345";
			
			conn = DriverManager.getConnection(url, id2, pw2);
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
	}
	
	//3.연결 해제
	public void close() {
		try{
			 if(rs != null) {
					rs.close();
			 }
			 if(pstm != null) {
				 pstm.close();
			 }
			 if(conn != null) {
				 conn.close();
			 }
			 
		 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	//로그인 기능
	public String login(String inputId, String inputPw) {
		getConn();
		 String nick = null;
		try {
			String sql = "select nick from member where id=? and pw=?";
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,inputId);  
			pstm.setString(2,inputPw);

			rs = pstm.executeQuery();
			
				if(rs.next()) {
				   nick = rs.getString("nick");
				}
			
		}catch (SQLException e) {
			System.out.println("쿼리문 오류");
			e.printStackTrace();
		}
		close();
		return nick;
	}
	
	
	//회원가입 기능
	public int join(String inputId, String inputPw, String inputNick) {
		
		
		getConn();
		int result = 0;
		
		try {
			String sql = "insert into member values(?,?,?)";
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,inputId);  
			pstm.setString(2,inputPw);
			pstm.setString(3,inputNick);

			result = pstm.executeUpdate();
			
			
		}catch (SQLException e) {
			System.out.println("쿼리문 오류");
			e.printStackTrace();
		}
		close();
		return result;
	}
	
	
	//전체회원 조회
	public ArrayList<UserDTO> userList() {
		getConn();
		ArrayList<UserDTO> userList = new ArrayList<UserDTO>();
		
		try {
			String sql = "select * from member";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String nick = rs.getString("nick");

				 UserDTO dto = new UserDTO(id, pw, nick);
				 userList.add(dto);
			}
			
			
		}catch (SQLException e) {
			System.out.println("쿼리문 오류");
			e.printStackTrace();
		}
		close();
		return userList;
	}
	
	
	
	
	
	
}
