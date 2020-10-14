
import java.util.Random;

public class CasualCust implements Customer {
	
	Random random = new Random();
	private int unf;
	private double orderCost;

	public double getOrderCost() {
		return orderCost;
	}
	
	@Override
	public void create() {
		// ...

		int sauce = random.nextInt(3);
		int filling = random.nextInt(1);
		int topping = random.nextInt(2);
		
		int buyAmount = random.nextInt(3) + 1;
		int rollType = random.nextInt(5);
		Store store = new Store();
		
		Roll springRoll = new Roll("springRoll", store.springRollCost);
		Roll eggRoll = new Roll("eggRoll", store.eggRollCost);
		Roll jellyRoll = new Roll("jellyRoll", store.jellyRollCost);
		Roll sausageRoll = new Roll("sausageRoll", store.sausageRollCost);
		Roll pastryRoll = new Roll("pastryRoll", store.pastryRollCost);
		
		
		switch (rollType) {
		case 0:
			if (store.springRollCount <= 0) {
				unf++;
				break;
			}

			store.decrement("springRoll", buyAmount);
			
			
			for (int i = 0; i < sauce; i++) {
				springRoll = new Sauce(springRoll);
			}
			
			for (int i = 0; i < topping; i++) {
				springRoll = new Toppings(springRoll);
			}
			
			if (filling == 1) {
				springRoll = new Fillings(springRoll);
			}
			
			
			orderCost = springRoll.getCost() * buyAmount;
			
					
		case 1:
			if (store.eggRollCount <= 0) {
				unf++;
				break;
			}

			store.decrement("eggRoll", buyAmount);
			
			for (int i = 0; i < sauce; i++) {
				eggRoll = new Sauce(eggRoll);
			}
			
			for (int i = 0; i < topping; i++) {
				eggRoll = new Toppings(eggRoll);
			}
			
			if (filling == 1) {
				eggRoll = new Fillings(eggRoll);
			}
			
			
			orderCost = eggRoll.getCost() * buyAmount;

		case 2:
			if (store.sausageRollCount <= 0) {
				unf++;
				break;
			}

			store.decrement("sausageRoll", buyAmount);
			
			for (int i = 0; i < sauce; i++) {
				sausageRoll = new Sauce(sausageRoll);
			}
			
			for (int i = 0; i < topping; i++) {
				sausageRoll = new Toppings(sausageRoll);
			}
			
			if (filling == 1) {
				sausageRoll = new Fillings(sausageRoll);
			}
			
			
			orderCost = sausageRoll.getCost() * buyAmount;
		case 3:
			if (store.pastryRollCount <= 0) {
				unf++;
				break;
			}

			store.decrement("pastryRoll", buyAmount);
			
			for (int i = 0; i < sauce; i++) {
				pastryRoll = new Sauce(pastryRoll);
			}
			
			for (int i = 0; i < topping; i++) {
				pastryRoll = new Toppings(pastryRoll);
			}
			
			if (filling == 1) {
				pastryRoll = new Fillings(pastryRoll);
			}
			
			
			orderCost = pastryRoll.getCost() * buyAmount;
		case 4:
			if (store.jellyRollCount <= 0) {
				unf++;
				break;
			}

			store.decrement("jellyRoll", buyAmount);
			
			for (int i = 0; i < sauce; i++) {
				jellyRoll = new Sauce(jellyRoll);
			}
			
			for (int i = 0; i < topping; i++) {
				jellyRoll = new Toppings(jellyRoll);
			}
			
			if (filling == 1) {
				jellyRoll = new Fillings(jellyRoll);
			}
			
			
			orderCost = jellyRoll.getCost() * buyAmount;
		}
	}

}
