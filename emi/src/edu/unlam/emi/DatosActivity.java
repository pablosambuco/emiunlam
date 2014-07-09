package edu.unlam.emi;

import edu.unlam.emi.model.SimuladorLogin;
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

public class DatosActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.layout_datos);

		final Button botonClave = (Button) findViewById(R.id.boton_clave);
		final EditText nombre = (EditText) findViewById(R.id.nombre);
		final EditText apellido = (EditText) findViewById(R.id.apellido);
		final EditText dni = (EditText) findViewById(R.id.dni);
		final EditText patente = (EditText) findViewById(R.id.patente);
		final EditText password = (EditText) findViewById(R.id.password);

		nombre.setText("José");
		apellido.setText("Rodriguez");
		dni.setText("10.345.278");
		patente.setText(SimuladorLogin.getInstance().getPatente());
		password.setText(SimuladorLogin.getInstance().getPassword());
		
		View.OnClickListener handler = new View.OnClickListener() {

			public void onClick(View v) {
				if (v == botonClave) {
					Intent intentCambioClave = new Intent(DatosActivity.this,CambioClaveActivity.class);
					DatosActivity.this.startActivity(intentCambioClave);
				}
			}

		};
		
		botonClave.setOnClickListener(handler);

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
