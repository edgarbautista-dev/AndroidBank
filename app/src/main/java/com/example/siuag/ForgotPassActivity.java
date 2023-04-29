package com.example.siuag;

import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ForgotPassActivity extends AppCompatActivity {

    private EditText Username;
    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass);

        Username = findViewById(R.id.editTextUsername);
        sendButton = findViewById(R.id.buttonRestablecerContraseña);

        sendButton.setOnClickListener(new View.OnClickListener() {    public void onClick(View v) {
            // Aquí puedes agregar la lógica de autenticación
            String username = Username.getText().toString();
            if (isValidPassword(username)) {
                // Autenticación exitosa
                Toast.makeText(ForgotPassActivity.this, "Se envio el correo de restablecimiento", Toast.LENGTH_SHORT).show();
                SystemClock.sleep(3000);
                Intent intent = new Intent(ForgotPassActivity.this, LoginActivity.class);
                startActivity(intent);
            } else {
                // Autenticación fallida
                Toast.makeText(ForgotPassActivity.this, "Ingresa un nombre de usuario", Toast.LENGTH_SHORT).show();

            }

                // enviar el correo electrónico al usuario con el enlace para restablecer la contraseña
                // aqui debes colocar tu codigo para enviar un correo con un link al usuario
            }
        });
    }
    private boolean isValidPassword(String username) {
        // Aquí puedes agregar tus propios criterios de validación para la contraseña
        return username.length() > 4;
    }

}