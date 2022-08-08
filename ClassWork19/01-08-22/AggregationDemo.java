package abstractionDemo;

class TCS 
{
	int compId;
	String compName;
	Address address; // entity reference

public int getCompId()
{
		return compId;
}

public String getCompName()
{
		return compName;
}

public Address getAddress()
{
		return address;
}

public TCS(int compId, String compName, Address address) 
{
		super();
		this.compId = compId;
		this.compName = compName;
		this.address = address;
}
}

public class AggregationDemo 
{
	public static void main(String[] args) 
	{
		Address add1 = new Address(700008, "kolkata", "India", "wb");
		Address add2 = new Address(75678, "london", "USA", "abc");
		TCS company1 = new TCS(345, "TCS", add2);
		TCS company2 = new TCS(134, "TCS BSP", add1);
		System.out.println("id: " + company1.getCompId() + " " + "company name: " + company1.getCompName());
		System.out.println(company1.getAddress().getPinCode() + " " + company1.getAddress().getCity() + " "
				+ company1.getAddress().getCountry());
	}
}

