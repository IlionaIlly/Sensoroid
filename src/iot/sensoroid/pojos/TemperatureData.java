package iot.sensoroid.pojos;

import java.util.Locale;

public class TemperatureData {

	protected float temperature;

	public TemperatureData(float temperature) {
		this.temperature = temperature;
	}

	public float getTemperature() {
		return this.temperature;
	}
	
	public String getDataInString() {
		return String.format(Locale.US, "%f", this.temperature);
	}

	@Override
	public String toString() {
		return this.getDataInString();
	}
	
}
