package iot.sensoroid.sensors;

import iot.sensoroid.pojos.LinearAccData;
import iot.sensoroid.utilities.DataListenerManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;

public class LinearAccSensor implements SensorEventListener {
	private SensorManager sensorManager;
	public static final String LOG_TAG = LinearAccSensor.class.getName();

	public LinearAccSensor(SensorManager sensorManager) {
		this.sensorManager = sensorManager;
		sensorManager.registerListener(this,
				sensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION),
				SensorManager.SENSOR_DELAY_NORMAL);
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		DataListenerManager.isListeningLinearAcc(new LinearAccData(event.values[0],
				event.values[1], event.values[2]));
		Log.d(LOG_TAG, "onSensorChanged|LinearAccSensor");
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {

	}

	public void unregister() {
		sensorManager.unregisterListener(this);
	}

}