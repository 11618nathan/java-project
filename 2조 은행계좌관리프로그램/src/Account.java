
public class Account {
	// �ν��Ͻ� �ʵ� : ��ü���� 1���� �����Ǵ� �ʵ�
	private String AccountInfo;				//��������
	private String userName;				//��
	private String accountNumber;			//���¹�ȣ
	private int password;					//��й�ȣ
	private int balance;					//�ܾ�
	
	
	public String getAccountInfo(){
		return AccountInfo;
	}
	// �� ��ȸ
	public String getUserName() {
		return userName;
	}
	// ���¹�ȣ ��ȸ
	public String getAccountNumber() {
		return accountNumber;
	}
	// ��й�ȣ ��ȸ
	public int getPassword() {
		return password;
	}
	// ��й�ȣ ����
	public void setPassword(int password) {
		this.password = password;
	}
	// �ܾ� ��ȸ
	public int getBalance() {
		return balance;
	}
	
	
	// ������ �����
	// ����Ʈ ������ �޼ҵ�
	public Account(){}
	// �ν��Ͻ� �ʵ� �ʱ�ȭ
	public Account(String uName, String uAccountNumber, int uPassword, int uBalance){
			userName = uName;
			accountNumber = uAccountNumber;
			password = uPassword;
			balance = uBalance;
	}
	
	
	// �޼ҵ�

	/*
		// ���
	public void withdraw(int withdraw){
		if(withdraw > balance){
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		if(withdraw <= 0){
			System.out.println("�Է��Ͻ� �ݾ��� ����Ͻ� �� �����ϴ�.");
			return;
		}
		balance -= withdraw;
	}
	*/
	
	
	public void showBalance(){
		System.out.println("�ܾ��� " + balance + "�Դϴ�.");
	}
	public void deposit(int i) {
		i = 5000;
		System.out.println("�ܾ��� " + i+balance + "�Դϴ�.");
	}
}
