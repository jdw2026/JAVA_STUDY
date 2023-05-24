
public class UserDTO {
	
	//DTO -> Data Transfer Object / 데이터 베이스에 있는 내용을 보여주기 위한 형식을 지정해주는것
	// id pw nick 컬럼을 보여줄거에요하면
	
	//MVC 패턴
	//VO : 프로젝트 안에서 다루는 데이터의 형식 value object
	//M : Model(VO) -->데이터가 보여지는 형식
	//V : View -->사용자에게 보여지는 부분 / 출력은 모두 뷰에서 보여아한다.
	//C : Controller --> 사용자에게 보여지지는 않지만 기능상 데이터를 다루는 부분
	
	//DAO  -> Controller 역할 / 출력문은 없어야 좋다.
	//DTO  -> 데이터
	
	// id pw nick 컬럼을 보여줄거에요하면
	private String id;
	private String pw;
	private String nick;
	
	public UserDTO(String id, String pw, String nick) {
		super();
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getNick() {
		return nick;
	}
	
	
	

}
