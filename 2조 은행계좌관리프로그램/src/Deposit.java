
public class Deposit {
	// �Ա�
	private String accountNumber;	//�����ȣ
	private int password;			//��й�ȣ
	private String bankName;		//�����
	private String accountNumberTo;	//�޴»�� ���¹�ȣ
//	private int confirmedAmount;	//�ݾ�Ȯ��
	
	
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
			System.out.println("�ݾ��� ��Ȯ�� �Է��ϼ��� : ");
			return;
		}
		balance += deposit;
	}
}
