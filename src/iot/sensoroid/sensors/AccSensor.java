package iot.sensoroid.sensors;

import iot.sensoroid.pojos.AccData;
import iot.sensoroid.utilities.DataListenerManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;

public class AccSensor implements SensorEventListener {

	private SensorManager sensorManager;
	public static final String LOG_TAG = AccSensor.class.getName();

	public AccSensor(SensorManager sensorManager) {
		this.sensorManager = sensorManager;
		sensorManager.registerListener(this,
				sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
				SensorManager.SENSOR_DELAY_NORMAL);
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		DataListenerManager.isListeningAcc(new AccData(event.values[0],
				event.values[1], event.values[2]));
		Log.d(LOG_TAG, "onSensorChanged|AccSensor");

	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {

	}

	public void unregister() {
		sensorManager.unregisterListener(this);
	}

}
