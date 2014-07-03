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
import android.widget.EditText;

public class AltaEstacionamientoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.layout_estacionamiento_alta);

		final Button botonAlta = (Button) findViewById(R.id.boton_alta);
		final EditText plaza = (EditText) findViewById(R.id.plaza);
		
		View.OnClickListener handler = new View.OnClickListener() {

			public void onClick(View v) {
				if (v == botonAlta) {
					if (validarPlaza(plaza)) {
						SimuladorEstacionamiento.getInstance().estacionar(plaza.getText().toString().trim());
						finish();
					}
				}
			}
		};

		botonAlta.setOnClickListener(handler);

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

	public boolean validarPlaza(EditText plaza) {

		String textoPlaza = plaza.getText().toString().trim();
		plaza.setError(null);

		if (textoPlaza.length() == 0) {
			plaza.setError("Plaza requerida");
			return false;
		}

		return true;
	}

	
}

