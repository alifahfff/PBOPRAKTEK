
abstract class Shape {
	String shapeName;
	
	public Shape (String shapeName) {
		this.shapeName = shapeName;
	}
	
	abstract public double area();
	
	public String toString()
	{
		return " Shape " + shapeName;
	}
}
