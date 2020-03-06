package com.desafios.testdagger.model;

import android.util.Log;

import javax.inject.Inject;

public class Clase {

    private static final String TAG = "probando";
    private String Texto;
    private Concepto concepto;
    private Conclusion conclusion;
    private Curso curso;
    @Inject
    public Clase(String texto, Concepto concepto, Conclusion conclusion, Curso curso) {
        Texto = texto;
        this.concepto = concepto;
        this.conclusion = conclusion;
        this.curso = curso;
    }



    public void lineClase(){
        Log.d(TAG, "Estoy");
        concepto.lineConcepto();
        conclusion.lineConclusion();
        curso.lineCurso();
    }


}
