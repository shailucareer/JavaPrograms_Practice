package mobile_communication;

import java.util.ArrayList;
import java.util.List;

/*
 * Keep Talking is a leading mobile communication service provider in the country. They offer post-paid mobile connection services across cities. There are various tariff plans they offer to customers. Customers’ calls are charged based on the plan they have opted for. Write a program to:
a. Calculate bill of a customer
b. Find number of customer who have opted for a particular tariff plan
c. Find the connection with the highest bill
 */

public class MobileCompany {

	private List<Customer> customer_List = new ArrayList<Customer>();
	private List<TariffPlan> tariffPlan_List = new ArrayList<TariffPlan>();

	public void findNumberOfCustomerWhoParticularTariffPlan(TariffPlan tarrifObj) {
		System.out.println("\nFind number of customer who have opted for a particular tariff plan");
		int temp = 0;
		for (Customer customer : customer_List) {
			if (tarrifObj == customer.getTarrifPlan()) {
				temp = temp + 1;
			}
		}
		System.out.println(
				"Most opted tariff plan count----->" + temp + " and name is " + tarrifObj.getTarrifPlan_Name());
	}

	public void createCustomer(Customer custObj) {
		customer_List.add(custObj);
	}

	public void createTariffPlan(TariffPlan tariffObj) {
		tariffPlan_List.add(tariffObj);
	}

	public void CalculateBillOfCustomer(Customer custObj) {
		System.out.println("\nCalculate bill of a customer");
		int tempBill = 0;
		TariffPlan tempobj = null;
		String customern = null;

		customern = custObj.getCustomer_Name();
		tempobj = custObj.getTarrifPlan();
		// tempBill =
		// custObj.getCallDuration()*custObj.getTarrifPlan().getChargePerMin();
		tempBill = custObj.getCallDuration() * tempobj.getChargePerMin();

		System.out.println(customern + "-" + tempBill + "/-");
	}

	@Override
	public String toString() {
		return "\nMobile Company Class-" + "\nCustomersList " + customer_List + "" + "\nTarrifPlanList "
				+ tariffPlan_List;
	}

	public void findConnectionWithHighestBill() {
		int highetBill = 0;
	//	Customer getCustObj = null;
		String tempCustomerName=null;
		
		for (Customer custObj : customer_List) {
			
			int temp = custObj.getCallDuration() * custObj.getTarrifPlan().getChargePerMin();
			if (highetBill < temp) {
				highetBill = temp;
				tempCustomerName = custObj.getCustomer_Name();
			}
		}
		System.out.println("The customer - "+tempCustomerName +" with the highest bill " + highetBill+"/-");
	}


	/**
	 * for supporting the Dynamic runner
	 * @author Shailendra 
	 * */
	public void setCustomerTarrifPlan(String custName, String tpName) {

		Customer cObj = null;
		TariffPlan tpObj = null;
		
		for (Customer cust : customer_List) {
			if(cust.getCustomer_Name().toLowerCase().contains(custName.toLowerCase())) {
				cObj = cust;
				break;
			}
		}
		
		for (TariffPlan tp : tariffPlan_List) {
			if(tp.getTarrifPlan_Name().toLowerCase().contains(tpName.toLowerCase())) {
				tpObj = tp;
				break;
			}
		}
		
		if(cObj != null && tpObj != null) {
			cObj.setTarrifPlan(tpObj);
			System.out.println("TP ALLOTED");
		}else {
			System.err.println("Entered customer name or tarrif plan name not found");
		}
		
	}

	/**
	 * for supporting the Dynamic runner
	 * @author Shailendra 
	 * */
	public void CalculateBillOfCustomer(String custName1) {
		Customer cObj = null;
		for (Customer cust : customer_List) {
			if(cust.getCustomer_Name().toLowerCase().contains(custName1.toLowerCase())) {
				cObj = cust;
				break;
			}
		}
		
		if(cObj != null ) {
			CalculateBillOfCustomer(cObj);
		}else {
			System.err.println("Entered customer name name not found");
		}
	}

	/**
	 * for supporting the Dynamic runner
	 * @author Shailendra 
	 * */
	public void findNumberOfCustomerWhoParticularTariffPlan(String tpName1) {
		TariffPlan tpObj = null;

		for (TariffPlan tp : tariffPlan_List) {
			if(tp.getTarrifPlan_Name().toLowerCase().contains(tpName1.toLowerCase())) {
				tpObj = tp;
				break;
			}
		}
		
		if(tpObj != null) {
			findNumberOfCustomerWhoParticularTariffPlan(tpObj);
		}else {
			System.err.println("Entered tarrif plan name not found");
		}
	}

	public void changeCustomerDuration(String custName2, int duration2) {
		Customer cObj = null;
		for (Customer cust : customer_List) {
			if(cust.getCustomer_Name().toLowerCase().contains(custName2.toLowerCase())) {
				cObj = cust;
				break;
			}
		}
		
		if(cObj != null ) {
			cObj.setCallDuration(duration2);
		}else {
			System.err.println("Entered customer name name not found");
		}
	}

}
