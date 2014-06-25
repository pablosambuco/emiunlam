package edu.unlam.emi.model;

/**
 * @author Pablo
 * @version 1.0
 * @created 24-jun-2014 09:03:07 p.m.
 */
public class PlazaEstacionamiento {

	private String calle;
	private int numero;
	private Zona zona;
	private boolean estado;
	public Zona m_Zona;

	public PlazaEstacionamiento(){

	}

	public void finalize() throws Throwable {

	}

	public boolean darAltaEstacionamiento(){
		return false;
	}

	public boolean darBajaEstacionamiento(){
		return false;
	}

	/**
	 * 
	 * @param estado
	 */
	public void actualizarEstado(boolean estado){

	}

}