package com.example.siuag;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TextView LblMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LblMensaje=(TextView) findViewById(R.id.lblMensaje);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}