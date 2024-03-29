package edu.unlam.emi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.layout_principal);
		
		final Button botonEstacionamiento = (Button) findViewById(R.id.boton_estacionamiento);
		final Button botonConsumos = (Button) findViewById(R.id.boton_consumos);
		final Button botonCredito = (Button) findViewById(R.id.boton_credito);
		final Button botonTransito = (Button) findViewById(R.id.boton_transito);
		final Button botonDatos = (Button) findViewById(R.id.boton_datos);

		View.OnClickListener handler = new View.OnClickListener() {

			public void onClick(View v) {

				if (v == botonEstacionamiento) {
					Intent intentEstacionamiento = new Intent(MainActivity.this,EstacionamientoActivity.class);
					MainActivity.this.startActivity(intentEstacionamiento);
				}
								
				if (v == botonConsumos) {
					Intent intentConsumos = new Intent(MainActivity.this,ConsumoActivity.class);
					MainActivity.this.startActivity(intentConsumos);

				}
				
				if (v == botonCredito) {
					Intent intentCredito = new Intent(MainActivity.this,CreditoActivity.class);
					MainActivity.this.startActivity(intentCredito);

				}
				
				if (v == botonTransito) {
					Intent intentTransito = new Intent(MainActivity.this,TransitoActivity.class);
					MainActivity.this.startActivity(intentTransito);

				}
				
				if (v == botonDatos) {
					Intent intentDatos = new Intent(MainActivity.this,DatosActivity.class);
					MainActivity.this.startActivity(intentDatos);

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
