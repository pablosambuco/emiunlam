package edu.unlam.emi.model;

/**
 * @author Pablo
 * @version 1.0
 * @created 24-jun-2014 09:03:06 p.m.
 */
public class Horario {

	private int diaDeSemana;
	private long horaLibreInicio;
	private long horaLibreFin;
	private Cronometro[] cronometros;
	public Cronometro m_Cronometro;
	public HorarioLibre m_HorarioLibre;

	public Horario(){

	}

	public void finalize() throws Throwable {

	}

	public void actualizarHorarioLibre(){

	}

	/**
	 * 
	 * @param cronometro
	 */
	public void registrarCronometro(Cronometro cronometro){

	}

	/**
	 * 
	 * @param cronometro
	 */
	public void eliminarCronometro(Cronometro cronometro){

	}

	public boolean iniciarCronometros(){
		return false;
	}

	public boolean pausarCronometros(){
		return false;
	}

}