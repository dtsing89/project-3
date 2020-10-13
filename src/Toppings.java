
public class Toppings extends Roll {
	private Roll roll;
	
	public Toppings(Roll roll) //Decorator method to implement the cost for extra toppings.
	{
		this.roll = roll;
		type = roll.getType();
	}
	
	@Override
	
	public double getCost()
	{
		if(roll.getType().equals("eggRoll"))
		{
			return roll.getCost() + 0.85;
		}
		else if(roll.getType().equals("springRoll"))
		{
			return roll.getCost() + 0.80;
		}
		else if (roll.getType().equals("pastryRoll"))
		{
			return roll.getCost() + 0.75;
		}
		else if (roll.getType().equals("sausageRoll"))
		{
			return roll.getCost() + 1.00;
		}
		else if (roll.getType().equals("jellyRoll"))
		{
			return roll.getCost() + 0.50;
		}
		return roll.getCost();
	}

}
