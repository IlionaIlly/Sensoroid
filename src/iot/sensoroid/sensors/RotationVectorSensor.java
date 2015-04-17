package iot.sensoroid.sensors;

import iot.sensoroid.pojos.GravData;
import iot.sensoroid.pojos.RotationVectorData;
import iot.sensoroid.utilities.DataListenerManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;

public class RotationVectorSensor implements SensorEventListener {
	
	private SensorManager sensorManager;
	public static final String LOG_TAG = RotationVectorSensor.class.getName();

	public RotationVectorSensor(SensorManager sensorManager) {
		this.sensorManager = sensorManager;
		sensorManager.registerListener(this,
				sensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR),
				SensorManager.SENSOR_DELAY_NORMAL);
	}
	
	@Override
	public void onSensorChanged(SensorEvent event) {
		DataListenerManager.isListeningRotation(new RotationVectorData(event.values[0],
				event.values[1], event.values[2], event.values[3]));
		Log.d(LOG_TAG, "onSensorChanged|RotationVectorSensor");
	}
	
	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub
		
	}
	
	public void unregister() {
		sensorManager.unregisterListener(this);
	}


}
