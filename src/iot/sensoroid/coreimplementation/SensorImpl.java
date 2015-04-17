package iot.sensoroid.coreimplementation;

import iot.sensoroid.coreinterface.Sensor;
import iot.sensoroid.services.AccService;
import iot.sensoroid.services.GravityService;
import iot.sensoroid.services.GyroscopeService;
import iot.sensoroid.services.LightService;
import iot.sensoroid.services.LinearAccService;
import iot.sensoroid.services.LocationService;
import iot.sensoroid.services.MagneticFieldService;
import iot.sensoroid.services.OrientationService;
import iot.sensoroid.services.PressureService;
import iot.sensoroid.services.ProximityService;
import iot.sensoroid.services.RotationVectorService;
import iot.sensoroid.services.TemperatureService;
import iot.sensoroid.utilities.ApplicationContextProvider;
import iot.sensoroid.utilities.SensorType;
import android.content.Intent;

public class SensorImpl implements Sensor {

	@Override
	public void startSensor(SensorType type) {
		if(SensorType.LIGHT.equals(type)){				
			ApplicationContextProvider.getContext().startService(new Intent(ApplicationContextProvider.getContext(), LightService.class));
		}
		if(SensorType.ACCELEROMETER.equals(type)){				
			ApplicationContextProvider.getContext().startService(new Intent(ApplicationContextProvider.getContext(), AccService.class));
		}
		if(SensorType.GRAVITY.equals(type)){
			ApplicationContextProvider.getContext().startService(new Intent(ApplicationContextProvider.getContext(), GravityService.class));
		}
		if(SensorType.TEMPERATURE.equals(type)){
			ApplicationContextProvider.getContext().startService(new Intent(ApplicationContextProvider.getContext(), TemperatureService.class));
		}
		if(SensorType.ROTATION_VECTOR.equals(type)){
			ApplicationContextProvider.getContext().startService(new Intent(ApplicationContextProvider.getContext(), RotationVectorService.class));
		}
		if(SensorType.PROXIMITY.equals(type)){
			ApplicationContextProvider.getContext().startService(new Intent(ApplicationContextProvider.getContext(), ProximityService.class));
		}
		if(SensorType.PRESSURE.equals(type)){
			ApplicationContextProvider.getContext().startService(new Intent(ApplicationContextProvider.getContext(), PressureService.class));
		}
		if(SensorType.ORIENTATION.equals(type)){
			ApplicationContextProvider.getContext().startService(new Intent(ApplicationContextProvider.getContext(), OrientationService.class));
		}
		if(SensorType.MAGNETIC_FIELD.equals(type)){
			ApplicationContextProvider.getContext().startService(new Intent(ApplicationContextProvider.getContext(), MagneticFieldService.class));
		}
		if(SensorType.LOCATION.equals(type)){
			ApplicationContextProvider.getContext().startService(new Intent(ApplicationContextProvider.getContext(), LocationService.class));
		}
		if(SensorType.LINEAR_ACCELERATION.equals(type)){
			ApplicationContextProvider.getContext().startService(new Intent(ApplicationContextProvider.getContext(), LinearAccService.class));
		}
		if(SensorType.GYROSCOPE.equals(type)){
			ApplicationContextProvider.getContext().startService(new Intent(ApplicationContextProvider.getContext(), GyroscopeService.class));
		}
	}

	@Override
	public void stopSensor(SensorType type) {
		if (SensorType.LIGHT.equals(type)) {
			ApplicationContextProvider.getContext().stopService(
					new Intent(ApplicationContextProvider.getContext(),
							LightService.class));
		}
		if (SensorType.ACCELEROMETER.equals(type)) {
			ApplicationContextProvider.getContext().stopService(
					new Intent(ApplicationContextProvider.getContext(),
							AccService.class));
		}
		if (SensorType.GRAVITY.equals(type)) {
			ApplicationContextProvider.getContext().stopService(
					new Intent(ApplicationContextProvider.getContext(),
							GravityService.class));
		}
		if (SensorType.TEMPERATURE.equals(type)) {
			ApplicationContextProvider.getContext().stopService(
					new Intent(ApplicationContextProvider.getContext(),
							TemperatureService.class));
		}
		if (SensorType.ROTATION_VECTOR.equals(type)) {
			ApplicationContextProvider.getContext().stopService(
					new Intent(ApplicationContextProvider.getContext(),
							RotationVectorService.class));
		}
		if (SensorType.PROXIMITY.equals(type)) {
			ApplicationContextProvider.getContext().stopService(
					new Intent(ApplicationContextProvider.getContext(),
							ProximityService.class));
		}
		if (SensorType.PRESSURE.equals(type)) {
			ApplicationContextProvider.getContext().stopService(
					new Intent(ApplicationContextProvider.getContext(),
							PressureService.class));
		}
		if (SensorType.ORIENTATION.equals(type)) {
			ApplicationContextProvider.getContext().stopService(
					new Intent(ApplicationContextProvider.getContext(),
							OrientationService.class));
		}
		if (SensorType.MAGNETIC_FIELD.equals(type)) {
			ApplicationContextProvider.getContext().stopService(
					new Intent(ApplicationContextProvider.getContext(),
							MagneticFieldService.class));
		}
		if (SensorType.LOCATION.equals(type)) {
			ApplicationContextProvider.getContext().stopService(
					new Intent(ApplicationContextProvider.getContext(),
							LocationService.class));
		}
		if (SensorType.LINEAR_ACCELERATION.equals(type)) {
			ApplicationContextProvider.getContext().stopService(
					new Intent(ApplicationContextProvider.getContext(),
							LinearAccService.class));
		}
		if (SensorType.GYROSCOPE.equals(type)) {
			ApplicationContextProvider.getContext().stopService(
					new Intent(ApplicationContextProvider.getContext(),
							GyroscopeService.class));
		}
	}

}
