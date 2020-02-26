package model.data_structures;

public class Lista<T> implements ILista<T>
{
	private int tamanio;

	private Node<T> head;

	private Node<T> tail;

	public Lista() 
	{
		tamanio = 0;
		head = null;
		tail = null;
	}

	public int darTamanio() 
	{
		return tamanio;
	}

	public Node<T> darHead()
	{
		return head;
	}
	
	public Node<T> darTail()
	{
		return tail;
	}
	
	public void agregar(T pDato) 
	{
		if (tamanio == 0)
		{
			head = new Node<T>(pDato);
			tail = head;
			tamanio ++;
		}
		else
		{
			tail.agregar(pDato);
			tail = tail.next();
			tamanio ++;
		}	
	}

	public void eliminar(T pDato) 
	{
		if (tamanio > 0)
		{
			if(pDato.equals(head.darItem()))
			{
				Node<T> newHead = head.next();
				head = null;
				head = newHead;
				tamanio--;
			}
			else if (pDato.equals(tail.darItem()))
			{
				Node<T> newTail = tail.prev();
				tail = null;
				tail = newTail;
				tamanio--;
			}
			else
			{
				boolean elimino = false;
				Node<T> actual = head;
				while (!elimino)
				{
					Node<T> sig = actual.next();
					if (sig.darItem().equals(pDato))
					{
						actual.cambiarNext(sig.next());
						sig.next().cambiarPrev(actual);
						sig = null;
						tamanio--;
						elimino = true;
					}
					actual = sig;
				}
			}
		}
	}
}
