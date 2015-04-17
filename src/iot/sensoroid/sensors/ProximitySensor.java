package iot.sensoroid.sensors;

import iot.sensoroid.pojos.ProximityData;
import iot.sensoroid.utilities.DataListenerManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;

public class ProximitySensor implements SensorEventListener {
	
	private SensorManager sensorManager;
	public static final String LOG_TAG = ProximitySensor.class.getName();

	public ProximitySensor(SensorManager sensorManager) {
		this.sensorManager = sensorManager;
		sensorManager.registerListener(this,
				sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY),
				SensorManager.SENSOR_DELAY_NORMAL);
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		DataListenerManager.isListeningProximity(new ProximityData(event.values[0]));
		Log.d(LOG_TAG, "onSensorChanged|ProximitySensor");
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {

	}

	public void unregister() {
		sensorManager.unregisterListener(this);
	}

}
