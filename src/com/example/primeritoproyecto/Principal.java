package com.example.primeritoproyecto;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends Activity {

	Button botonBlanco;
	Button botonNegro;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
        botonBlanco=(Button)findViewById(R.id.btBlanco);
       
       
        
        botonBlanco.setOnClickListener(new OnClickListener(){
            
            public void onClick(View arg0) {
         
              Toast.makeText(Principal.this, "Correcto! eres un genio", Toast.LENGTH_SHORT).show();
    
                }
       });
	
	}
	
	public void MetodoNegro(View v){
		Toast.makeText(Principal.this, "Casi, pero no", Toast.LENGTH_SHORT).show();
	}
	
	
	public void MetodoNumero(View v){
		Toast.makeText(Principal.this, "Ni siquiera es un color!!", Toast.LENGTH_SHORT).show();
	}


	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.actividad, menu);
		return true;
	}

	

}

	


