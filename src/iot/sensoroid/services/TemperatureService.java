package iot.sensoroid.services;

import iot.sensoroid.sensors.TemperatureSensor;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.hardware.SensorManager;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class TemperatureService extends Service {
	private static final String TAG = "TemperatureService";
	private TemperatureSensor tempSensor;

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// Let it continue running until it is stopped.
		Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
		Log.d(TAG, "onStart");
		tempSensor = new TemperatureSensor(
				(SensorManager) getSystemService(Context.SENSOR_SERVICE));
		return START_NOT_STICKY;
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		// stop the sensor and service
		tempSensor.unregister();
		stopSelf();
		Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
	}

}
