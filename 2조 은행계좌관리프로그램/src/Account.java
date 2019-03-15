
public class Account {
	// 인스턴스 필드 : 객체마다 1개씩 생성되는 필드
	private String AccountInfo;				//계좌정보
	private String userName;				//고객
	private String accountNumber;			//계좌번호
	private int password;					//비밀번호
	private int balance;					//잔액
	
	
	public String getAccountInfo(){
		return AccountInfo;
	}
	// 고객 조회
	public String getUserName() {
		return userName;
	}
	// 계좌번호 조회
	public String getAccountNumber() {
		return accountNumber;
	}
	// 비밀번호 조회
	public int getPassword() {
		return password;
	}
	// 비밀번호 변경
	public void setPassword(int password) {
		this.password = password;
	}
	// 잔액 조회
	public int getBalance() {
		return balance;
	}
	
	
	// 생성자 만들기
	// 디폴트 생성자 메소드
	public Account(){}
	// 인스턴스 필드 초기화
	public Account(String uName, String uAccountNumber, int uPassword, int uBalance){
			userName = uName;
			accountNumber = uAccountNumber;
			password = uPassword;
			balance = uBalance;
	}
	
	
	// 메소드

	/*
		// 출금
	public void withdraw(int withdraw){
		if(withdraw > balance){
			System.out.println("잔액이 부족합니다.");
			return;
		}
		if(withdraw <= 0){
			System.out.println("입력하신 금액은 출금하실 수 없습니다.");
			return;
		}
		balance -= withdraw;
	}
	*/
	
	
	public void showBalance(){
		System.out.println("잔액은 " + balance + "입니다.");
	}
	public void deposit(int i) {
		i = 5000;
		System.out.println("잔액은 " + i+balance + "입니다.");
	}
}
