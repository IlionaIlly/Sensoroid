package iot.sensoroid.utilities;

import iot.sensoroid.customlistener.CustomDataListener;
import iot.sensoroid.pojos.AccData;
import iot.sensoroid.pojos.GravData;
import iot.sensoroid.pojos.GyroscopeData;
import iot.sensoroid.pojos.LightData;
import iot.sensoroid.pojos.LinearAccData;
import iot.sensoroid.pojos.LocationData;
import iot.sensoroid.pojos.MagneticFieldData;
import iot.sensoroid.pojos.OrientationData;
import iot.sensoroid.pojos.PressureData;
import iot.sensoroid.pojos.ProximityData;
import iot.sensoroid.pojos.RotationVectorData;
import iot.sensoroid.pojos.TemperatureData;
import iot.sensoroid.sensors.AccSensor;
import iot.sensoroid.utilities.SensorType;

import java.util.HashMap;

import android.util.Log;

public class DataListenerManager {

	private static CustomDataListener listener = null;
	public static final String LOG_TAG = AccSensor.class.getName();
	private static HashMap<SensorType, String> data = new HashMap<SensorType, String>();

	public static void registerListener(CustomDataListener sensorListener) {
		listener = sensorListener;
	}

	public static void isListeningAcc(AccData accData) {
		if (listener != null) {
			data.put(SensorType.ACCELEROMETER, accData.toString());
			listener.receiveSensorData(data);
			Log.i(LOG_TAG, "Got the value ACC!");
		}

	}

	public static void isListeningLight(LightData lightData) {
		if (listener != null) {
			data.put(SensorType.LIGHT, lightData.toString());
			listener.receiveSensorData(data);
			// listener.onAccelerationReceived(x, y, z);
			Log.i(LOG_TAG, "Got the value Light!");
		}
	}

	public static void isListeningGrav(GravData gravData) {
		if (listener != null) {
			data.put(SensorType.GRAVITY, gravData.toString());
			listener.receiveSensorData(data);
			Log.i(LOG_TAG, "Got the value Gravity!");
		}

	}

	public static void isListeningTemp(TemperatureData tempData) {
		if (listener != null) {
			data.put(SensorType.TEMPERATURE, tempData.toString());
			listener.receiveSensorData(data);
			Log.i(LOG_TAG, "Got the value Temparature!");
		}

	}

	public static void isListeningRotation(RotationVectorData rotVectorData) {
		if (listener != null) {
			data.put(SensorType.ROTATION_VECTOR, rotVectorData.toString());
			listener.receiveSensorData(data);
			Log.i(LOG_TAG, "Got the value Rotation Vector!");
		}

	}

	public static void isListeningProximity(ProximityData proximityData) {
		if (listener != null) {
			data.put(SensorType.PROXIMITY, proximityData.toString());
			listener.receiveSensorData(data);
			Log.i(LOG_TAG, "Got the value Proximity!");
		}
		
	}

	public static void isListeningPressure(PressureData pressureData) {
		if (listener != null) {
			data.put(SensorType.PRESSURE, pressureData.toString());
			listener.receiveSensorData(data);
			Log.i(LOG_TAG, "Got the value Pressure!");
		}

	}

	public static void isListeningOrientation(OrientationData orientationData) {
		if (listener != null) {
			data.put(SensorType.ORIENTATION, orientationData.toString());
			listener.receiveSensorData(data);
			Log.i(LOG_TAG, "Got the value Orientation!");
		}

	}

	public static void isListeningMagneticField(MagneticFieldData magneticFieldData) {
		if (listener != null) {
			data.put(SensorType.MAGNETIC_FIELD, magneticFieldData.toString());
			listener.receiveSensorData(data);
			Log.i(LOG_TAG, "Got the value MagneticField!");
		}

	}
	
	public static void isListeningLocation(LocationData locationData) {
		if (listener != null) {
			data.put(SensorType.LOCATION, locationData.toString());
			listener.receiveSensorData(data);
			Log.i(LOG_TAG, "Got the value Location!");
		}

	}
	
	public static void isListeningLinearAcc(LinearAccData linearAccData) {
		if (listener != null) {
			data.put(SensorType.LINEAR_ACCELERATION, linearAccData.toString());
			listener.receiveSensorData(data);
			Log.i(LOG_TAG, "Got the value Linear Acceleraton!");
		}

	}
	
	public static void isListeningGyroscope(GyroscopeData gyroscopeData) {
		if (listener != null) {
			data.put(SensorType.GYROSCOPE, gyroscopeData.toString());
			listener.receiveSensorData(data);
			Log.i(LOG_TAG, "Got the value Gyroscope!");
		}

	}
	
}
