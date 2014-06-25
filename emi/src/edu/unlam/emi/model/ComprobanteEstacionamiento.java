package edu.unlam.emi.model;

import java.util.Date;

/**
 * @author Pablo
 * @version 1.0
 * @created 24-jun-2014 09:03:06 p.m.
 */
public class ComprobanteEstacionamiento {

	private long numero;
	private Date fecha;
	private float importeTotal;
	private float saldoCredito;
	public Estacionamiento m_Estacionamiento;

	public ComprobanteEstacionamiento(){

	}

	public void finalize() throws Throwable {

	}

	public long generarComprobante(){
		return 0;
	}

}