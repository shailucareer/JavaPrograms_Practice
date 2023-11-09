package mobile_communication;

public class Customer {
	
	private String customer_Name;
	private int callDuration;
	private TariffPlan tarrifPlan;
	
	public String getCustomer_Name() {
		return customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	public int getCallDuration() {
		return callDuration;
	}
	public void setCallDuration(int callDuration) {
		this.callDuration = callDuration;
	}
	public TariffPlan getTarrifPlan() {
		return tarrifPlan;
	}
	public void setTarrifPlan(TariffPlan tarrifPlan) {
		this.tarrifPlan = tarrifPlan;
	}
	
	@Override
	public String toString() {
		return "Customer Class - "+"Customer Name - "+customer_Name+", "+"Call Duration - "+callDuration+", "+"Tarrif Plan - "+tarrifPlan;
	}
}
