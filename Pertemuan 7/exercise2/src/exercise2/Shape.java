package exercise2;

public class Shape {
	private String color;
	private boolean filled;
	
	public Shape() {
		this.color = "green";
		this.filled = true;
	}
	
	public Shape (String color,boolean filled) {
		this.color = color;
		this.filled = filled;	
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void isFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		if(isFilled()== true) {
			return " A Shape with color of " + this.color + " is filled";
		}else {
			return " A Shape with color of " + this.color + " is not filled";
		}
	}
}
	
