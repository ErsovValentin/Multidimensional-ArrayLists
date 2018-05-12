import java.util.ArrayList;
import java.util.Random;

// Class Floor composed of ArrayList class Flats

public class Floor {
	int number_floor;
	ArrayList<Flat>flats;
	
	// Default constructor whit random 
	public Floor() {
		number_floor = 1 + new Random().nextInt(100);
		
		
		int q_apartments = 1 + new Random().nextInt(5);
		flats = new ArrayList<Flat>();
		for(int i = 0;i<q_apartments;i++)
		{
			flats.add(new Flat());
		}
	}
	
	// Constructor with parameters (Number of floors in houses are consistent)
	public Floor(int f) {
		number_floor = f;
		
		int q_apartments = 1 + new Random().nextInt(5);
		flats = new ArrayList<Flat>();
		for(int i = 0;i<q_apartments;i++)
		{
			flats.add(new Flat((f*10)+i+1));
		}
	}
	
	// Output Floor
	public void printFloor() 
	{
		System.out.println("          Number of floor :" +number_floor);
		for(Flat a : flats)
		{
			a.printFlat();
		}
	}
	
	// Get() - methods
	public ArrayList<Flat> getFlats() {
		return flats;
	}
	
	public int getNumber_floor() {
		return number_floor;
	}
	
	// Set() - methods
	public void setFlats(ArrayList<Flat> flats) {
		this.flats = flats;
	}
	
	public void setNumber_floor(int number_floor) {
		this.number_floor = number_floor;
	}
}
