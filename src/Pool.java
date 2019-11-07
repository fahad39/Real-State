public class Pool
{
	private int areaofpool;
	private int maxdepth;
	private float temperature;
	
	public Pool(int areaofpool, int maxdepth, float temperature) 
	{

		setAreaofpool(areaofpool);
		setMaxdepth(maxdepth);
		setTemperature(temperature);
	}
	
	public int getAreaofpool() 
	{
		return areaofpool;
	}
	public void setAreaofpool(int areaofpool) 
	{
		this.areaofpool = areaofpool;
	}
	 public int getMaxdepth()
	 {
		 return maxdepth;
	 }
	public void setMaxdepth(int maxdepth) 
	{
		this.maxdepth = maxdepth;
	}
	public float getTemperature()
	{
		return temperature;
	}
	public void setTemperature(float temperature) 
	{
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return String.format(" and a %d marlas and %d feet deep swimming pool", getAreaofpool(),getMaxdepth());
	}
	
	

}
