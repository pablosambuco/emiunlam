package edu.unlam.emi.model;

import java.util.Map;

/**
 * @author Sabrina
 * @version 1.0
 * @created 24-jun-2014 09:03:06 p.m.
 */
public class ControladorSensor {

	private Map<Sensor,PlazaEstacionamiento> MapaSensorPlaza;
	public Sensor m_Sensor;
	public PlazaEstacionamiento m_PlazaEstacionamiento;
	public InfraccionesTransito m_InfraccionesTransito;

	public ControladorSensor(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param sensor
	 */
	public PlazaEstacionamiento buscarPlaza(Sensor sensor){
		return null;
	}

	/**
	 * 
	 * @param sensor
	 */
	public void cambioEstadoSensor(Sensor sensor){

	}

	/**
	 * 
	 * @param plaza
	 */
	public void verificarEstadoPlaza(PlazaEstacionamiento plaza){

	}

}