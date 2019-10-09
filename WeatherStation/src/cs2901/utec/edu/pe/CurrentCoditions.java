package cs2901.utec.edu.pe;

import java.util.*;

public class CurrentCoditions implements Observer {
		WeatherData subjects = Observer;
    @Override
    public void update() {
			WeatherData.getTemperature();
    }

    public void display(){
			System.out.println(WeatherData.getTemperature());
    }
}
