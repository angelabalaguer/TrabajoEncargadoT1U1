package com.example.u1t1_trabajosencargados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Formulario extends AppCompatActivity {
    EditText edtNombre;
    EditText edtApellido;
    EditText edtFechaNaci;

    Spinner spnrSexo;
    Spinner spnrGrado;

    Button btnejecutar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        edtNombre=findViewById(R.id.edTNombre);
        edtApellido=findViewById(R.id.edtApellido);
        edtFechaNaci=findViewById(R.id.edtFechNaci);
        spnrSexo=findViewById(R.id.spnrSexo);
        spnrGrado=findViewById(R.id.spnrGrado);
        btnejecutar=findViewById(R.id.btnRegistrar);



    }

    public void Verificar(View view) {
        Intent intent = new Intent(this, Formulario2.class);
        intent.putExtra("nombre", edtNombre.getText().toString());
        intent.putExtra("apellido", edtApellido.getText().toString());
        intent.putExtra("nacimiento", edtFechaNaci.getText().toString());
       // intent.putExtra("sexo", spnrSexo.().toString());
        // intent.putExtra("sexo", spnrGrado.getText().toString());

    //    intent.putExtra("edad", Integer.parseInt(edtedad.getText().toString()));
        startActivity(intent);

    }
}
