
public class Person  
{
	
	private String name;
	private int age;
	private String id;
	private int password;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getid() {
		return id;
	}
	
	public int getpassword() {
		return password;
	}
	
	public Person() {
		name = "";
		age = 0;
		id = ""; 
	}
	
	public void Create(String newName, int newAge)
	{
		name = newName;
		age = newAge;
	}
}
