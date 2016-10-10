package com.innovagenesis.aplicaciones.android.fragmentinterface;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Emisor extends Fragment {

    public EnviarMensaje implementacion;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof EnviarMensaje){
            this.implementacion = (EnviarMensaje)context;
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final EditText editText =(EditText)view.findViewById(R.id.editEmisor);
        Button button = (Button)view.findViewById(R.id.btnEnivar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                implementacion.enviarMensaje(editText.getText().toString());
            }
        });
    }

    public Emisor() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_emisor, container, false);
    }

    public interface EnviarMensaje {

        void enviarMensaje (String mensaje);
    }

}
