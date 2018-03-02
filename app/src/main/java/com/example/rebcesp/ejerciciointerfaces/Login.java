package com.example.rebcesp.ejerciciointerfaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText edEmail, edPassword;
    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Instanciamos los views

        edEmail = findViewById(R.id.edEmail);
        edPassword = findViewById(R.id.edPassword);
        btnIngresar = findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarDatos();

            }
        });


    }

    //Enviamos los datos de nuestra maldita contraseña ;)
    private void enviarDatos() {

        Intent i = new Intent(this, MainActivity.class);

//        String correo = edEmail.getText().toString();
//        String password = edPassword.getText().toString();
//        if (correo.equals("") || password.equals("")) {
//            Toast.makeText(this, "Ingrese datos porfavor", Toast.LENGTH_SHORT).show();
//        } else {
//            i.putExtra("email", correo);
//            i.putExtra("password", password);

            startActivity(i);


        }
    }

