package edu.unlam.emi;

import edu.unlam.emi.util.DatePickerFragment;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class ConsumoActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.layout_consumo);

		final ImageButton botonDesde = (ImageButton) findViewById(R.id.buscar_desde);
		final ImageButton botonHasta = (ImageButton) findViewById(R.id.buscar_hasta);

		final EditText desde = (EditText) findViewById(R.id.fecha_desde);
		final EditText hasta = (EditText) findViewById(R.id.fecha_hasta);
		
		final Button botonBuscar = (Button) findViewById(R.id.boton_buscar);

		View.OnClickListener handler = new View.OnClickListener() {

			public void onClick(View v) {
				if (v == botonDesde) {
				    DialogFragment fragment = new DatePickerFragment(desde);
				    fragment.show(getSupportFragmentManager(), "datePicker");
				}
				if (v == botonHasta) {
				    DialogFragment fragment = new DatePickerFragment(hasta);
				    fragment.show(getSupportFragmentManager(), "datePicker");
				}
				if (v == botonBuscar) {
					Intent intentListaConsumo = new Intent(ConsumoActivity.this,ListaConsumoActivity.class);
					ConsumoActivity.this.startActivity(intentListaConsumo);
				}				
			}

		};
		
		botonDesde.setOnClickListener(handler);
		botonHasta.setOnClickListener(handler);
		botonBuscar.setOnClickListener(handler);

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
