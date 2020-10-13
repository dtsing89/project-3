import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class Main {

	//Using decorator method to add extra features
		public static void main(String[] args) {
			Store store = new Store();
			Simulator simulator = new Simulator(store);
			store.addObserver(simulator);
			
			// start simulation
			simulator.start();
		}
}
