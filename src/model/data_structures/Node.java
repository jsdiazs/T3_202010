package model.data_structures;

public class Node <T>
{
	private Node<T> next;
	
	private Node<T> prev;
	
	private T item;
		
	public Node(T pItem) 
	{
		next = null;
		prev = null;
		item = pItem;
	}
	
	public T darItem()
	{
		return item;
	}
	
	public boolean hasNext()	
	{
		if (next != null)
			return true;
		return false;
	}
	
	public boolean hasPrev()
	{
		if (prev != null)
			return true;
		return false;
	}
	
	public Node<T> next()
	{
		return next;
	}
	
	public Node<T> prev()
	{
		return prev;
	}
	
	public void cambiarNext(Node<T> pNext)
	{
		next = pNext;
	}
	
	public void cambiarPrev(Node<T> pPrev)
	{
		prev = pPrev;
	}
	
	public void agregar(T pNuevoItem)
	{
		if (!hasNext())
		{
			next = new Node<T>(pNuevoItem);
			next.cambiarPrev(this);
		}
		else 
			next.agregar(pNuevoItem);
	}
}
