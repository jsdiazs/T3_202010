 package model.logic;

import java.io.FileReader; 

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import model.data_structures.AlgoritmosOrdenamiento;
import model.data_structures.ArregloDinamico;
import model.data_structures.IArregloDinamico;
import model.data_structures.ILista;
import model.data_structures.NodoCola;
import model.data_structures.NodoPila;

/**
 * Definicion del modelo del mundo
 * @param <T>
 *
 */
public class Modelo<T> {
	private NodoCola cola;
	private NodoPila<T> pila;
	private AlgoritmosOrdenamiento<Feature> ordenadorJSON;
	private ILista lista;
	/**
	 * Atributos del modelo del mundo
	 */
	private IArregloDinamico datos;
	private FeatureCollection feature;
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo()
	{
		datos = new ArregloDinamico(7);
	}
	
	/**
	 * Constructor del modelo del mundo con capacidad dada
	 * @param tamano
	 */
	public Modelo(int capacidad)
	{
		datos = new ArregloDinamico(capacidad);
	}
	/**
	 */

	public void cargarJson()
	{
		try{
			JsonReader reader;
			Gson gson = new Gson();
			reader= new JsonReader(new FileReader("./data/comparendos_dei_2018_small.geojson"));
			feature = gson.fromJson(reader, FeatureCollection.class);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public int totalComparendos()
	{
		ArregloDinamico<T> listaCom = new ArregloDinamico<>(21);
		int totalComparendos=0;
		for (int i = 0; i < 21; i++) {
			Feature featurePos = feature.getFeature()[i];
			listaCom.add((T) featurePos);
			totalComparendos++;
		}
		return totalComparendos;
	}
	
	public String darInfoComparendoMayorObjectId()
	{
		IArregloDinamico<T> listaM = new ArregloDinamico<>(21);
		for(int i = 0;i < 241; i++)
		{
			Feature feature1 = feature.getFeature()[i];
			listaM.add((T) feature1);
		}
		return null;
	}

}
