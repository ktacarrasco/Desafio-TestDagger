package com.desafios.testdagger.model;

import android.util.Log;

import javax.inject.Inject;

public class Curso {

    private static final String TAG = "probando";

    @Inject
    public Curso() {

    }


    public void lineCurso(){
        Log.d(TAG, "mensajes");
    }

    public String lineaCurso() {
        return "   y estoy satisfechos con este comienzo" ;
    }
}
