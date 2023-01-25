package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {
	
	//Atributos
	public Color color;
	public Posicion posicion;
	
	//Métodos
	public Reina() {
		setColor(Color.BLANCO);
		setPosicion(new Posicion(1, 'd'));
	}
	
	public Reina(Color color) {
		setColor(color);
		if(color==Color.BLANCO) {
			setPosicion(new Posicion(1, 'd'));
		} else
			setPosicion(new Posicion(8, 'd'));
	}
	
	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
		if(direccion==null)
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		
		if (pasos<1 || pasos>7)
			throw new IllegalArgumentException ("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
		
		switch(direccion) {
			case NORTE:
					try {
						setPosicion(new Posicion(posicion.getFila()+pasos, posicion.getColumna()));
					} catch (IllegalArgumentException e) {
						throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
					} break;
				
			case SUR:
					try {
						setPosicion(new Posicion(posicion.getFila()-pasos, posicion.getColumna()));
					} catch (IllegalArgumentException e) {
						throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
					}break;
				
			case ESTE:
					try {
						setPosicion(new Posicion(posicion.getFila(), (char)(posicion.getColumna()+pasos)));
					} catch (IllegalArgumentException e) {
						throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
					} break;
				
			case OESTE:
					try {
						setPosicion(new Posicion(posicion.getFila(), (char)(posicion.getColumna()-pasos)));
					} catch (IllegalArgumentException e) {
						throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
					}break;
				
			case NORESTE:
					try {
						setPosicion(new Posicion(posicion.getFila()+pasos, (char)(posicion.getColumna()+pasos)));
					} catch (IllegalArgumentException e) {
						throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
					}break;
					
			case NOROESTE:
				try {
					setPosicion(new Posicion(posicion.getFila()+pasos, (char)(posicion.getColumna()-pasos)));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
				}break;
				
			case SURESTE:
					try {
						setPosicion(new Posicion(posicion.getFila()-pasos, (char)(posicion.getColumna()+pasos)));
					} catch (IllegalArgumentException e) {
						throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
					}break;
				
			case SUROESTE:
					try {
						setPosicion(new Posicion(posicion.getFila()-pasos, (char)(posicion.getColumna()-pasos)));
					} catch (IllegalArgumentException e) {
						throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
					}break;
			}
	}

	public Color getColor() {
		return color;
	}
	private void setColor(Color color) {
		if (color==null)
			throw new NullPointerException ("ERROR: El color no puede ser nulo.");
		this.color = color;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	private void setPosicion(Posicion posicion) {
		if (posicion==null)
			throw new NullPointerException ("ERROR: La posición no puede ser nula.");

		this.posicion = new Posicion(posicion);
	}
	
	@Override
	public String toString() {
		return "color=" + color + ", posicion=" + "(" + posicion + ")";
	}

}
