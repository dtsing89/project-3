
public class CustCreator {
	public Customer getCust(String CustType) {
		
		if(CustType == null) {
			return null;
		}
		
		if (CustType.equalsIgnoreCase("CasualCust")) {
			return new CasualCust();
		}
		else if (CustType.equalsIgnoreCase("BusinessCust")) {
			return new BusinessCust();
		}
		else if (CustType.equalsIgnoreCase("CateringCust")) {
			return new CateringCust();
		}
		
		return null;
	}
}
