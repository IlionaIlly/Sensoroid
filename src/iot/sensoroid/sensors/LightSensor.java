package iot.sensoroid.sensors;

import iot.sensoroid.pojos.LightData;
import iot.sensoroid.utilities.DataListenerManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;

public class LightSensor implements SensorEventListener {
	public static float result;
	private SensorManager sensorManager;
	public static final String TAG = LightSensor.class.getName();

	public LightSensor(SensorManager sensorManager) {
		this.sensorManager = sensorManager;
		sensorManager.registerListener(this,
				sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT),
				SensorManager.SENSOR_DELAY_NORMAL);
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		DataListenerManager.isListeningLight(new LightData(event.values[0]));
		Log.i(TAG, "Got the value Light!");

	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {

	}

	public void unregister() {
		sensorManager.unregisterListener(this);
	}

}
