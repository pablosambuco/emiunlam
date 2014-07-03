package edu.unlam.emi.model;

public class SimuladorEstacionamiento {
	private static SimuladorEstacionamiento instance = null;
	private Boolean estacionado = false;
	private String plaza;

	protected SimuladorEstacionamiento() {
		// Exists only to defeat instantiation.
	}

	public static SimuladorEstacionamiento getInstance() {
		if (instance == null) {
			instance = new SimuladorEstacionamiento();
		}
		return instance;
	}

	public Boolean validar() {
		return estacionado;
	}

	public void estacionar(String p) {
		estacionado = true;
		plaza = p;
	}

	public String getPlaza() {
		return plaza;
	}

	public void liberar() {
		estacionado = false;
	}

}