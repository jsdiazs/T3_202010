package view;

import model.logic.Modelo;

public class View 
{
	    /**
	     * Metodo constructor
	     */
	    public View()
	    {
	    	
	    }
	    
		public void printMenu()
		{
			System.out.println("1. 1B - Consultar el primer comparendo que aparezca en el archivo que tiene una LOCALIDAD dada.");
			System.out.println("2. 2B - Consultar los comparendos registrados en el archivo dada una FECHA_HORA.");
			System.out.println("3. 3B - Comparar yo mostrar el total de todos los comparendos, por cada código INFRACCION, en dos FECHA_HORA dadas; estas fechas deben ser ingresada en el formato Año/Mes/Día.");
			System.out.println("4. 1B - Consultar el primer comparendo que aparece en el archivo");
			System.out.println("5. 2B - Consultar los comparendos registrados en el archivo dado un codigo INFRACCIÓN");
			System.out.println("6. 3B - Compara comparendos por cada codigo INFRACCION en los TIPO_SERVI Particular y Publico ");
			System.out.println("7. 1C - Mostrar el numero de comparendos por cada codigo INFRACCION en una localidad dada, para un tiempo dado por HORA inicial y FECHA_HORA final.");
			System.out.println("8. 2C - Consultar la información de los N códigos INFRACCION con más infracciones ordenados de mayor a menor en un periodo de tiempo dado por: FECHA_HORA inicial y FECHA_HORA final.");
			System.out.println("9. 3C - Generar una gráfica ASCII");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
		
		public void printModelo(Modelo modelo)
		{
			// TODO implementar
		}
}
