package exercise2;

public class MainClass {
	
	public static void main (String args[]) {
		Shape s1 = new Shape();
		System.out.println(s1.toString());
		
		Shape s2 = new Shape("Sky Blue", false);
		System.out.println(s2.toString());
		
		Circle c1 = new Circle();
		System.out.println(c1.toString());
		System.out.println(" Luas = " + c1.getArea());
		
		Circle c2 = new Circle(7.0);
		System.out.println(c2.toString());
		System.out.println(" memiliki luas = " + c2.getArea());
		
		Circle c3 = new Circle("White", false, 7.0);
		System.out.println(c3.toString());
		
		Rectangle r1 = new Rectangle ();
		System.out.println(r1.toString());
		System.out.println(" memiliki luas = " + r1.getArea() + " Keliling = " + r1.getPerimeter());
		
		Rectangle r2 = new Rectangle (5.0, 10.5);
		System.out.println(r2.toString());
		System.out.println(" memiliki luas = " + r2.getArea() + " Keliling = " + r2.getPerimeter());
		
		Rectangle r3 = new Rectangle (10.5, 5.0, "Peach", true);
		System.out.println(r3.toString());
		System.out.println(" memiliki luas = " + r3.getArea() + " Keliling = " + r3.getPerimeter());
		
		Square sql = new Square ();
		System.out.println(sql.toString());
		System.out.println(" memiliki luas = " + sql.getArea() + " Keliling = " + sql.getPerimeter());
	}
}
