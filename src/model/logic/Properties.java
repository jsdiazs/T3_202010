package model.logic;

import java.sql.Date;

public class Properties {

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
	public int darObject()
	{
		return objectId;
	}
	public Date darFecha()
	{
		return fecha;
	}
	public String darMedio()
	{
		return medio_dete;
	}
	public String darClase()
	{
		return clase_vehi;
	}
	public String darTipo()
	{
		return tipo_servi;
	}
	public String darInfraccion()
	{
		return infraccion;
	}
	public String darDes()
	{
		return des_infrac;
	}
	public String darLocalidad()
	{
		return localidad;
	}
}
