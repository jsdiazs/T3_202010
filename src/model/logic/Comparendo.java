package model.logic;

public class Comparendo implements Comparable<Comparendo>
{
	/**
	 * Tipo de servicio
	 */
	public static String PARTICULAR ="Particular";
	
	/**
	 * Tipo de servicio.
	 */
	public static String PUBLICO ="Publico";
	
	/**
	 * Tipo de servicio
	 */
	
	public static String OFICIAL="Oficial";
	
	/**
	 * Identificador único del comparendo
	 */
	public double OBJECTID;
	
	/**
	 * Fecha del comparendo en formato Año\/Mes\/Día
	 */
	public String FECHA_HORA;
	
	/**
	 * Tipo de vehículo ("“AUTOMOVIL”, "BICICLETA", "BUS", "BUSETA", "CAMIONETA", "CAMPERO", "MOTOCICLETA", …)
	 */
	public String MEDIO_DETE;
	
	/**
	 * Tipo de servicio ("Particular", "Público", "Oficial")
	 */
	public String TIPO_SERVI;
	
	/**
	 * Código de la infracción cometida
	 */
	public String INFRACCION;
	
	/**
	 * Descripción de la infracción
	 */
	public String DES_INFRAC;
	
	/**
	 * Localidad en la ciudad del comparendo
	 */
	public String LOCALIDAD;
	
	/**
	 * Longiud geográfica 
	 */
	public double longitud;
	
	/**
	 * Latitud geográfica
	 */
	public double latitud;
	
	public Comparendo(double pOBJECTID, String pFECHA_HORA, String pMEDIO_DETE, String pTIPO_SERVI, String pINFRACCION, String pDES_INFRAC, String pLOCALIDAD, double pLongitud, double pLatitud)
	{
		OBJECTID=pOBJECTID;
		FECHA_HORA=pFECHA_HORA;
		MEDIO_DETE=pMEDIO_DETE;
		TIPO_SERVI=pTIPO_SERVI;
		INFRACCION=pINFRACCION;
		DES_INFRAC=pDES_INFRAC;
		LOCALIDAD=pLOCALIDAD;
		longitud=pLongitud;
		latitud=pLatitud;
	}
	
	
	public double getOBJECTID() {
		return OBJECTID;
	}

	public void setOBJECTID(double gOBJECTID) {
		this.OBJECTID = gOBJECTID;
	}

	public String getFECHA_HORA() {
		return FECHA_HORA;
	}

	public void setFECHA_HORA(String gFECHA_HORA) {
		FECHA_HORA = gFECHA_HORA;
	}
	
	public String getMEDIO_DETE() {
		return MEDIO_DETE;
	}

	public void setMEDIO_DETE(String gMEDIO_DETE) {
		MEDIO_DETE = gMEDIO_DETE;
	}

	public String getTIPO_SERVI() {
		return TIPO_SERVI;
	}

	public void setTIPO_SERVI(String gTIPO_SERVI) {
		TIPO_SERVI = gTIPO_SERVI;
	}

	public String getINFRACCION() {
		return INFRACCION;
	}

	public void setINFRACCION(String gINFRACCION) {
		INFRACCION = gINFRACCION;
	}

	public String getDES_INFRAC() {
		return DES_INFRAC;
	}

	public void setDES_INFRAC(String gDES_INFRAC) {
		DES_INFRAC = gDES_INFRAC;
	}

	public String getLOCALIDAD() {
		return LOCALIDAD;
	}

	public void setLOCALIDAD(String lOCALIDAD) {
		LOCALIDAD = lOCALIDAD;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}


	public int compareTo(Comparendo o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
