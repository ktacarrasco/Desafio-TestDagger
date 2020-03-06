package com.desafios.testdagger.model;

import android.util.Log;

import javax.inject.Inject;

public class Conclusion {

    private static final String TAG = "probando";
    private String Texto;

    @Inject
    public Conclusion(String texto) {
        Texto = texto;
    }

    public void lineConclusion(){
        Log.d(TAG, "los");

    }
}
