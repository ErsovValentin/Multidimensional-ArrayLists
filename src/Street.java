import java.util.ArrayList;
import java.util.Random;

//Class Street comprises of Houses


public class Street {
	String name_str ;
	ArrayList<House>houses;
	
	
	// Default constructor whit random 

	public Street() 
	{
		String [] streets = {"Butuceni","31 August 1989","Donici","Hijdeu","Puskin","Sciusev","Mircea cel Batrin"};
		name_str = streets[new Random().nextInt(streets.length)];
		
		int q_houses = 1 + new Random().nextInt(5);
		houses = new ArrayList<House>();
		for(int i = 0;i < q_houses;i++)
		{
			houses.add(new House(i+1));
		}
	}
	
	// Output Street

	public void printStreet() 
	{
		System.out.println("      Street : "+name_str);
		for(House a:houses)
		{
			a.printHouse();
		}
	}
	
	// Get() - methods

	public ArrayList<House> getHouses() {
		return houses;
	}
	
	public String getName_str() {
		return name_str;
	}
	
	// Set() - methods

	public void setHouses(ArrayList<House> houses) {
		this.houses = houses;
	}
	
	public void setName_str(String name_str) {
		this.name_str = name_str;
	}
	
}
