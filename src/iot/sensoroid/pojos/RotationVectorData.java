package iot.sensoroid.pojos;

import java.util.Locale;

public class RotationVectorData {
	
	protected float x; 
	protected float y;
	protected float z;
	protected float cos;

	public RotationVectorData(float x, float y, float z, float cos) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.cos = cos;
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

	public float getCos() {
		return this.cos;
	}
	
	public String getDataInString() {
		return String.format(Locale.US, "%f,%f,%f", this.x, this.y, this.z, this.cos);
	}

	@Override
	public String toString() {
		return this.getDataInString();
	}

}
