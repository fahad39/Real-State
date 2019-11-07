public class House
{
  private int AreainMarlas;
  private int floors;
  private int rooms;
  static private int PerSquareFeetRate=1200;
  Address ad;
  
  public House()
  {
	  
  }
   public House(int areainMarlas, int floors, int rooms, Address ad) 
   {
	   setAreainMarlas(areainMarlas);
	   setFloors(floors);
	   setRooms(rooms);
	this.ad = ad;
  }


public int getAreainMarlas() {
	return AreainMarlas;
}


public void setAreainMarlas(int areainMarlas)
{
	if(areainMarlas<1)
	{
		AreainMarlas=1;
	}
	else
	{
		AreainMarlas = areainMarlas;
	}
	
}


public int getFloors() {
	return floors;
}


public void setFloors(int floors) 
{
	if(floors<1)
	{
		this.floors=1;
	}
	else
	{
		this.floors = floors;
	}
	
}


public int getRooms() {
	return rooms;
}


public void setRooms(int rooms)
{
	if(rooms<1)
	{
		this.rooms=1;
	}
	else
	{
		this.rooms = rooms;
	}
	
}
   
   
  public double computePrice()
  {
	  double baseprice;
	  double construction;
	  double Areainfeet;
	  double tax=0;
      double totalprice;
	  Areainfeet=AreainMarlas*272.5;
	  baseprice=Areainfeet*PerSquareFeetRate;
	  construction=rooms*750000;
	 if(AreainMarlas>10)
	 {
		 tax=500000;
	 }
	 
	 totalprice=baseprice+construction+tax;
	 
	 return totalprice;
  }

public String toString()
{
	return String.format(ad.toString()+"\nSpecification : %d Marlas , %dx%d , Normal House\nTotal Price : PKR %.2f",getAreainMarlas(),getFloors(),getRooms(),computePrice() ) ;
}
  
  

	
}
