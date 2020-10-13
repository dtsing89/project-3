
public class Store {
	private static double springRollCost = 5.00;
	private static double eggRollCost = 3.00;
	private static double jellyRollCost = 4.00;
	private static double pastryRollCost = 7.00;
	private static double sausageRollCost = 6.00;
	
//Using decorator method to add extra features
	public static void main(String[] args) {
		Roll springRoll = new Roll("springRoll", springRollCost);
		Roll eggRoll = new Roll("eggRoll", eggRollCost);
		Roll jellyRoll = new Roll("jellyRoll", jellyRollCost);
		Roll sausageRoll = new Roll("sausageRoll", sausageRollCost);
		Roll pastryRoll = new Roll("pastryRoll", pastryRollCost);
		
		springRoll = new Sauce(springRoll);
		springRoll = new Sauce(springRoll);
		System.out.println("$" + springRoll.getCost());
		
		//30 days
		for (int i = 0; i < 30; i++) {
			
		}
	}

}
