
public class DirtyBubble extends SuperHero {
	public DirtyBubble(int lvl, String name)
	{
		super(lvl, name);
		Power strength = new Strength();
		Power flying = new Flying();
		super.addPower(strength);
		super.addPower(flying);
	}
	
	@Override
	public void identity() {
		System.out.println("It's " + super.getName() + ", the DirtyBubble!" + 
							"It has the power level of " + super.getPowerLevel());
		System.out.println(".....HEED ME.....");
		System.out.println("FOR MY NAAAAAAAME IS " + super.getName().toUpperCase());
	}
}
