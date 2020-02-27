package model.logic;

public class Geometry 
{
	private String type;
	
	private double[] coordinates;

	public Geometry (double[] pCoordinates)
	{
		coordinates = pCoordinates;
	}
	public double[] darCoordinates()
	{
		return coordinates;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
