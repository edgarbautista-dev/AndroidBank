package com.example.siuag;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DashboardActivity extends AppCompatActivity {

    private TextView usernameTextView;
    private TextView correoTextView;
    private ListView listView;

    Map<String,Class<?>> menuItems = new HashMap<>(){{
        put("Registrar tesis", RegistrarTesisActivity.class);
        put("Ver tesis", VerTesisActivity.class);
        put("ayuda", AyudaActivity.class);
    }};
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Bundle bundle = getIntent().getExtras();
        // Enlazar elementos de interfaz de usuario con variables Java
        usernameTextView = findViewById(R.id.user_name);
        correoTextView = findViewById(R.id.user_email);

        String username = bundle.getString("username");
        usernameTextView.setText("Bienvenido, "+bundle.getString("username"));
        correoTextView.setText(username.concat("@edu.uag.mx"));
        //OBTENER LA LISTA DE OPCIONES
        String[] opciones = menuItems.keySet().toArray(new String[0]);


        // Configurar el ListView
        listView = findViewById(R.id.listView);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, opciones);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            String opcion = opciones[position];
            Class<?> clase = menuItems.get(opcion);
            Intent intent = new Intent(this, clase);
            startActivity(intent);
        });
    }
}