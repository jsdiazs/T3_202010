package model.logic;
public class FeatureCollection 
{
	private Feature[] feature; 
	
	public FeatureCollection(Feature[] pFeature )
	{
		feature = pFeature;  
	}
	
	public Feature[] getFeature()
	{
		return feature; 
	}
	
	public void setFeature(Feature[] pFeature)
	{
		this.feature = pFeature; 
	}
}
