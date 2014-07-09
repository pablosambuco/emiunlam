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
import android.widget.TextView;

public class CambioClaveActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.layout_cambio_clave);

		final Button botonClave = (Button) findViewById(R.id.boton_clave);
		final EditText clave0 = (EditText) findViewById(R.id.clave0);
		final EditText clave1 = (EditText) findViewById(R.id.clave1);
		final EditText clave2 = (EditText) findViewById(R.id.clave2);
		final TextView textoOK = (TextView) findViewById(R.id.texto_ok);
		
		textoOK.setVisibility(View.GONE);
		
		View.OnClickListener handler = new View.OnClickListener() {

			public void onClick(View v) {
				if (v == botonClave) {
					if(validarClaveAnterior(clave0) && validarClaveNueva(clave1,clave2))
					{
						SimuladorLogin.getInstance().setPassword(clave1.getText().toString().trim());					
						botonClave.setVisibility(View.GONE);
						textoOK.setVisibility(View.VISIBLE);
					}
				}
			}
		};
		
		botonClave.setOnClickListener(handler);

	}

	protected boolean validarClaveNueva(EditText clave1, EditText clave2) {
		String textoClave1 = clave1.getText().toString().trim();
		String textoClave2 = clave2.getText().toString().trim();
		clave1.setError(null);
		clave2.setError(null);

		if (textoClave1.length() == 0) {
			clave1.setError("Contraseña requerida");
			return false;
		}
		
		if (textoClave2.length() == 0) {
			clave2.setError("Contraseña requerida");
			return false;
		}
		
		if (textoClave1.compareTo(textoClave2)!=0) {
			clave2.setError("Contraseñas distintas");
			return false;
		}
		
		return true;
	}

	protected boolean validarClaveAnterior(EditText clave0) {
		String textoClave = clave0.getText().toString().trim();
		String textoClaveOrig = SimuladorLogin.getInstance().getPassword();
		clave0.setError(null);

		if (textoClave.length() == 0) {
			clave0.setError("Contraseña requerida");
			return false;
		}
		
		if(textoClave.compareTo(textoClaveOrig)!=0){
			clave0.setError("Contraseña incorrecta");
			return false;
		}			

		return true;
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
