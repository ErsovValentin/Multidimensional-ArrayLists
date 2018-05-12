import java.util.ArrayList;


/*  Hierarchy of multidimensional ArrayLists<Classes> :
 * 
 * Citizen \
 *			=> Flat => Floor => House => Street => City 
 * Room    /
 * 
 */


public class Main {
	public static void main(String [] args)
	{
		ArrayList<City>Moldova = new ArrayList<City>();//ArrayList of City
		Moldova.add(new City());
		//output City
		  ///Moldova.get(0).printCity();
		
		
		
		/* First TASK :
		 * 
		 * Find the house with the maximum number of women
		 * Use only "for each"()
		 * 
		 */
		
		
		City aCity = new City();
		Street aStreet = new Street();
		House aHouse = new House();
		
		int q_max_woman = 0, q_woman= 0;
		for(City city: Moldova)
		{
			for(Street street:city.getStreets())
			{
				for(House house:street.getHouses())
				{ q_woman = 0;
					for(Floor floor : house.getFloors())
					{
						for(Flat flat : floor.getFlats())
						{
							for(Citizen citizen : flat.getCitizens())
							{
								 if(!citizen.getSex())
								 {
									 q_woman++;
								 }
							}
							
						}
					}
					if(q_woman > q_max_woman)
					{
						q_max_woman = q_woman;
						aCity = city;
						aStreet = street;
						aHouse = house;
						
					}
				}
			}
			
		}
		
		System.out.println("City : "+aCity.getName_city());
		System.out.println("  Street : "+aStreet.getName_str());
		System.out.println("    House : "+aHouse.getNumber_house());
		System.out.println("      Quantity of women : "+q_max_woman);
		//aHouse.printHouse();
		
		
		/*Second TASK :
		 * 
		 * Find the oldest man in Moldova  
		 * Use only for() and one variable "oldest"
		 * 
		 */
		
		Citizen oldest = new Citizen();
		oldest.setAge(0);
		
		for(int i1 = 0;i1<Moldova.size();i1++)
		{
			for(int i2 = 0; i2 < Moldova.get(i1).getStreets().size();i2++)
			{
				for(int i3 = 0; i3 < Moldova.get(i1).getStreets().get(i2).getHouses().size();i3++)
				{
					for(int i4 = 0; i4 < Moldova.get(i1).getStreets().get(i2).getHouses().get(i3).getFloors().size();i4++)
					{
						for(int i5 = 0; i5 < Moldova.get(i1).getStreets().get(i2).getHouses().get(i3).getFloors().get(i4).getFlats().size();i5++)
						{
							for(int i6 = 0; i6 < Moldova.get(i1).getStreets().get(i2).getHouses().get(i3).getFloors().get(i4).getFlats().get(i5).getCitizens().size();i6++)
							{
								if (oldest.getAge() < Moldova.get(i1).getStreets().get(i2).getHouses().get(i3).getFloors().get(i4).getFlats().get(i5).getCitizens().get(i6).getAge())
								{
									oldest.setAge(Moldova.get(i1).getStreets().get(i2).getHouses().get(i3).getFloors().get(i4).getFlats().get(i5).getCitizens().get(i6).getAge());
								}
							}
						}
					}
				}
			}
		}
		
		System.out.println("Oldest man in Moldova : ");
		oldest.printCitizen();

		
		/*Third TASK :
		 * 
		 * Find Street with the maximum population density (number of citizens in flats / area of flats)
		 * Use only for each() 
		 * 
		 */
		City bCity = new City();
		Street bStreet = new Street();
		int q_citizens_area = 0;
		int q_area ,q_citizens;
		
		for(City city : Moldova)
		{
			for(Street street : city.getStreets())
			{ q_area = 0;
			  q_citizens = 0;
				for(House house : street.getHouses())
				{
					for(Floor floor : house.getFloors())
					{
						for(Flat flat : floor.getFlats())
						{
							
							q_citizens += flat.getCitizens().size();
							
							
							for(Room room : flat.getRooms())
							{
								q_area += room.getArea();
							}
						}
					}
				}
				if(q_citizens_area < (q_citizens/q_area))
				{
					bCity = city;
					bStreet = street;
				}
			}
		}
		
		System.out.println("Max (q_citizens/area) : ");
		System.out.println(" City: "+bCity.getName_city());
		System.out.println("   Street : " + bStreet.getName_str());
		System.out.println();
		//bStreet.printStreet();
		
	}
}
