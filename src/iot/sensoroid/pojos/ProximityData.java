package iot.sensoroid.pojos;

import java.util.Locale;

public class ProximityData {
	
	protected float proximity;

	public ProximityData(float proximity) {
		this.proximity = proximity;
	}

	public float getProximity() {
		return this.proximity;
	}
	
	public String getDataInString() {
		return String.format(Locale.US, "%f", this.proximity);
	}

	@Override
	public String toString() {
		return this.getDataInString();
	}
	
}
