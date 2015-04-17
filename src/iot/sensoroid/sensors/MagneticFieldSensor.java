package iot.sensoroid.sensors;

import iot.sensoroid.pojos.MagneticFieldData;
import iot.sensoroid.utilities.DataListenerManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;

public class MagneticFieldSensor implements SensorEventListener {
	private SensorManager sensorManager;
	public static final String LOG_TAG = MagneticFieldSensor.class.getName();

	public MagneticFieldSensor(SensorManager sensorManager) {
		this.sensorManager = sensorManager;
		sensorManager.registerListener(this,
				sensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD),
				SensorManager.SENSOR_DELAY_NORMAL);
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		DataListenerManager.isListeningMagneticField(new MagneticFieldData(event.values[0],
				event.values[1], event.values[2]));
		Log.d(LOG_TAG, "onSensorChanged|MagneticFieldSensor");
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {

	}

	public void unregister() {
		sensorManager.unregisterListener(this);
	}

}