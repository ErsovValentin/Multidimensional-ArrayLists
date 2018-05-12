import java.util.ArrayList;
import java.util.Random;

//Class Flat comprises of Citizens and Rooms

public class Flat {
	int number_apartment;
	ArrayList<Citizen> citizens; //Array List of objects(Citizens)
	ArrayList<Room> rooms;
	
	// Default constructor whit random 
	public Flat() {
		int q_citizens = 1 + new Random().nextInt(5); 
		int q_rooms = 1 + new Random().nextInt(5);
		number_apartment = new Random().nextInt(1000);
		
		citizens = new ArrayList<Citizen>();
		for(int i = 0;i<q_citizens;i++)
		{
			citizens.add(new Citizen());
		}
		
		rooms = new ArrayList<Room>();
		for(int i = 0;i<q_rooms;i++)
		{
			rooms.add(new Room());
		}
	}
	
	// Constructor with parameters (Number of apartments in houses are consistent) 
	public Flat(int number_of_flat) {
		int q_citizens = 1 + new Random().nextInt(5); 
		int q_rooms = 1 + new Random().nextInt(5);
		number_apartment = number_of_flat;
		
		citizens = new ArrayList<Citizen>();
		for(int i = 0;i<q_citizens;i++)
		{
			citizens.add(new Citizen());
		}
		
		rooms = new ArrayList<Room>();
		for(int i = 0;i<q_rooms;i++)
		{
			rooms.add(new Room());
		}
	}
	
	// Output Flat
	public void printFlat()
	{
		System.out.println("            Number of apartment : "+number_apartment);
		for(Room a:rooms)
		{
			a.printRoom();
		}
		for(Citizen a:citizens)
		{
			a.printCitizen();
		}
	}
	
	// Get() - methods
	public ArrayList<Citizen> getCitizens() {
		return citizens;
	}
	
	public int getNumber_apartment() {
		return number_apartment;
	}
	
	public ArrayList<Room> getRooms() {
		return rooms;
	}
	
	// Set() - methods
	public void setCitizens(ArrayList<Citizen> citizens) {
		this.citizens = citizens;
	}
	
	public void setNumber_apartment(int number_apartment) {
		this.number_apartment = number_apartment;
	}
	
	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}
}
