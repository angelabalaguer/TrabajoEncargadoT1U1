package com.example.u1t1_trabajosencargados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Formulario2 extends AppCompatActivity {
    TextView txtmensaje;
    String nombre;
    String apellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario2);
        Bundle extras = getIntent().getExtras();
        nombre= extras.getString("nombre");
        apellido = extras.getString("apellido");
        txtmensaje=findViewById(R.id.txtmensaje);

        txtmensaje.setText("Buen día "+ nombre + " "+apellido + "al registro de la upt");
    }

}

