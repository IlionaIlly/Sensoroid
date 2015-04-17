package iot.sensoroid.utilities;

public enum SensorType {

	LIGHT("Light Sensor"), ACCELEROMETER("Accelerometer Sensor"), GRAVITY("Gravity Sensor"),
		TEMPERATURE("Temperature Sensor"), ROTATION_VECTOR("Rotation Vector Sensor"), 
		PROXIMITY("Rroximity Sensor"), PRESSURE("Pressure Sensor"), ORIENTATION("Orientation Sensor"),
		MAGNETIC_FIELD("Magnetic Field Sensor"), LOCATION("Location Sensor"), LINEAR_ACCELERATION("Linear Acceleration"),
		GYROSCOPE("Gyroscope Sensor");

	private String sensorType;

	private SensorType(String s) {
		sensorType = s;
	}

	public String getSensorType() {
		return sensorType;
	}
}
