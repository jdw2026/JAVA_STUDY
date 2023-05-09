package 도서관리프로그램;

//책정보만 가지고 있음. 책을 표현하는 클래스
public class BookData { 
	//필드
	private String title;
	private int price;
	private String writer;
	
	
	public BookData(String title,
                    int price,
                    String writer) {
		this.title = title;
		this.price = price;
		this.writer = writer;
		
	}


	public String getTitle() {
		return title;
	}


	public int getPrice() {
		return price;
	}


	public String getWriter() {
		return writer;
	}
	
	
	

}
