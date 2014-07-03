package edu.unlam.emi;

import edu.unlam.emi.model.SimuladorEstacionamiento;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class EstacionamientoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.layout_estacionamiento);

		final Button botonAlta = (Button) findViewById(R.id.boton_alta);
		final Button botonBaja = (Button) findViewById(R.id.boton_baja);
		final Button botonLugares = (Button) findViewById(R.id.boton_lugares);
		final Button botonGuiar = (Button) findViewById(R.id.boton_guiar);		
		final TextView textoPlaza = (TextView) findViewById(R.id.texto_plaza);

		if(SimuladorEstacionamiento.getInstance().validar() == true) {
			botonAlta.setVisibility(View.GONE);
			botonBaja.setVisibility(View.VISIBLE);
			botonLugares.setVisibility(View.GONE);
			botonGuiar.setVisibility(View.VISIBLE);
			textoPlaza.setVisibility(View.VISIBLE);
			textoPlaza.setText("La ubicaciónde su vehículo es:\n" +
							   "Calle: Molina\n" +
							   "Altura: 1900\n" +
							   "Codigo: " + SimuladorEstacionamiento.getInstance().getPlaza() 
					           );
		}
		else {
			botonAlta.setVisibility(View.VISIBLE);
			botonBaja.setVisibility(View.GONE);
			botonLugares.setVisibility(View.VISIBLE);			
			botonGuiar.setVisibility(View.GONE);
			textoPlaza.setVisibility(View.GONE);
		}
		
		View.OnClickListener handler = new View.OnClickListener() {

			public void onClick(View v) {
				if (v == botonAlta) {
					Intent intentAlta = new Intent(EstacionamientoActivity.this,AltaEstacionamientoActivity.class);
					EstacionamientoActivity.this.startActivity(intentAlta);
				}
				
				if (v == botonBaja) {
					Intent intentBaja = new Intent(EstacionamientoActivity.this,BajaEstacionamientoActivity.class);
					EstacionamientoActivity.this.startActivity(intentBaja);
					SimuladorEstacionamiento.getInstance().liberar();
				}
				
				if (v == botonLugares) {
					Intent intentLugares = new Intent(EstacionamientoActivity.this,LugaresEstacionamientoActivity.class);
					EstacionamientoActivity.this.startActivity(intentLugares);
				}

				if (v == botonGuiar) {
					Intent intentGuiar = new Intent(EstacionamientoActivity.this,GuiarEstacionamientoActivity.class);
					EstacionamientoActivity.this.startActivity(intentGuiar);
				}
				
			}
		};
		
		botonAlta.setOnClickListener(handler);
		botonBaja.setOnClickListener(handler);
		botonLugares.setOnClickListener(handler);
		botonGuiar.setOnClickListener(handler);
	}

	@Override
	protected void onRestart() {
		super.onRestart();

		final Button botonAlta = (Button) findViewById(R.id.boton_alta);
		final Button botonBaja = (Button) findViewById(R.id.boton_baja);
		final Button botonLugares = (Button) findViewById(R.id.boton_lugares);
		final Button botonGuiar = (Button) findViewById(R.id.boton_guiar);		
		final TextView textoPlaza = (TextView) findViewById(R.id.texto_plaza);

		if(SimuladorEstacionamiento.getInstance().validar() == true) {
			botonAlta.setVisibility(View.GONE);
			botonBaja.setVisibility(View.VISIBLE);
			botonLugares.setVisibility(View.GONE);
			botonGuiar.setVisibility(View.VISIBLE);
			textoPlaza.setVisibility(View.VISIBLE);
			textoPlaza.setText("La ubicaciónde su vehículo es:\n" +
							   "Calle: Molina\n" +
							   "Altura: 1900\n" +
							   "Codigo: " + SimuladorEstacionamiento.getInstance().getPlaza() 
					           );
		}
		else {
			botonAlta.setVisibility(View.VISIBLE);
			botonBaja.setVisibility(View.GONE);
			botonLugares.setVisibility(View.VISIBLE);			
			botonGuiar.setVisibility(View.GONE);
			textoPlaza.setVisibility(View.GONE);
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
