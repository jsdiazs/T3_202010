package model.data_structures;

public class NodoCola<T> {
T elemento;
NodoCola<T> siguiente;
NodoCola(T x)
{
	elemento = x;
	siguiente = null;
	
}
public T getDato()
{
	return elemento;
}
public void setDato(T dato)
{
	this.elemento = dato;
}
public NodoCola<T> darSiguiente()
{
	return siguiente;
}
public void setSiguiente(NodoCola<T> siguiente)
{
	this.siguiente = siguiente;
}
class ColaLista
{
	protected NodoCola<T> frente;
	protected NodoCola<T> fin;
	private int tamanio;
	public ColaLista()
	{
		frente = fin = null;
	}
	public void enqueue(T elemento)
	{
		NodoCola<T> a;
		a = new NodoCola<T>(elemento);
		if(colaVacia()) {
			frente = a;

		}
		else
		{
			fin.siguiente = a;
			
		}
		fin = a;
		tamanio ++;
	}
	public T dequeue()
	{
		Object aux = null;
		if(!colaVacia())
		{
			aux = frente.elemento;
			frente = frente.siguiente;
		}
		return (T) aux;
	} 
	public void borraCola()
	{
		while(frente != null)
		{
			frente = frente.siguiente;
		}
		
	}
	public boolean colaVacia()
	{
		if(frente == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String toString()
	{
		StringBuilder sb =new StringBuilder();
		sb.append("[");
		if(colaVacia())
		{
			sb.append("]");
		}
		else
		{
			NodoCola<T> recorrer = frente;
			while(recorrer!= null)
			{
				sb.append(recorrer.getDato() + ((recorrer.darSiguiente() != null)?",":"]"));
			}
		}
		return sb.toString();
	}
}
}
