
public class Sauce extends Roll {
	
	private Roll roll;
	
	public Sauce (Roll roll)
	{
		this.roll = roll;
		type = roll.getType();
	}

	@Override
	public double getCost() {
		if (roll.getType().equals("springRoll"))
		{
			return roll.getCost() + 0.20;
		}
//		else if (roll instance EggRoll)
//		{
//			return roll.getCost() + 0.30;
//		}
		// TODO: check for other roll types
		
		return roll.getCost();
	}

}
