package iot.sensoroid.sensors;

import iot.sensoroid.pojos.PressureData;
import iot.sensoroid.utilities.DataListenerManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;

public class PressureSensor implements SensorEventListener {
	private SensorManager sensorManager;
	public static final String LOG_TAG = PressureSensor.class.getName();

	public PressureSensor(SensorManager sensorManager) {
		this.sensorManager = sensorManager;
		sensorManager.registerListener(this,
				sensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE),
				SensorManager.SENSOR_DELAY_NORMAL);
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		DataListenerManager.isListeningPressure(new PressureData(event.values[0]));
		Log.d(LOG_TAG, "onSensorChanged|PressureSensor");
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {

	}

	public void unregister() {
		sensorManager.unregisterListener(this);
	}

}
