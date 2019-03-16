
class AccountUser
{ 
	private String deposit;
	private String withdraw;
	private int times;
	private int balance;
	
	public int getbalance()
	{
		return balance;
	}
	public void setbalance(int balance)
	{
		this.balance = balance;
	}
	
	public String getwithdraw() {
		return withdraw;
	}
	
	public void setdeposit(String deposit) {
		this.deposit = deposit;
	}
	
	public void setwithdraw(String withdraw) {
		this.withdraw = withdraw;
	}
	
	public String getdeposit() {
		return deposit;
	}
	
	public int gettimes()
	{
		return times;
	}
	
	public AccountUser()
	{
	   System.out.println("AccountUser() »£√‚");
	}
	
	public AccountUser(String deposit, String withdraw, int times) 
	{
	   this.deposit = deposit;
	   this.withdraw = withdraw;
	   this.times = times;
	   this.balance = balance;
	   System.out.println("AccountUser(String deposit, String withdraw, int times, int balance)");
	}
	public void show()
	   {
	      System.out.println("deposit : " + this.deposit + " withdraw : " + this.withdraw + "times : " + this.times + "balance" + this.balance);
	   }
}

public class Account 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		AccountUser [] AccountUsers;
		AccountUsers = new AccountUser[5];
		AccountUsers[0] = new AccountUser("1234","1234", "1200", "0");
		AccountUsers[1] = new AccountUser("5678","5678", "1300", "0");
		AccountUsers[2] = new AccountUser("0987","0987", "1400", "0");
		AccountUsers[3] = new AccountUser("6543","6543", "1500", "0");
		AccountUsers[4] = new AccountUser("1350","1350", "1600", "0");
	      
	    for(int i = 0; i<AccountUsers.length; i++)
	    {
	    	AccountUsers[i].show();
	    }
	}

}
