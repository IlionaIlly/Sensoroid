package iot.sensoroid.coreinterface;

import iot.sensoroid.utilities.SensorType;


public interface Sensor {
	
	public void startSensor (SensorType type);
	public void  stopSensor (SensorType type);
	
}
