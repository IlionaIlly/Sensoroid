package iot.sensoroid.sensors;

import iot.sensoroid.pojos.GravData;
import iot.sensoroid.utilities.DataListenerManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;

public class GravitySensor implements SensorEventListener {
	private SensorManager sensorManager;
	public static final String LOG_TAG = GravitySensor.class.getName();

	public GravitySensor(SensorManager sensorManager) {
		this.sensorManager = sensorManager;
		sensorManager.registerListener(this,
				sensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY),
				SensorManager.SENSOR_DELAY_NORMAL);
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		DataListenerManager.isListeningGrav(new GravData(event.values[0],
				event.values[1], event.values[2]));
		Log.d(LOG_TAG, "onSensorChanged|GravitySensor");
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {

	}

	public void unregister() {
		sensorManager.unregisterListener(this);
	}

}
