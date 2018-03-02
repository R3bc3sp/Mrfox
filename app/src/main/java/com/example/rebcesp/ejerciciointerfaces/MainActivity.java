package com.example.rebcesp.ejerciciointerfaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView txtEmail, txtPassword;
    Toolbar myToolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        txtEmail=findViewById(R.id.txtEmail);
//        txtPassword=findViewById(R.id.txtPassword);
//
//        Intent i = getIntent();
//        Bundle extras = i.getExtras();
//
//        if (extras != null){ //Veremos si contiene datos
//
//            String datoEmail = (String)extras.get("email");
//            String datoPassword = (String)extras.get("password");
//
//            txtEmail.setText(datoEmail);
//            txtPassword.setText(datoPassword);
//
//        }else{
//
//            Toast.makeText(this, "Ingresar datos", Toast.LENGTH_SHORT).show();
//        }
        Toolbar toolbar = findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}
