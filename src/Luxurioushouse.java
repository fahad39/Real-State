public class Luxurioushouse extends House
{
	private Garden lawn;
	
	public Luxurioushouse()
	{
		
	}
	
	
	public Luxurioushouse(int areainMarlas, int floors, int rooms, Address ad,int lawnarea,boolean fountain)
	{
		super(areainMarlas,floors,rooms,ad);
		setLawn(lawnarea,fountain);
		
	}
	
	public Garden getLawn() {
		return lawn;
	}

	public void setLawn(int lawnarea,boolean fountain)
	{
		lawn=new Garden(lawnarea,fountain);
	}

	
	@Override
	public double computePrice()
	  {
		double actualprice;
		double gardenprice;
		double luxuryprice;
		double fountain;
		
		gardenprice=lawn.getGardenArea()*(2*1200);
		actualprice=super.computePrice();
		
		if(lawn.isFountain())
		{
			fountain=50000;
			luxuryprice=actualprice+gardenprice+fountain;
		}
		else
		{
			fountain=0;
			luxuryprice=actualprice+gardenprice+fountain;
		}
		
		return luxuryprice;
	  }
	
	@Override
	public String toString() {
		return String.format(ad.toString()+"\nSpecification : %d Marlas , %dx%d , Luxury House"+lawn.toString()+"\nTotal Price : PKR %.2f", getAreainMarlas(),getFloors(),getRooms(),computePrice());
	}









	public class Garden
	{
		private int GardenArea;
		private boolean fountain;
		
		public Garden(int garden,boolean fountain)
		{
			setGardenArea(garden);
			setFountain(fountain); 
			
		}
		public int getGardenArea() 
		{
			return GardenArea;
		}
		public void setGardenArea(int gardenArea)
		{
			GardenArea = gardenArea;
		}
		public boolean isFountain() 
		{
			return fountain;
		}
		public void setFountain(boolean fountain) 
		{
			this.fountain = fountain;
		}
		
		@Override
		public String toString()
		{
			if(isFountain())
			{
			return String.format(" with A %d marla garden and with a central fountain",getGardenArea());
			}
			else
			{
				return String.format(" with A %d marla garden without a central fountain",getGardenArea());
			}
		}
		
		
		
		
	}
}



