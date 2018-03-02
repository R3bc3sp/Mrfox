package com.example.rebcesp.ejerciciointerfaces;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    ImageView logoImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        logoImagen = findViewById(R.id.logoAndroid);

        Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate_animation);
        logoImagen.startAnimation(rotate);

        //Iniciamos el splash

        final Intent i = new Intent(this,Login.class);

        //Creamos el hilo para el tiempo que queremos esperar

        Thread timer = new Thread(){

            public void run(){

                try{

                    sleep(5000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent i = new Intent(Splash.this,Login.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();




    }
}
