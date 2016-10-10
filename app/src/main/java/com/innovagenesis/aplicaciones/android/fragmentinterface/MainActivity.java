package com.innovagenesis.aplicaciones.android.fragmentinterface;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Emisor.EnviarMensaje {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void enviarMensaje(String mensaje) {

        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragmentReceptor);

        if (fragment instanceof Receptor){

            Receptor receptor = (Receptor)fragment;
            receptor.recibirMensaje(mensaje);
        }
    }
}
