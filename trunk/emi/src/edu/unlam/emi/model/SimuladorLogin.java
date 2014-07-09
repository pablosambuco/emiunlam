package edu.unlam.emi.model;

public class SimuladorLogin {
	private static SimuladorLogin instance = null;
	private String patente;
	private String password;

	protected SimuladorLogin() {
		// Exists only to defeat instantiation.
	}

	public static SimuladorLogin getInstance() {
		if (instance == null) {
			instance = new SimuladorLogin();
		}
		return instance;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



}