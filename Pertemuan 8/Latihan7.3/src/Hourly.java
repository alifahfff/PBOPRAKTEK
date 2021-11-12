
public class Hourly extends Employee{
	
	private int hoursWorked;
	
	public Hourly (String eName, String eAddress, String ePhone, String sosSecNumber, double rate)
	{
		super (eName, eAddress, ePhone, sosSecNumber, rate);
		
		hoursWorked = 0;
	}
	
	public void addHours (int moreHours)
	{
		hoursWorked +=moreHours;
	}
	
	public double pay ()
	{
		double payment = payRate * hoursWorked;
		
		hoursWorked = 0;
		
		return payment;
	}
	
	public String toString () {
		String result = super. toString();
		
		result += "\nCurrent hourse " + hoursWorked;
		
		return result;
	}
	
}
