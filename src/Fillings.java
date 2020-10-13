
public class Fillings extends Roll{
	private Roll roll;
	
	public Fillings(Roll roll) //Decorator method to implement the cost for extra fillings.
	{
		this.roll = roll;
		type = roll.getType();
	}
	
	@Override
	
	public  double getCost() 
	{
		if(roll.getType().equals("eggRoll"))
		{
			return roll.getCost()  + 0.30;
		}
		else if(roll.getType().equals("springRoll")) 
		{
			return roll.getCost() + 0.40;
		}
		else  if(roll.getType().equals("sausageRoll"))
		{
			return roll.getCost() + 0.50;
		}
		else if(roll.getType().equals("pastryRoll"))
		{
			return roll.getCost() + 0.60;  
		}
		else if(roll.getType().equals("jellyRoll"))
		{
			return roll.getCost() + 0.50;
		}		
		return getCost();
	}
}
