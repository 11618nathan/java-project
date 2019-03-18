package spo;

class ele
{
	private int price;

	public int getPrice() {
		return price;
	}
	// 가격 변동
	public void setPrice(int price) {
		this.price = price;
	}
	public ele()
	{
		this(1);
	}
	public ele(int price){
		super();
		this.price = price;
	} 
}

class phone extends ele
{
	private int phoneNo;

	public int getPhoneNo() {
		return phoneNo;
	}
	
	public phone(int price, int phoneNo)
	{
		super(price);
		this.phoneNo = phoneNo;
		System.out.println("phone(int price");
	}
	public void call()
	{
		
	}
	public void send()
	{
		
	}
	
}

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
