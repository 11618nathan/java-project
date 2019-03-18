 

class Car
{
	protected int carNo;
	private int curSpeed;
	public int getCurSpeed() {
		return curSpeed;
	}
	public void setCurSpeed(int curSpeed) {
		this.curSpeed = curSpeed;
	}
	public int getCarNo() {
		return carNo;
	} 
	public Car()
	{
		System.out.println("Car()");
	}
	public void accel()
	{
		curSpeed++;
	}
	public void breaking()
	{
		curSpeed--;
	}
	
}

class Bus extends Car
{
	private int lineNo;
	private boolean bell;
	public boolean isBell() {
		return bell;
	}
	public void setBell(boolean bell) {
		this.bell = bell;
	}
	public int getLineNo() {
		return lineNo;
	}
	public Bus(int carNo, int lineNo)
	{
		this.carNo = carNo;
	 this.lineNo = lineNo;
	 bell = false;
	 System.out.println("Bus(int lineNo)");
	}
	public void go()
	{
		
	}
	public void stop()
	{
		
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus = new Bus(4885);
		System.out.println(bus.getCarNo());
	}

}
