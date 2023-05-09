package 성적관리프로그램;

public class Student {
	//객체의 필드라서 힙영역에 있음
	private String stuName; //함부로 접근할수 없게 private 
	private String stuNum;
	private int javaScore;
	private int dbScore;
	private int webScore;
	
	 
	//생성자
	//객체를 생성할때 최초로 1번만 호출되는 메소드
	//반환타입을 작성하지 않는다 -> void도 안씀
	//클래스 이름과 생성자 이름이 동일하다
	//생성자는 하나 이상 선언되어야 한다
	//(없는 경우 컴파일시에 자동으로 default생성자 추가) 
	public Student(String stuName,  // 지역변수라서 스택영역에 있음.
			       String stuNum,
			       int javaScore,
			       int dbScore,
			       int webScore) {
		this.stuName = stuName;
		this.stuNum = stuNum;
	    this.javaScore = validScore(javaScore);
	    this.dbScore = validScore(dbScore);
	    this.webScore = validScore(webScore);
		//this란 클래스로부터 탄생한 자기자신을 의미하는것.
	}
	
	private int validScore(int score) { //자주쓰는 것을 메소드로 만든다. 이것도 private
		if(score >=0 || score <=100) {
			return score;
		}else {
			return 0;
		}
	}
	//getter 메소드. 앞에는 get뒤에는 필드네임
	public String getStuName() { // 꺼내갈수 있게..
		return stuName;
	}
	public String getStuNum() {//이런 메소드를 getter 메소드라 부른다.
		return stuNum;
	}

	public int getJavaScore() {//마우스 오른쪽 -> 소스-> 제너레이터 게터스 앤드 세터스.. 누르면 자동완성
		return javaScore;
	}

	public int getDbScore() {
		return dbScore;
	}

	public int getWebScore() {
		return webScore;
	}

	//setter 메소드
	//이름이 set 으로 붙음. 
	//세터를 이용해서 수정하고 싶을때 이용. 
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}

	public void setDbScore(int dbScore) {
		this.dbScore = dbScore;
	}

	public void setWebScore(int webScore) {
		this.webScore = webScore;
	}
	
	
	
	
	

}
