import java.util.Random;

public class Room {
	String type;
	double area;
	
	//Default Constructor
	public Room() {
		String [] t = {"Bedroom","WC","Kitchen","Guestroom","Balcony"};
		type = t[new Random().nextInt(t.length)];
		
		area = new Random().nextDouble()*200.0;
	}
	
	//Output object of Class ROOM
	public void printRoom()
	{
		System.out.println("              Type of room : "+type);
		System.out.println("              Area of room : "+area);
	}
	
	// GET() - methods
	public double getArea() {
		return area;
	}
	
	public String getType() {
		return type;
	}
	
	// Set() - methods
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}
