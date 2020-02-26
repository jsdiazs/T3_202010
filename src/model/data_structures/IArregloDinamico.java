package model.data_structures;

public interface IArregloDinamico<T> {

public int darCapacidad( );
	
	public int size( );
	
	public T get( int i );

	public void add( T dato );
	
	public void remove( int pos );

	public void exch(int pos1, int pos2);
	
	public void asignar(int pos, T dato);
	
	public void shuffle();
}