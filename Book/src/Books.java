
public class Books {

	private String bookName;
	private String bookWriter;
	private int stock;
	private int unitPrice;
	// 매소드(행동)
	// 생성자 작성
	// 클래스와 이름이 동일하다
	// 리턴이 없다
	// 일반적인 경우 public으로 작성을 해야만 객체 생성이 가능
	// 특수한 경우 (싱글턴- 객체 여러가지 방지)를 제외하고는 public
	// 프로그래머가 생성자를 만들지 않으면 java에서 자동으로 아래와 같은 기능을 하는 생성자를 자동으로 만들어 준다 - 기본 생성자 (디폴트 생성자)
	// 객체의 다양한 생성을 위해서 매소드 오버로딩을 지원
	// 매소드 오버로딩
	// - 같은 이름의 매소드(함수)를 여러개 작성이 가능
	// - 단, 매개변수 정보(타입, 갯수)가 다랄야 한다
	public Books()
	{
		bookName = "";
		bookWriter = "";
		unitPrice =0;
	}
	public Books(String title, String bookWrit)
	
	public String getbookName() {
		return bookName;
	} 
	
	public String getBookWriter() {
		return bookWriter;
	}
	
	public int getstock() {
		return stock;
	}
	
	public int setstock() {
		return stock;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int newUnitPrice) {
		if(newUnitPrice > 0)
			unitPrice = newUnitPrice;
	}
}
