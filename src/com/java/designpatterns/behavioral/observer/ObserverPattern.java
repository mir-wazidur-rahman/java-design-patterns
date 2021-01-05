package com.java.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

interface Observer{
	public void update(int pressure, int temperature, int humidity);
}

interface Subject {
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyAllObservers();
}

class WeatherStation implements Subject {

	private int pressure;
	private int temperatue;
	private int humidity;
	private List<Observer> observerList;
	
	public WeatherStation() {
		this.observerList = new ArrayList<>();
	}
	
	
	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		this.observerList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		this.observerList.remove(o);
	}

	@Override
	public void notifyAllObservers() {
		// TODO Auto-generated method stub
		for (Observer o: this.observerList) {
			o.update(pressure, temperatue, humidity);
		}
		
	}


	public int getPressure() {
		return pressure;
	}


	public void setPressure(int pressure) {
		this.pressure = pressure;
		notifyAllObservers();
	}


	public int getTemperatue() {
		return temperatue;
	}


	public void setTemperatue(int temperatue) {
		this.temperatue = temperatue;
		notifyAllObservers();
	}


	public int getHumidity() {
		return humidity;
	}


	public void setHumidity(int humidity) {
		this.humidity = humidity;
		notifyAllObservers();
	}
	
}

public class ObserverPattern  implements Observer{
	
	private int pressure;
	private int temperature;
	private int humidity;
	private Subject subject;
	
	public ObserverPattern(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		this.subject.addObserver(this);
	}

	@Override
	public void update(int pressure, int temperature, int humidity) {
		// TODO Auto-generated method stub
		this.pressure = pressure;
		this.humidity = humidity;
		this.temperature = temperature;
		
		showData();
	}

	private void showData() {
		// TODO Auto-generated method stub
		System.out.println(
				"Pressure: " + this.pressure 
				+ " Temperature: " + this.temperature
				+ " Humidity: " + this.humidity);
	}
	
	public static void main(String[] args) {
		WeatherStation station = new WeatherStation();
		ObserverPattern obsever = new ObserverPattern(station);
		
		station.setHumidity(100);
		station.setPressure(200);
		station.setTemperatue(300);
	}

}
