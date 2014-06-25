package edu.unlam.emi.model;

/**
 * @author Pablo
 * @version 1.0
 * @created 24-jun-2014 09:03:07 p.m.
 */
public class PlazaPermitida extends PlazaEstacionamiento {

	private Estacionamiento transaccionEstacionamiento;
	public Estacionamiento m_Estacionamiento;

	public PlazaPermitida(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param estacionamiento
	 */
	public void registrarEstacionamiento(Estacionamiento estacionamiento){

	}

}