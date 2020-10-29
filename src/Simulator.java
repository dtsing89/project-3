import java.util.Observable;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Observer;
import java.util.Random;

public class Simulator implements Observer {

	Store store;

	public Simulator(Store store) {
		this.store = store;
	}

	public void start() throws IOException {
		FileWriter writer = new FileWriter("60roll_inventory.out", true);

		Random random = new Random();
		CustCreator creator = new CustCreator();
		
		int custNum = random.nextInt(3);
		int array[];
		array = new int[20];
		
		for(int i =0; i < 18; i++){
			custNum = random.nextInt(3);

			array[i] = custNum;
		}

		for (int i = 0; i < 30; i++) {
			writer.write("Day: " + (i+1));
			writer.write("\n");
			
			double daySales = 0;
			
			int casualCount = 0;
			int businessCount = 0;
			int cateringCount = 0;

			
			for(int j = 0; j < 18; j++){
				custNum = array[j];

			switch (custNum) {
			case 0:
				CasualCust casual = new CasualCust();
				
				casual.create();
				daySales += casual.getOrderCost();

			case 1:
				if (businessCount > 3) {
					break;
				}
				
				BusinessCust business = new BusinessCust();
				
				business.create();
				daySales += business.getOrderCost();
				
				

			case 2:
				if (cateringCount > 3) {
					break;
				}
				
				CateringCust cater = new CateringCust();
				
				cater.create();
				
				daySales += cater.getOrderCost();
				
				
			}
			}
			
			writer.write("Total days sales: " + Math.round(daySales));
			writer.write("\n");
			writer.write("\n");
			writer.write("END OF RUN -------------------------------");
			writer.write("\n");
			
			
			
		}
		writer.close();
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
