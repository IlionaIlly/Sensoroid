package iot.sensoroid.pojos;

import java.util.Locale;

public class MagneticFieldData {

	protected float x; 
	protected float y;
	protected float z;

	public MagneticFieldData(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public float getX() {
		return this.x;
	}

	public float getY() {
		return this.y;
	}

	public float getZ() {
		return this.z;
	}

	public String getDataInString() {
		return String.format(Locale.US, "%f,%f,%f", this.x, this.y, this.z);
	}

	@Override
	public String toString() {
		return this.getDataInString();
	}
	
}
