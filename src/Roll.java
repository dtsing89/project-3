
public class Roll {
	protected String type;
	protected double cost;
	
	public Roll()
	{
		// empty constructor
	}
	
	public Roll(String type, double cost)
	{
		this.type = type;
		this.cost = cost;
	}
	
	public String getType()
	{
		return type;
	}
	
	public double getCost()
	{
		return cost;
	}
}
