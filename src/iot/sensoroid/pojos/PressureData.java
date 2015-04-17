package iot.sensoroid.pojos;

import java.util.Locale;

public class PressureData {
	
	protected float pressure;

	public PressureData(float pressure) {
		this.pressure = pressure;
	}

	public float getPressure() {
		return this.pressure;
	}
	
	public String getDataInString() {
		return String.format(Locale.US, "%f", this.pressure);
	}

	@Override
	public String toString() {
		return this.getDataInString();
	}

}
