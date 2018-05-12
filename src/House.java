import java.util.ArrayList;
import java.util.Random;

//Class House comprises of floors

public class House {
	int number_house;
	ArrayList<Floor> floors;
	
	// Default constructor whit random 

	public House() 
	{
		number_house = 1 + new Random().nextInt(1000);
		int q_floors= 1 + new Random().nextInt(10);
		floors = new ArrayList<Floor>();
		for(int i=0;i<q_floors;i++)
		{
			floors.add(new Floor());
		}
	}
	
	// Constructor with parameters (Number of houses on streets are consistent) 
	public House(int h) 
	{
		number_house = h;
		int q_floors= 1 + new Random().nextInt(10);
		floors = new ArrayList<Floor>();
		for(int i=0;i<q_floors;i++)
		{
			floors.add(new Floor(i+1));
		}
	}
	
	// Output House
	public void printHouse() 
	{
		System.out.println("        Number of HOUSE : "+number_house);
		for(Floor a: floors)
		{
			a.printFloor();
		}
	}
	
	// Get() - methods

	public ArrayList<Floor> getFloors() {
		return floors;
	}
	
	public int getNumber_house() {
		return number_house;
	}
	
	// Set() - methods

	public void setFloors(ArrayList<Floor> floors) {
		this.floors = floors;
	}
	
	public void setNumber_house(int number_house) {
		this.number_house = number_house;
	}
	
}
