package edu.unlam.emi.model;

import java.util.Date;

/**
 * @author Pablo
 * @version 1.0
 * @created 24-jun-2014 09:03:06 p.m.
 */
public class Estacionamiento {

	private Date fechaAlta;
	private Date fechaBaja;
	private float importeTotal;
	private Vehiculo vehiculo;
	private PlazaEstacionamiento plaza;
	private Cronometro cronometro;
	public PlazaPermitida m_PlazaPermitida;
	public Cronometro m_Cronometro;

	public Estacionamiento(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param plazaEstacionamiento
	 * @param vehiculo
	 */
	public boolean darAlta(PlazaEstacionamiento plazaEstacionamiento, Vehiculo vehiculo){
		return false;
	}

	public boolean darBaja(){
		return false;
	}

	/**
	 * 
	 * @param plaza
	 */
	public void registrarPlazaEstacionamiento(PlazaEstacionamiento plaza){

	}

	public boolean verificarCredito(){
		return false;
	}

}