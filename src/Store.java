import java.util.Observable;
import java.util.Random;

public class Store extends Observable {
	// Setting the price for each roll
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
	public void decrement(String type, int amount) {
		if (type.equals("springRoll")) {
			for (int i = 0; i < amount; i++) {
				springRollCount--;
			}

			if (springRollCount == 0) {
				setChanged();
				notifyObservers();
			}
		} else if (type.equals("eggRoll")) {
			for (int i = 0; i < amount; i++) {
				eggRollCount--;
			}
			
			if (eggRollCount == 0) {
				setChanged();
				notifyObservers();
			}
		} else if (type.equals("sausageRoll")) {
			for (int i = 0; i < amount; i++) {
				sausageRollCount--;
			}
			
			if (sausageRollCount == 0) {
				setChanged();
				notifyObservers();
			}
		} else if (type.equals("pastryRoll")) {
			for (int i = 0; i < amount; i++) {
				pastryRollCount--;
			}
			
			if (pastryRollCount == 0) {
				setChanged();
				notifyObservers();
			}
		} else if (type.equals("jellyRoll")) {
			for (int i = 0; i < amount; i++) {
				jellyRollCount--;
			}
			
			if (jellyRollCount == 0) {
				setChanged();
				notifyObservers();
			}
		}
	}
	
	
}
