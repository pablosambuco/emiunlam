package edu.unlam.emi.model;

/**
 * @author Pablo
 * @version 1.0
 * @created 24-jun-2014 09:03:06 p.m.
 */
public class Conductor extends Usuario {

	private int dni;
	private float credito;
	public Pago m_Pago;

	public Conductor(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}