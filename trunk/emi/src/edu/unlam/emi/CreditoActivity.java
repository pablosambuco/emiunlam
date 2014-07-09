package edu.unlam.emi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CreditoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.layout_credito);
		
		final Button botonCarga = (Button) findViewById(R.id.boton_carga);
		final EditText importe = (EditText) findViewById(R.id.importe);
		final Spinner lista = (Spinner) findViewById(R.id.lista);
		final EditText tarjeta = (EditText) findViewById(R.id.tarjeta);
		final EditText verificacion = (EditText) findViewById(R.id.verificacion);
		final TextView textoOK = (TextView) findViewById(R.id.texto_ok);
		
		textoOK.setVisibility(View.GONE);
		
		View.OnClickListener handler = new View.OnClickListener() {

			public void onClick(View v) {

				if (v == botonCarga) {

					if (validarLargo(importe,1)	&& validarLargo(tarjeta,14) && validarLargo(verificacion,3)) {
						botonCarga.setVisibility(View.GONE);
						textoOK.setVisibility(View.VISIBLE);
					}
				}
			}
		};

		botonCarga.setOnClickListener(handler);

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

	public boolean validarLargo(EditText campo, int largo) {

		String text = campo.getText().toString().trim();
		campo.setError(null);

		if (text.length() == 0) {
			campo.setError("Dato requerido");
			return false;
		}

		if (text.length() < largo) {
			campo.setError("Dato no válido");
			return false;
		}		
		
		return true;
	}

}
