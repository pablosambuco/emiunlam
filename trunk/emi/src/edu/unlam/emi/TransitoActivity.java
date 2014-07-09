package edu.unlam.emi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class TransitoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
	
		setContentView(R.layout.layout_transito);
		
		TextView textoTransito = (TextView) findViewById(R.id.texto_transito);
		
		textoTransito.setText("Corte total en Camino del Buen Ayre por niebla ambos sentidos\n\n" +
				              "Corte por operativo anti piquete en colectora de General Paz altura Miguelete sentido Riachuelo\n\n" +
				              "Piquete en Acceso Sudeste altura Bernal. Demoras en Autopista BsAs-La Plata mano al sur\n\n" +
				              "Sigue cerrada Au Illia al centro con desvío a Avenida Sarmiento para todo el tránsito de Lugones\n\n" +
				              "Continúa el corte de la salida de Au 25 de Mayo a 9 de Julio por obras del Metrobus porteño" );
		
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
