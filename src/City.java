import java.util.ArrayList;
import java.util.Random;

//Class City comprises of Streets

public class City {
	String name_city;
	ArrayList<Street>streets;//Array List of objects(Class Street)
	
	// Default constructor whit random 
	public City() {
		String [] cities = {"Balti","Chisinau","Orhei","Comrat"};
		name_city = cities[new Random().nextInt(cities.length)];
		
		streets = new ArrayList<Street>();
		int q_streets = 1 + new Random().nextInt(5);
		for(int i=0;i<q_streets;i++)
		{
			streets.add(new Street());
		}
	}
	
	// Output City
	public void printCity()
	{
		System.out.println("      City : "+ name_city);
		for(Street a: streets)
		{
			a.printStreet();
		}
	}
	
	// Get() - methods

	public String getName_city() {
		return name_city;
	}
	
	public ArrayList<Street> getStreets() {
		return streets;
	}
	
	// Set() - methods

	public void setName_city(String name_city) {
		this.name_city = name_city;
	}
	
	public void setStreets(ArrayList<Street> streets) {
		this.streets = streets;
	}
	
}
