package model;

/**
 * @author torirem - aaustin5
 * CIS175 - Fall 2023
 * Sep 16, 2023
 */
public class LengthConverter {

	public double inches;
	public double centimeters;
	
	public LengthConverter() {
		super();
	}
	
	public LengthConverter(double userInches){
		super();
		this.inches = userInches;
		setLength(inches);
	}
	/**
	 * @return the centimeters
	 */
	public double getCentimeters() {
		return centimeters;
	}

	/**
	 * @param centimeters the centimeters to set
	 */
	public void setCentimeters(double centimeters) {
		this.centimeters = centimeters;
	}

	/**
	 * @return the inches
	 */
	public double getInches() {
		return inches;
	}
	
	public void setInches(double inches) {
		this.inches = inches;
		setInches(inches);
	}
	
	public void setLength(double inches) {
		final double CMCONVERSION = 2.54;  // number of centimeters in an inch
		
		setCentimeters(inches * CMCONVERSION);
	}
	
	@Override
	public String toString() {
		return ("Length Converter: \nInches Entered: " + inches + "\nThis is equivalent to " + centimeters + " centimeters");
	}
}
