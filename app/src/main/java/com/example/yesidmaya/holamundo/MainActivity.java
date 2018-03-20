package com.example.yesidmaya.holamundo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.example.yesidmaya.holamundo.modelo.Alumno;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Alumno alumno = new Alumno(); // Instanciando la clase 'final' se coloca automaticamente porq estamos trabajando una clase dentro de otra
        alumno.setNombre("Yesid Maya");
        alumno.setFechanacimiento(new Date());
        alumno.setNumero_cuenta(1234567);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Nombre Alumno " + alumno.getNombre(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    public void enviarDatos(View view){ // parametros que seria el objeto view. es el boton
        EditText edtNombre = findViewById(R.id.nombre); // traemos o hacemos referencia con el id al editText (EditText)
        String nombre = edtNombre.getText().toString(); // Extraemos el nombre o el dato que se va a colocar en el EditText

        Toast.makeText(getBaseContext(), "Felicidades tu nombre es: " + nombre, Toast.LENGTH_LONG).show(); // mostramos el texto escrito en el EditText desde el boton
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
