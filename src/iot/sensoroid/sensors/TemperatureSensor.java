package iot.sensoroid.sensors;

import iot.sensoroid.pojos.GravData;
import iot.sensoroid.pojos.TemperatureData;
import iot.sensoroid.utilities.DataListenerManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;

public class TemperatureSensor implements SensorEventListener {
	private SensorManager sensorManager;
	public static final String LOG_TAG = TemperatureSensor.class.getName();
	
	public TemperatureSensor(SensorManager sensorManager) {
		this.sensorManager = sensorManager;
		Sensor temperatureSensor = sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE);
		if (temperatureSensor != null) {
			sensorManager.registerListener(this,
					temperatureSensor,
					SensorManager.SENSOR_DELAY_NORMAL);
		}
		else {
			//CAN NOT REGISTER - NO SUCH SENSOR ON THIS PHONE!
		}
	}

	@Override
	public void onAccuracyChanged(Sensor arg0, int arg1) {
		
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		DataListenerManager.isListeningTemp(new TemperatureData(event.values[0]));
		Log.d(LOG_TAG, "onSensorChanged|TemperatureSensor");
	}
	
	public void unregister() {
		sensorManager.unregisterListener(this);
	}

}
