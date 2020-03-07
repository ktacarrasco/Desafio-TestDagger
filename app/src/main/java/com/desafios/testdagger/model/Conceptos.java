package com.desafios.testdagger.model;

import android.util.Log;

import javax.inject.Inject;

public class Conceptos {

    private static final String TAG = "probando";

    @Inject
    public Conceptos() {

    }


    public void lineConcepto (){
        Log.d(TAG, "probando");

    }

    public String lineaConceptos() {
        return "  he aprendido nuevos conceptos en esta materia" ;
    }

}
