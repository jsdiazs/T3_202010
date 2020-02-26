package model.data_structures;

import java.util.Random;

/**
 * 2019-01-23
 * Estructura de Datos Arreglo Dinamico de Strings.
 * El arreglo al llenarse (llegar a su maxima capacidad) debe aumentar su capacidad.
 * @author Fernando De la Rosa
 *
 */
public class ArregloDinamico<T> implements IArregloDinamico<T> {

		private int tamanoMax;

		private int tamanoAct;

		private T elementos[ ];

		public ArregloDinamico(int max) 
		{
			elementos = (T[])new Object[max];
			tamanoMax = max;
			tamanoAct = 0;
		}

		public int darCapacidad()  
		{
			return tamanoMax;
		}

		public int size() 
		{
			return tamanoAct;
		}

		public T get(int i) 
		{
			return elementos[i];
		}

		public void add(T dato) 
		{
			if ( tamanoAct == tamanoMax )
			{  
				tamanoMax = 2 * tamanoMax;
				T [ ] copia = elementos;
				elementos = (T[])new Object[tamanoMax];
				for ( int i = 0; i < tamanoAct; i++)
				{
					elementos[i] = copia[i];
				} 
			}	
			elementos[tamanoAct] = dato;
			tamanoAct++;		
		}

		public void remove(int pos) 
		{
			if (pos < 0 || pos > tamanoAct)
				throw new ArrayIndexOutOfBoundsException(pos);
			if (pos == tamanoAct)
				elementos[pos] = null;
			else
			{
				for (int i = pos; pos < tamanoAct - 1; i++)
					elementos[i] = elementos[i+1];
				elementos[tamanoAct - 1] = null;
			}
			tamanoAct --;		
		}
		
		public void exch(int pos1, int pos2)
		{
			T x = elementos[pos1];
			T y = elementos[pos2];
			elementos[pos1] = y;
			elementos[pos2] = x;
		}
		
		public void asignar(int pos, T dato)
		{
			elementos[pos] = dato;
		}

		public void shuffle()
		{
			int n = tamanoAct;
			Random r = new Random();
			
			for (int i = n - 1; i > 0; i--)
			{
				int j = r.nextInt(i);
				exch(i, j);
			}
		}
}