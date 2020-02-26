	package model.data_structures;
	public class AlgoritmosOrdenamiento <T extends Comparable<T>>
	{
		private T[] auxiliar;

		public AlgoritmosOrdenamiento()
		{
			//
		}

		public void shellSort(IArregloDinamico<T> arreglo)
		{
			int N = arreglo.size();
			int h = 1;
			while (h < N/3)
				h = 3*h + 1;
			while (h >= 1)
			{
				for(int i = h; i < N; i++)
				{
					for (int j = i; j >= h && arreglo.get(j).compareTo(arreglo.get(j - h)) < 0; j -= h)
						arreglo.exch(j, j - h);
				}
				h = h/3;
			}
		}

		public void mergeSort(IArregloDinamico<T> arreglo) 
		{
			auxiliar = 	((T[])new Comparable[arreglo.size()]);
			sortM(arreglo, 0, arreglo.size() - 1);
		}

		private void sortM(IArregloDinamico<T> arreglo, int lo, int hi) 
		{
			if (hi <= lo) 
				return; 
			int mid = lo + (hi - lo)/2;
			sortM(arreglo, lo, mid);
			sortM(arreglo, mid+1, hi);
			merge(arreglo, lo, mid, hi);
		}

		private void merge(IArregloDinamico<T> arreglo, int lo, int mid, int hi)
		{
			int i = lo;
			int j = mid+1;
			for (int k = lo; k <= hi; k++)
				auxiliar[k] = arreglo.get(k);
			for (int k = lo; k <= hi; k++)
			{
				if (i > mid) 
					arreglo.asignar(k, auxiliar[j++]);
				else if (j > hi ) 
					arreglo.asignar(k, auxiliar[i++]);
				else if (auxiliar[j].compareTo(auxiliar[i]) < 0) 
					arreglo.asignar(k, auxiliar[j++]);
				else 
					arreglo.asignar(k, auxiliar[i++]);
			}
		}

		public void quickSort(IArregloDinamico<T> arreglo)
		{
			arreglo.shuffle();
			sortQ(arreglo, 0, arreglo.size() - 1);
		}

		private void sortQ(IArregloDinamico<T> arreglo, int lo, int hi)
		{
			if (hi <= lo) 
				return;
			int j = partition(arreglo, lo, hi);
			sortQ(arreglo, lo, j-1); 
			sortQ(arreglo, j+1, hi);
		}

		private int partition(IArregloDinamico<T> arreglo, int lo, int hi)
		{
			int i = lo;
			int j = hi+1;
			T piv = arreglo.get(lo);
			while (true)
			{
				while (arreglo.get(++i).compareTo(piv) < 0)
					if (i == hi) 
						break;
				while (piv.compareTo(arreglo.get(--j)) < 0)
					if (j == lo) 
						break;
				if (i >= j) 
					break; 
				arreglo.exch(i, j);
			}
			arreglo.exch(lo, j);
			return j;
		}
	}
