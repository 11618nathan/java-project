
public class Deposit {
	// 입금
	private String accountNumber;	//통장번호
	private int password;			//비밀번호
	private String bankName;		//은행명
	private String accountNumberTo;	//받는사람 계좌번호
//	private int confirmedAmount;	//금액확인
	
	
	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getAccountNumberTo() {
		return accountNumberTo;
	}


	public void setAccountNumberTo(String accountNumberTo) {
		this.accountNumberTo = accountNumberTo;
	}


	/*
	public int getCashDeposit() {
		return cashDeposit;
	}


	public void setCashDeposit(int cashDeposit) {
		this.cashDeposit = cashDeposit;
	}


	public int getCheckDeposit() {
		return checkDeposit;
	}


	public void setCheckDeposit(int checkDeposit) {
		this.checkDeposit = checkDeposit;
	}
	*/

	public String getAccountNumber() {
		return accountNumber;
	}


	public int getPassword() {
		return password;
	}


	
	public Deposit(){}
	public Deposit(String uAccountNumber, int uPassword, String rBankName, String rAccountNumber){
		uAccountNumber = accountNumber;
		uPassword = password;
		rBankName = bankName;
		rAccountNumber = accountNumber;
	}
	
	
	public void deposit(int deposit){
		if(deposit <= 0) {
			System.out.println("금액을 정확히 입력하세요 : ");
			return;
		}
		balance += deposit;
	}
}
