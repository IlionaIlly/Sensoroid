package iot.sensoroid.pojos;

import java.util.Locale;

public class LightData {

	protected float light;

	public LightData(float light) {
		this.light = light;
	}

	public float getLight() {
		return this.light;
	}
	
	public String getDataInString() {
		return String.format(Locale.US, "%f", this.light);
	}

	@Override
	public String toString() {
		return this.getDataInString();
	}

}
