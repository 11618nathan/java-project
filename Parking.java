class Car  // Â÷!!
{
	private String carNo;
	private String carPlace;
	private String time;
	private String carType;
	
	
	public String getCarPlace() {
		return carPlace;
	}
	public void setCarPlace(String carPlace) {
		this.carPlace = carPlace;
	}
	public String getCarNo() {
		return carNo;
	}
	public String getTime() {
		return time;
	}
	public String getCarType() {
		return carType;
	}
	public Car()
	{
		System.out.println("Car() È£Ãâ");
	}
	public Car(String carNo, String time, String carPlace, String carType) 
	{
		this.carNo = carNo;
		this.time = time;
		this.carPlace = carPlace;
		this.carType = carType;
		System.out.println("Car(String carNo, String time, String carPlace, String carType)");
	}
	public void show()
	{
		System.out.println(
				"CarNo : " + this.carNo + " Time : " + this.time +" Place : " + this.carPlace + " Type : " + this.carType);
	}
}

public class Parking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car [] Cars;
		Cars = new Car[5];
		Cars[0] = new Car("1234","12:00","1","Pride");
		Cars[1] = new Car("5678","11:30","2","Porsche");
		Cars[2] = new Car("0987","14:32","3","Benz");
		Cars[3] = new Car("6543","09:48","4","Audi");
		Cars[4] = new Car("1350","07:30","5","Santafe");
		
		for(int i = 0; i<Cars.length; i++)
		{
			Cars[i].show();
		}
	}

}
