package mobile_communication;

import java.util.Scanner;

public class DynamicRunner {

	public static void main(String[] args) {
		
		MobileCompany airtel = new MobileCompany();
		
		int input = 10;
		do {

			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println();
			System.out.println("0. To exit");
			System.out.println("1. Print all information");
			System.out.println("2. Create tarrif plan");
			System.out.println("3. Create customer");
			System.out.println("4. Set customer tarrif plan");
			System.out.println("5. Calculate Bill Of a Customer");
			System.out.println("6. Find Number Of Customer Who Has Particular Tariff Plan");
			System.out.println("7. Find Connection With Highest Bill");
			System.out.println("8. Change customer duration");
			
			System.out.println("Please pick any option by entering its number below");
			System.out.print("number = \n");
			input = sc.nextInt();
			
			switch (input) {
			case 1:
				System.out.println("********************************************************************************");
				System.out.println(airtel);
				System.out.println("********************************************************************************");
				break;
			case 2:
				System.out.println("********************************************************************************");
				TariffPlan tarrifPlan1 = new TariffPlan();
				System.out.println("Please enter tarrif plan name below");
				System.out.print("tarrif plan name = \n");
				tarrifPlan1.setTarrifPlan_Name(sc.next());

				System.out.println("Please enter tarrif plan rate per minute below");
				System.out.print("tarrif plan rate per minute = \n");
				tarrifPlan1.setChargePerMin(sc.nextInt());
				airtel.createTariffPlan(tarrifPlan1);
				System.out.println("********************************************************************************");
				break;
			case 3:
				System.out.println("********************************************************************************");
				Customer customer1 = new Customer();
				System.out.println("Please enter customer name below");
				System.out.print("customer name = \n");
				sc.nextLine();
				customer1.setCustomer_Name(sc.nextLine());
				
				System.out.println("Please enter duration below");
				System.out.print("duration = \n");
				customer1.setCallDuration(sc.nextInt());
				
				airtel.createCustomer(customer1);
				System.out.println("********************************************************************************");
				break;
				
			case 4:
				System.out.println("********************************************************************************");

				System.out.println("Please enter customer name");
				System.out.print("customer name = \n");
				String custName = sc.next();
				
				System.out.println("Please enter desired tarrif plan name");
				System.out.print("tarrif plan name = \n");
				String tpName = sc.next();
				
				airtel.setCustomerTarrifPlan(custName, tpName);	
				
				System.out.println("********************************************************************************");
				break;
				
			case 5:
				System.out.println("********************************************************************************");
				System.out.println("Please enter customer name");
				System.out.print("customer name = \n");
				String custName1 = sc.next();
				airtel.CalculateBillOfCustomer(custName1);
				System.out.println("********************************************************************************");
				break;
				
			case 6:
				System.out.println("********************************************************************************");
				System.out.println("Please enter tarrif plan name");
				System.out.print("tarrif plan name = \n");
				String tpName1 = sc.next();
				airtel.findNumberOfCustomerWhoParticularTariffPlan(tpName1);
				System.out.println("********************************************************************************");
				break;
			case 7:
				System.out.println("********************************************************************************");
				airtel.findConnectionWithHighestBill();
				System.out.println("********************************************************************************");
				break; 
			case 8:
				System.out.println("********************************************************************************");

				System.out.println("Please enter customer name");
				System.out.print("customer name = \n");
				String custName2 = sc.next();
				
				System.out.println("Please enter new duration");
				System.out.print("duration = \n");
				int duration2 = sc.nextInt();
				
				airtel.changeCustomerDuration(custName2,duration2);
				
				System.out.println("********************************************************************************");
				break; 

			default:
				break;
			}
			
		}while(input != 0 );
		
		
		
		System.out.println("Exit");
		
	}
	
}
