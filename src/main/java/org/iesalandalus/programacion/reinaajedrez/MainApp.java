package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {
	
	static Reina reina=null;
	
	public static void main(String[] args) {
		
		int opcion;

		do 
		{
		
			Consola.mostrarMenu();
			opcion=Consola.elegirOpcionMenu();
			ejecutarOpcion(opcion);
		
		}while (opcion != 0);
	}

		private static void ejecutarOpcion(int opcion) {
			switch (opcion) {
				case 1:
					crearReinaDefecto();
					break;
				
				case 2:
					crearReinaColor();
					break;
				
				case 3:
					mover();
					mostrarReina();
					break;
				
				case 0:
					Consola.despedirse();
					break;
				
				default:
					Consola.despedirse();
					break;
			}
		}
		
		private static void crearReinaDefecto() {
				try {
					reina=new Reina();
				} catch(NullPointerException e) {
					System.out.println(e.getMessage());	
					System.out.println(" ");
			}
		}
		
		private static void crearReinaColor() {
			Color color=Consola.elegirColor();
			try {
				reina=new Reina(color);
			} catch(NullPointerException e){
				System.out.println(e.getMessage());
				System.out.println(" ");
			}
		}
		
		private static void mover() {
			if (reina!=null) {
			Consola.mostrarMenuDirecciones();
			Direccion direccion=Consola.elegirDireccion();
			int pasos=Consola.elegirPasos();
			try {
				reina.mover(direccion, pasos);
			} catch(NullPointerException | OperationNotSupportedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
		
		private static void mostrarReina() {
			if (reina!=null) {
				System.out.println("Los atributos de la reina actual son: " + reina.toString());
				System.out.println(" ");
			} else {
				System.out.println("¡Usted no ha creado ninguna reina!, vuelva a intentarlo.");
				System.out.println(" ");
			}
	}
}
