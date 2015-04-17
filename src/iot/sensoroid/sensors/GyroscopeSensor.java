package iot.sensoroid.sensors;

import iot.sensoroid.pojos.GyroscopeData;
import iot.sensoroid.utilities.DataListenerManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;

public class GyroscopeSensor implements SensorEventListener {
	private SensorManager sensorManager;
	public static final String LOG_TAG = GyroscopeSensor.class.getName();

	public GyroscopeSensor(SensorManager sensorManager) {
		this.sensorManager = sensorManager;
		sensorManager.registerListener(this,
				sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE),
				SensorManager.SENSOR_DELAY_NORMAL);
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		DataListenerManager.isListeningGyroscope(new GyroscopeData(event.values[0],
				event.values[1], event.values[2]));
		Log.d(LOG_TAG, "onSensorChanged|GyroscopeSensor");
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {

	}

	public void unregister() {
		sensorManager.unregisterListener(this);
	}

}