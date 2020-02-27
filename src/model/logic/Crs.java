package model.logic;


public class Crs {

	private String type;
	private Properties properties;

	public Crs (Properties properties)
	{
		this.properties = properties;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

}