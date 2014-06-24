package edu.unlam.emi;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class EstacionamientoActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
				
		setContentView(R.layout.layout_estacionamiento);

		final Button botonEstacionamiento = (Button) findViewById(R.id.boton_estacionamiento);
		final Button botonConsumos = (Button) findViewById(R.id.boton_consumos);
		final Button botonCredito = (Button) findViewById(R.id.boton_credito);
		final Button botonTransito = (Button) findViewById(R.id.boton_transito);
		final Button botonDatos = (Button) findViewById(R.id.boton_datos);

		View.OnClickListener handler = new View.OnClickListener() {

			public void onClick(View v) {

				if (v == botonEstacionamiento) {
					// doStuff
				}
				if (v == botonConsumos) {
					// doStuff
				}
				if (v == botonCredito) {
					// doStuff
				}
				if (v == botonTransito) {
					// doStuff
				}
				if (v == botonDatos) {
					// doStuff
				}
				
			}
		};
		
		botonEstacionamiento.setOnClickListener(handler);
		botonConsumos.setOnClickListener(handler);
		botonCredito.setOnClickListener(handler);
		botonTransito.setOnClickListener(handler);
		botonDatos.setOnClickListener(handler);
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