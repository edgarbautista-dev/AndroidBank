package com.example.siuag;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DashboardActivity extends AppCompatActivity {

    private TextView usernameTextView;
    private TextView correoTextView;
    private ListView listView;
    private String[] menuItems = {"Registrar tesis", "Ver tesis", "ayuda"};
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


        // Configurar el ListView
        listView = findViewById(R.id.listView);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, menuItems);
        listView.setAdapter(adapter);
    }
}