package cs20901.utec.edu.pe;

import java.util.*;

public class WeatherData {
		private List<Observer> data = new ArrayList<>();

    public void registerObserver(Observer observer) {
			data.add(observer);
		};

    public void removeObserver(Observer observer) {
			data.remove(observer);
		};

    public void notifyObservers(Observer observer) {
			data.notify(observer);
		};

	
		public double getTemperature() {
		double x = Math.random();
    return x;
	};

		public double getHumidity() {
			double x = Math.random();
			return x;
		};

		public double getPressure() {
			double x = Math.random();
			return x;
		};

		public List<double>  measurementsChanged() {
			List<double> measurements = new ArrayList<>();
			
			int x = Math.random();

			for (int i = 0; i < x; i++) {
				
				measurements.add(getPressure());
			}
			
			return measurements;
		};
};
