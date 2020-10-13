import java.util.Observable;
import java.util.Random;

public class Store extends Observable{
	//Setting the price for each roll
	public double springRollCost = 5.00;
	public double eggRollCost = 3.00;
	public double jellyRollCost = 4.00;
	public double pastryRollCost = 7.00;
	public double sausageRollCost = 6.00;
	
	// inventory
	public int springRollCount = 30;
	public int eggRollCount = 30;
	public int jellyRollCount = 30;
	public int pastryRollCount = 30;
	public int sausageRollCount = 30;
	
	@SuppressWarnings("deprecation")
	public void decrement(String type)
	{
		if (type.equals("springRoll"))
		{
			springRollCount--;
			if (springRollCount == 0)
			{
				setChanged();
				notifyObservers();
			}
		}
		else if (type.equals("eggRoll"))
		{
			eggRollCount--;
			if (eggRollCount == 0)
			{
				setChanged();
				notifyObservers();
			}
		}
		else if (type.equals("sausageRoll"))
		{
			sausageRollCount--;
			if (sausageRollCount == 0) 
			{
				setChanged();
				notifyObservers();
			}	
		}
		else if (type.equals("pastryRoll"))
		{
			pastryRollCount--;
			if (pastryRollCount == 0)
			{
				setChanged();
				notifyObservers();
			}
		}
		else if (type.equals("jellyRoll"))
		{
			jellyRollCount--;
			if (jellyRollCount == 0)
			{
				setChanged();
				notifyObservers();
			}
		}
	}
}
