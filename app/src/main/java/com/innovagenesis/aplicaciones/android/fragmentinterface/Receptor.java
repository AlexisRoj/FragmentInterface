package com.innovagenesis.aplicaciones.android.fragmentinterface;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Receptor extends Fragment {

    TextView textView;

    public Receptor() {
        // Required empty public constructor
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        /* Se instancia el textView que va a recibir el mensaje*/
        this.textView = (TextView)view.findViewById(R.id.textReceptor);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_receptor, container, false);
    }

    public void recibirMensaje(String mensaje){

        /** Este metodo atraba el mensaje enviado por el Emisor, interface que pasa atravez
        * del mainActivity y se le asigna al textView del receptor*/

        this.textView.setText(mensaje);

    }

}
