package com.desafios.testdagger.model;

import android.util.Log;

import javax.inject.Inject;

public class Concepto {

    private static final String TAG = "probando";
    private String Texto;
    @Inject
    public Concepto(String texto) {
        Texto = texto;
    }

    public void lineConcepto (){
        Log.d(TAG, "probando");

    }

}
