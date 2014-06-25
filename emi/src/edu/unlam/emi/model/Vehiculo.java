package edu.unlam.emi.model;

/**
 * @author Pablo
 * @version 1.0
 * @created 24-jun-2014 09:03:07 p.m.
 */
public class Vehiculo {

	private char[] patente;
	private Credito credito;
	public Estacionamiento m_Estacionamiento;
	public Conductor m_Conductor;
	public Credito m_Credito;

	public Vehiculo(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param importe
	 */
	public void descontarCredito(float importe){

	}

	/**
	 * 
	 * @param importe
	 */
	public void sumarCredito(float importe){

	}

	public float getCredito(){
		return (Float) null;
	}

}