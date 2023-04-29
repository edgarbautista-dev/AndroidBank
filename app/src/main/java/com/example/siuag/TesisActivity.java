package com.example.siuag;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class TesisActivity extends AppCompatActivity {
    private EditText LblNombreTesis;
    private EditText LblAutorTesis;
    private EditText LblcodigoTesis;
    private Button btnBuscarTesis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_tesis);
        LblNombreTesis=(EditText) findViewById(R.id.txtNombre);
        LblAutorTesis=(EditText) findViewById(R.id.txtAutor);
        LblcodigoTesis=(EditText) findViewById(R.id.txtCodigoTesis);
        btnBuscarTesis=(Button) findViewById(R.id.btnBuscar);
        btnBuscarTesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes agregar la lógica de autenticación
                String NombreTesis = LblNombreTesis.getText().toString();
                String AutorTesis = LblAutorTesis.getText().toString();
                String codigoTesis = LblcodigoTesis.getText().toString();
                if (isValidNombre(NombreTesis) || isValidAutor(AutorTesis) || isValidCodigoTesis(codigoTesis)) {
                    // Busqueda exitosa
                    Intent intent = new Intent(TesisActivity.this, ResultadoTesisActivity.class);
                    intent.putExtra("NombreTesis", NombreTesis);
                    intent.putExtra("AutorTesis", AutorTesis);
                    intent.putExtra("codigoTesis", codigoTesis);
                    startActivity(intent);
                } else {
                    // Busqueda fallida
                    Toast.makeText(TesisActivity.this, "Busca por alguna opcion", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private boolean isValidCodigoTesis(String codigoTesis) {
        if (codigoTesis.length() == 0 || codigoTesis.length() > 10) {
            return false;
        }
        return true;
    }

    private boolean isValidAutor(String autorTesis) {
        if (autorTesis.length() == 0 || autorTesis.length() > 10) {
            return false;
        }
        return true;
    }

    private boolean isValidNombre(String nombreTesis) {
        if (nombreTesis.length() == 0 || nombreTesis.length() > 10) {
            return false;
        }
        return true;
    }

}