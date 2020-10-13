import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class Simulator implements Observer {

	Store store;

	public Simulator(Store store) {
		this.store = store;
	}

	public void start() {
		Roll springRoll = new Roll("springRoll", store.springRollCost);
		Roll eggRoll = new Roll("eggRoll", store.eggRollCost);
		Roll jellyRoll = new Roll("jellyRoll", store.jellyRollCost);
		Roll sausageRoll = new Roll("sausageRoll", store.sausageRollCost);
		Roll pastryRoll = new Roll("pastryRoll", store.pastryRollCost);

		springRoll = new Sauce(springRoll);
		springRoll = new Sauce(springRoll);
		eggRoll = new Toppings(eggRoll);
		eggRoll = new Sauce(eggRoll);
		eggRoll = new Fillings(eggRoll);

		System.out.println("$" + springRoll.getCost());
		System.out.println("$" + eggRoll.getCost());
		System.out.println("$" + pastryRoll.getCost());
		System.out.println("$" + jellyRoll.getCost());
		System.out.println("$" + sausageRoll.getCost());

		Random random = new Random();

		for (int i = 0; i < 30; i++) {

			int custNum = random.nextInt(3);
			System.out.println(custNum);

			switch (custNum) {
			case 0:
				// casual cust
			case 1:
				// business cust
			case 2:
				// catering cust
			}
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		Store store = (Store) o;
		if (store.springRollCount == 0 && store.eggRollCount == 0 && store.jellyRollCount == 0
				&& store.pastryRollCount == 0 && store.sausageRollCount == 0) {
			// TODO: close store
			
		} else if (store.springRollCount == 0) {
			// out of spring rolls
		} else if (store.eggRollCount == 0) {
			// Reset egg rolls
		} else if (store.pastryRollCount == 0) {
			// out of pastry rolls
		} else if (store.sausageRollCount == 0) {
			// out of sausage rolls
		} else if (store.jellyRollCount == 0) {
			// out of rolls
		}
	}

}
