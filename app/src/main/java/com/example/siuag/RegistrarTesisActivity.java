package com.example.siuag;

import android.content.Intent;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RegistrarTesisActivity extends AppCompatActivity {
    private EditText TxtTitulo;
    private EditText TxtDescripcion;
    private EditText TxtFechaInicio;
    private EditText TxtFechaFin;
    private EditText TxtCodigoTesis;
    private EditText TxtCodigoCarrrera;
    private EditText TxtCodigoEstudiante;
    private Button BtnRegistrar;
    private TextView TxtValidacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_tesis);
        TxtTitulo=(EditText) findViewById(R.id.editTextTitulo);
        TxtDescripcion=(EditText) findViewById(R.id.editTextDescripcion);
        TxtFechaInicio=(EditText) findViewById(R.id.editTextFechaInicio);
        TxtFechaFin=(EditText) findViewById(R.id.editTextFechaFin);
        TxtCodigoTesis=(EditText) findViewById(R.id.editTextCodigoTesis);
        TxtCodigoCarrrera=(EditText) findViewById(R.id.editTextCodigoCarrera);
        TxtCodigoEstudiante=(EditText) findViewById(R.id.editTextCodigoEstudiante);
        BtnRegistrar=(Button) findViewById(R.id.buttonRegistrarTesis);
        TxtValidacion=(TextView) findViewById(R.id.textValidacion);

        BtnRegistrar.setOnClickListener(v -> {
            String titulo = TxtTitulo.getText().toString();
            String descripcion = TxtDescripcion.getText().toString();
            String fechaInicio = TxtFechaInicio.getText().toString();
            String fechaFin = TxtFechaFin.getText().toString();
            String codigoTesis = TxtCodigoTesis.getText().toString();
            String codigoCarrera = TxtCodigoCarrrera.getText().toString();
            String codigoEstudiante = TxtCodigoEstudiante.getText().toString();
            if (titulo.isEmpty() || titulo.equals("")) {
                TxtValidacion.setText("Ingresa un titulo de tesis");
            }else if (descripcion.isEmpty() || descripcion.equals("")) {
                TxtValidacion.setText("Ingresa una descripcion");
            }else if ( fechaInicio.isEmpty() || fechaInicio.equals("")) {
                TxtValidacion.setText("Ingresa una fecha de inicio");
            }else if ( fechaFin.isEmpty() || fechaFin.equals("")) {
                TxtValidacion.setText("Ingresa una fecha de fin");
            }else if ( codigoTesis.isEmpty() || codigoTesis.equals("")) {
                TxtValidacion.setText("Ingresa un codigo de tesis");
            }else if ( codigoCarrera.isEmpty() || codigoCarrera.equals("")) {
                TxtValidacion.setText("Ingresa un codigo de carrera");
            }else if ( codigoEstudiante.isEmpty() || codigoEstudiante.equals("")) {
                TxtValidacion.setText("Ingresa un codigo de estudiante");
            } else {
               //TODO: Registrar tesis
                Toast.makeText(RegistrarTesisActivity.this, "Tesis Registrada", Toast.LENGTH_SHORT).show();
                SystemClock.sleep(3000);
                Intent intent = new Intent(RegistrarTesisActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });


    }
}