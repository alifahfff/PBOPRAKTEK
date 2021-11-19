
public class ManRay extends SuperHero {
	public ManRay(int lvl, String name)
	{
		super(lvl, name);
		Power strength = new Strength();
		Power laser = new LaserEye();
		super.addPower(strength);
		super.addPower(laser);
	}
	
	@Override
	public void identity() {
		System.out.println("It's " + super.getName() + ", the Manray!" + 
							"It has the power level of " + super.getPowerLevel());
		System.out.println(".....HEED ME.....");
		System.out.println("FOR MY NAAAAAAAME IS " + super.getName().toUpperCase());
	}
}
