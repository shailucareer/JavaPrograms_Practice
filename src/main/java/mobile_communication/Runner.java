package mobile_communication;

public class Runner {

	public static void main(String[] args) {
		MobileCompany airtel = new MobileCompany();

		TariffPlan tarrifPlan1 = new TariffPlan();
		tarrifPlan1.setTarrifPlan_Name("Basic50");
		tarrifPlan1.setChargePerMin(2);
		System.out.println(tarrifPlan1);
		
		TariffPlan tarrifPlan2 = new TariffPlan();
		tarrifPlan2.setTarrifPlan_Name("Premium100");
		tarrifPlan2.setChargePerMin(4);
		System.out.println(tarrifPlan2);
		
		Customer customer1 = new Customer();
		customer1.setCustomer_Name("Vijay");
		customer1.setTarrifPlan(tarrifPlan1);
		customer1.setCallDuration(10);
		System.out.println(customer1);
		
		Customer customer2 = new Customer();
		customer2.setCustomer_Name("Shailendra");
		customer2.setTarrifPlan(tarrifPlan2);
		customer2.setCallDuration(60);
		System.out.println(customer2);
		
		
		airtel.CalculateBillOfCustomer(customer1);
		airtel.CalculateBillOfCustomer(customer2);

		airtel.createCustomer(customer1);
		airtel.createCustomer(customer2);
		
		
		airtel.findConnectionWithHighestBill();
		
		airtel.createTariffPlan(tarrifPlan1);
		airtel.createTariffPlan(tarrifPlan2);
		
		airtel.findNumberOfCustomerWhoParticularTariffPlan(tarrifPlan1);
		airtel.findNumberOfCustomerWhoParticularTariffPlan(tarrifPlan2);
		
		System.out.println(airtel);
		
	}

}
