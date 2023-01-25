package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	
	private Consola() {

	}
	
	public static void mostrarMenu() {
		System.out.println("Programa para gestionar ajedrez.");
		System.out.println("---------------------------------");
		System.out.println("");
		System.out.println("1.- Crear reina por defecto.");
		System.out.println("2.- Crear reina eligiendo color.");
		System.out.println("3.- Mover.");
		System.out.println("");
		System.out.println("0.- Salir.");
		System.out.println("");
	}
	
	public static int elegirOpcionMenu()
	{
		int opcion;
		
		do
		{
			System.out.print("Introduce la opción a realizar (0-3): ");
			opcion=Entrada.entero();
			
		}while (opcion<0 || opcion>3);
		
		return opcion;
	}
	
	public static Color elegirColor()
	{
		int codigoColor;
		Color color=Color.BLANCO;
		
		do 
		{
			
			System.out.println("\n\nElige el color que tendrá la reina:");
			System.out.println("=======================================================");
			System.out.println("1.BLANCO");
			System.out.println("2.NEGRO");
			System.out.print("Introduzca el color que usted requiera (1-2): ");
			codigoColor=Entrada.entero();
			
		}while (codigoColor<1 || codigoColor>2);
				
		switch(codigoColor)
		{
			case 1:
				color=Color.BLANCO;
				break;
				
			case 2:
				color=Color.NEGRO;
					break;
		}
		
		return color;	
	}
		
		public static void mostrarMenuDirecciones() {
			System.out.println("Menú de direcciones");
			System.out.println("---------------------------------");
			System.out.println("");
			System.out.println("1.- Norte.");
			System.out.println("2.- Sur.");
			System.out.println("3.- Este.");
			System.out.println("4.- Oeste.");
			System.out.println("5.- Noreste.");
			System.out.println("6.- Noroeste.");
			System.out.println("7.- Sureste.");
			System.out.println("8.- Suroeste.");
			System.out.println("");
		}
		
		public static Direccion elegirDireccion()
		{
			Direccion direccion=Direccion.ESTE;
			int opcion;
			
			do
			{
				System.out.print("Introduce la dirección que se requiera (1-8): ");
				opcion=Entrada.entero();
				
			}while (opcion<1 || opcion>8);
			
			switch(opcion)
			{
				case 1:
					direccion=Direccion.NORTE;
					break;
					
				case 2:
					direccion=Direccion.SUR;
					break;
					
				case 3:
					direccion=Direccion.ESTE;
					break;
					
				case 4:
					direccion=Direccion.OESTE;
					break;
					
				case 5:
					direccion=Direccion.NORESTE;
					break;
					
				case 6:
					direccion=Direccion.NOROESTE;
					break;
				
				case 7:
					direccion=Direccion.SURESTE;
					break;
					
				case 8:
					direccion=Direccion.SUROESTE;
					break;
			}
			
			return direccion;		
	}
		
		public static int elegirPasos()
		{
			int codigoPasos;
			int pasos=1;
			
			do 
			{
				
				System.out.println("\n\nElige cuantos pasos se van a realizar:");
				System.out.println("=======================================================");
				System.out.print("Introduzca cuantos pasos se van a realizar (1-7): ");
				codigoPasos=Entrada.entero();
				
			}while (codigoPasos<1 || codigoPasos>7);
					
			switch(codigoPasos)
			{
				case 1:
					pasos=1;
					break;
					
				case 2:
					pasos=2;
						break;
				
				case 3:
					pasos=3;
						break;
						
				case 4:
					pasos=4;
						break;
						
				case 5:
					pasos=5;
						break;
						
				case 6:
					pasos=6;
						break;
						
				case 7:
					pasos=7;
						break;
			}
			return pasos;
		}
		
		public static void despedirse()
		{
			System.out.println("Usted ha salido del programa.");
		}
}
