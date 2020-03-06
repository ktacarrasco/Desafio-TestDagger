package com.desafios.testdagger.model;

import android.util.Log;

import javax.inject.Inject;

public class Curso {

    private static final String TAG = "probando";
    private String Texto;
    @Inject
    public Curso(String texto) {
        Texto = texto;
    }

    public void lineCurso(){
        Log.d(TAG, "mensajes");
    }
}
