import java.util.Random;

public class Citizen {
	String name;
	int age;
	boolean sex;
	
	//Default Constructor
	public Citizen() {
		int s = new Random().nextInt(2);
		if(s == 1)
		{
			sex = true;
		}
		else 
		{
			sex = false;
		}
		
		String [] Wnames = {"Helena","Clarisa","Ada","Iris","Penny"};
		String [] Mnames = {"Jonatan","George","Erik","Leon","Cris"};
		if(sex == true)
		{
			name = Mnames [new Random().nextInt(Mnames.length)];
		}
		else
		{
			name = Wnames [new Random().nextInt(Wnames.length)];
		}
		
		age = 1 + new Random().nextInt(100);
	}
	
	//Method output object of Citizen
	public void printCitizen()
	{
		System.out.println("                Name : "+ name);
		System.out.println("                Age : "+ age);
		if(sex == true)
		{
			System.out.println("                Sex : Male");
		}
		else
		{
			System.out.println("                Sex : Female");
		}
	}
	
	// Get () - methods
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean getSex() {
		return sex;
	}
	
	// Set() - methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSex(boolean sex) {
		this.sex = sex;
	}
}
