package model.data_structures;

public interface ILista <T> 
{
	public int darTamanio();
	
	public void agregar(T pDato);
	
	public void eliminar(T pDato);
	
	public Node<T> darHead();
	
	public Node<T> darTail();
		
}