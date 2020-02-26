package model.data_structures;

public class NodoPila<T> {
T elemento;
NodoPila<T> siguiente;

NodoPila(T x)
{
	elemento = x;
	siguiente = null;
}
class PilaLista
{
	private NodoPila<T> cima;
	private int tamanio;
	
	public PilaLista()
	{
		cima = null;
	}
	public int darTamanio()
	{
		return tamanio;
	}
	public boolean pilaVacia()
	{
		if(cima == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void push(T elemento)
	{
		NodoPila <T>nuevo;
		nuevo = new NodoPila<T>(elemento);
		nuevo.siguiente = cima;
		cima = nuevo;
		tamanio ++;
	}
	public T pop()
	{
		if(pilaVacia())
		{
			return null;
		}
		T aux = cima.elemento;
		cima = cima.siguiente;
		return aux;
	}
	public void limpiarPila()
	{
		NodoPila<T> t;
		while(!pilaVacia())
		{
			t = cima;
			cima = cima.siguiente;
			t.siguiente = null;
		}
	}
}
}
