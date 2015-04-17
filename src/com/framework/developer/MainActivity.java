package com.framework.developer;

import java.util.HashMap;

import android.app.Activity;
import iot.sensoroid.coreimplementation.SensorImpl;
import iot.sensoroid.coreinterface.Sensor;
import iot.sensoroid.customlistener.CustomDataListener;
import iot.sensoroid.developer.R;
import iot.sensoroid.utilities.DataListenerManager;
import iot.sensoroid.utilities.SensorType;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity implements CustomDataListener {

	private static final String TAG = "ServicesDemo";
	public Sensor sensor;
	private TextView acc_reading;
	private TextView reading; 
	
	public static final String LOG_TAG = MainActivity.class.getName();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		sensor = new SensorImpl();
		DataListenerManager.registerListener(this);
		reading = (TextView) findViewById(R.id.reading);
		acc_reading = (TextView) findViewById(R.id.acc_reading);

	}

	// Method to start the service
	public void startServiceLight(View view) {
		sensor.startSensor(SensorType.LIGHT);

	}

	// Method to stop the service
	public void stopServiceLight(View view) {
		sensor.stopSensor(SensorType.LIGHT);
	}

	// Method to start the service
	public void startServiceAcc(View view) {
		sensor.startSensor(SensorType.ACCELEROMETER);

	}

	// Method to stop the service
	public void stopServiceAcc(View view) {
		sensor.stopSensor(SensorType.ACCELEROMETER);
		Log.d(TAG, "onClick: stopping service");
	}

	@Override
	public void receiveSensorData(HashMap<SensorType, String> data) {
		// TODO Auto-generated method stub
		acc_reading.setText(data.get(SensorType.ACCELEROMETER));
		reading.setText(data.get(SensorType.LIGHT));
	}

}
