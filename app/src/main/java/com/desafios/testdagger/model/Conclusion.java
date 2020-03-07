package com.desafios.testdagger.model;

import android.util.Log;

import javax.inject.Inject;

public class Conclusion {

    private static final String TAG = "probando";

    @Inject
    public Conclusion() {

    }




    public void lineConclusion(){
        Log.d(TAG, "los");

    }
    public String lineaConclusion() {
        return "   y con este buen grupo, me siento motivado" ;
    }
}
