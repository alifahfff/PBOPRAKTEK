
public class FlyingDutchman extends SuperHero {
	
	public FlyingDutchman(int lvl, String name)
	{
		super(lvl, name);
		Power fly = new Flying();
		Power laser = new LaserEye();
		super.addPower(laser);
		super.addPower(fly);
	}
	
	@Override
	public void identity() {
		System.out.println("It's " + super.getName() + ", the FlyingDutchMan!" + 
							"It has the power level of " + super.getPowerLevel());
		System.out.println(".....HEED ME.....");
		System.out.println("FOR MY NAAAAAAAME IS " + super.getName().toUpperCase());
	}
}
