package model.logic;

import java.sql.Date;

public class Properties {

	private String type;

	private int objectId;
	private Date fecha;
	private String medio_dete;
	private String clase_vehi;
	private String tipo_servi;
	private String infraccion;
	private String des_infrac;
	private String localidad;

	public Properties(int pObjectId, Date pFecha,String pMedio_dete, String pClase_vehi, String pTipo, String pInfraccion, String pDes, String pLocalidad )
	{
		objectId = pObjectId;
		fecha = pFecha;
		medio_dete = pMedio_dete;
		clase_vehi = pClase_vehi;
		tipo_servi = pTipo;
		infraccion = pInfraccion;
		des_infrac = pDes;
		localidad = pLocalidad;
	}

	public String getName() {
		return type;
	}

	public void setName(String pType) {
		this.type = pType;
	}

	public int getObjectId() {
		return objectId;
	}

	public void setObjectId(int objectId) {
		this.objectId = objectId;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getMedio_dete() {
		return medio_dete;
	}

	public void setMedio_dete(String medio_dete) {
		this.medio_dete = medio_dete;
	}

	public String getClase_vehi() {
		return clase_vehi;
	}

	public void setClase_vehi(String clase_vehi) {
		this.clase_vehi = clase_vehi;
	}

	public String getTipo_servi() {
		return tipo_servi;
	}

	public void setTipo_servi(String tipo_servi) {
		this.tipo_servi = tipo_servi;
	}

	public String getInfraccion() {
		return infraccion;
	}

	public void setInfraccion(String infraccion) {
		this.infraccion = infraccion;
	}

	public String getDes_infrac() {
		return des_infrac;
	}

	public void setDes_infrac(String des_infrac) {
		this.des_infrac = des_infrac;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

}
