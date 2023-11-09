package mobile_communication;

public class TariffPlan {

	private int chargePerMin;
	private String tarrifPlan_Name;

	public int getChargePerMin() {
		return chargePerMin;
	}

	public void setChargePerMin(int chargePerMin) {
		this.chargePerMin = chargePerMin;
	}

	public String getTarrifPlan_Name() {
		return tarrifPlan_Name;
	}

	public void setTarrifPlan_Name(String tarrifPlan_Name) {
		this.tarrifPlan_Name = tarrifPlan_Name;
	}

	@Override
	public String toString() {
		return "TariffPlan Class - "+"Charge Per Min - "+chargePerMin+", "+"Tarrif Plan Name - "+tarrifPlan_Name;
	}

}
