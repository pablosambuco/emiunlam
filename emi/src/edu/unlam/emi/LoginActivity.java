package edu.unlam.emi;

import java.util.regex.Pattern;

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

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.layout_login);

		final Button botonLogin = (Button) findViewById(R.id.boton_login);
		final EditText patente = (EditText) findViewById(R.id.patente);
		final EditText password = (EditText) findViewById(R.id.password);

		final String PATENTE_REGEX = "[A-Z]{3}[0-9]{3}";

		View.OnClickListener handler = new View.OnClickListener() {

			public void onClick(View v) {

				if (v == botonLogin) {

					if (validarPatente(patente, PATENTE_REGEX)	&& validarPassword(patente,password)) {
						SimuladorLogin.getInstance().setPatente(patente.getText().toString().trim());
						SimuladorLogin.getInstance().setPassword(password.getText().toString().trim());
						Intent intentMain = new Intent(LoginActivity.this,MainActivity.class);
						LoginActivity.this.startActivity(intentMain);
						finish();
					}
				}
			}
		};

		botonLogin.setOnClickListener(handler);

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

	public boolean validarPatente(EditText patente, String regex) {

		String text = patente.getText().toString().trim();
		patente.setError(null);

		if (text.length() == 0) {
			patente.setError("Patente requerida");
			return false;
		}

		if (!Pattern.matches(regex, text)) {
			patente.setError("Patente no válida");
			return false;
		}

		return true;
	}

	public boolean validarPassword(EditText patente, EditText password) {

		String textoPatente = patente.getText().toString().trim();
		String textoPassword = password.getText().toString().trim();
		password.setError(null);

		if (textoPassword.length() == 0) {
			password.setError("Contraseña requerida");
			return false;
		}

		return true;
	}

}
