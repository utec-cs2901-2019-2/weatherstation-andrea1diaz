package cs2901.utec.edu.pe;

import java.util.*;

public class CurrentCoditions implements Observer {
		WeatherData subject = new WeatherData();

    @Override
    public void update() {
			display();
		};

    public void display(){
			System.out.println(subject.getTemperature());
    }
}
