
public class Books {

	private String bookName;
	private String bookWriter;
	private int stock;
	private int unitPrice;
	// �żҵ�(�ൿ)
	// ������ �ۼ�
	// Ŭ������ �̸��� �����ϴ�
	// ������ ����
	// �Ϲ����� ��� public���� �ۼ��� �ؾ߸� ��ü ������ ����
	// Ư���� ��� (�̱���- ��ü �������� ����)�� �����ϰ�� public
	// ���α׷��Ӱ� �����ڸ� ������ ������ java���� �ڵ����� �Ʒ��� ���� ����� �ϴ� �����ڸ� �ڵ����� ����� �ش� - �⺻ ������ (����Ʈ ������)
	// ��ü�� �پ��� ������ ���ؼ� �żҵ� �����ε��� ����
	// �żҵ� �����ε�
	// - ���� �̸��� �żҵ�(�Լ�)�� ������ �ۼ��� ����
	// - ��, �Ű����� ����(Ÿ��, ����)�� �ٶ��� �Ѵ�
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
