public class Address 
{
	private int Houseno;
	private int Sectorno;
	private String Society;
	private String city;
	
	
	public Address(int Houseno, int Sectorno, String Society, String City)
	{
	    setHouseno(Houseno);
		setSectorno(Sectorno);
		setSociety(Society);
		setCity(City);
	}


	public int getHouseno() {
		return Houseno;
	}


	public void setHouseno(int Houseno) {
		this.Houseno = Houseno;
	}


	public int getSectorno() {
		return Sectorno;
	}


	public void setSectorno(int sectorno) {
		Sectorno = sectorno;
	}


	public String getSociety() {
		return Society;
	}


	public void setSociety(String society) {
		Society = society;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	


	@Override
	public String toString()
	{
		return String.format("\nAddress : %d-%d,%s,%s",getSectorno(),getHouseno(),getSociety(),getCity());
	}
	

}
