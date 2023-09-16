package model;

/**
 * @author torirem - aaustin5
 * CIS175 - Fall 2023
 * Sep 16, 2023
 */
public class TemperatureConverter {
	public double fahrenheit;
	public double celcius;
	
	public TemperatureConverter() {
		super();
	}
	
	public TemperatureConverter(double userTemp) {
		super();
		this.fahrenheit = userTemp;
		setTemperature(fahrenheit);
	}
	
	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
		setFahrenheit(fahrenheit);
		
	}

	/**
	 * @return the celcius
	 */
	public double getCelcius() {
		return celcius;
	}

	/**
	 * @param celcius the celcius to set
	 */
	public void setCelcius(double celcius) {
		this.celcius = celcius;
	}

	/**
	 * @return the fahrenheit
	 */
	public double getFahrenheit() {
		return fahrenheit;
	}

	public void setTemperature(double fahrenheit) {
		final int DEGREESTOREDUCE = 32;
		final double FIVEOVERNINE = .55555;
		
		setCelcius((fahrenheit - DEGREESTOREDUCE) * FIVEOVERNINE);
	}
	
	@Override
	public String toString() {
		return ("Temperature Converter: \nYou entered " + fahrenheit + " degrees Fahrenheit.\nThis is equivalent to " + celcius + " degrees Celcius");
	}
}	
