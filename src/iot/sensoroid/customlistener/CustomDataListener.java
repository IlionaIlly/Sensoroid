package iot.sensoroid.customlistener;

import iot.sensoroid.utilities.SensorType;

import java.util.HashMap;

public interface CustomDataListener {

	public void receiveSensorData(HashMap<SensorType, String> data);

}
