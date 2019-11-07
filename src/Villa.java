public class Villa extends Luxurioushouse
{
	Pool swimmingpool;
	
	public Villa(int areainMarlas, int floors, int rooms, Address ad,int lawnarea,boolean fountain,Pool swim)
	{
		super(areainMarlas,floors,rooms,ad ,lawnarea,fountain);
		
		swimmingpool=swim;
		
	}
	
	@Override
	public double computePrice()
	  {
		double actualprice;
		double poolprice;
		double villaprice;
		
		poolprice=swimmingpool.getAreaofpool()*(3*1200)+swimmingpool.getMaxdepth();
		actualprice=super.computePrice();
		
		villaprice=actualprice+poolprice;
		
		return villaprice;
	  }

	@Override
	public String toString() {
		return String.format(ad.toString()+"\nSpecifications : %d Marlas ,%dx%d ,Villa "+getLawn().toString()+swimmingpool.toString()+"\nTotal PRICE: PKR %.2f\n",getAreainMarlas(),getFloors(),getRooms(),computePrice());
	}
	
	
	

}
