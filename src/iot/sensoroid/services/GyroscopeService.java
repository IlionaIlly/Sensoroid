package iot.sensoroid.services;

import iot.sensoroid.sensors.GyroscopeSensor;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.hardware.SensorManager;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class GyroscopeService extends Service {
	private static final String TAG = "GyroscopeService";
	private GyroscopeSensor gyroSensor;
	
	@Override
	public IBinder onBind(Intent arg0) {
		return null;
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// Let it continue running until it is stopped.
		Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
		Log.d(TAG, "onStart");
		gyroSensor = new GyroscopeSensor(
				(SensorManager) getSystemService(Context.SENSOR_SERVICE));
		return START_NOT_STICKY;
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		// stop the sensor and service
		gyroSensor.unregister();
		stopSelf();
		Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
	}
	
}

