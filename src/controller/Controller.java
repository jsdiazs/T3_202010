package controller;

import java.util.Scanner;

import model.logic.Modelo;
import view.View;

public class Controller {

	/* Instancia del Modelo*/
	private Modelo modelo;
	
	/* Instancia de la Vista*/
	private View view;
	
	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller ()
	{
		view = new View();
		modelo = new Modelo();
	}
		
	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		String respuesta = "";
		modelo.cargarJson();
		System.out.println("El numero total de comparendos es: " + modelo.totalComparendos());

		while( !fin ){
			//Carga de datos
			view.printMenu();

			int option = lector.nextInt();
			switch(option){
				case 1:
					view.printMessage("--------- \nRealizar carga de los comparendos ");
					view.printMessage("Información del primer comparendo");
					view.printMessage("Información del último comparendo");
				    view.printMessage("Numero total de comparendos en la lista:");						
					break;

				case 2:
					view.printMessage("--------- \nConsultar la información básica de un comparendo dado su OBJECTID");
					dato = lector.next();
					//METODO QUE RETORNE EL COMPARENDO RESULTANTE 
					//OBJECTID debe ser el parametro 
					//REPORTAR CASO EN EL QUE NO EXISTA
					view.printMessage("Dato agregado");
					view.printMessage("Numero actual de elementos " + "\n---------");						
					break;

				case 4:
					view.printMessage("El primer comparendo que aparece en ");

					break;
					
				case 5:
					
					break;
					
				case 6: 
					
					break;
					
				case 7:
					
					break;
					
				case 8:
					break;
					
				case 9:
					break;
					
				default: 
					view.printMessage("--------- \n Opcion Invalida !! \n---------");
					break;
			}
		}
		
	}	
}
