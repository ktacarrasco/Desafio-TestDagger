package com.desafios.testdagger.model;

import android.util.Log;

import javax.inject.Inject;

public class Clase {

    private static final String TAG = "probando";
    private String Texto;
    private Conceptos conceptos;
    private Conclusion conclusion;
    private Curso curso;


    @Inject
    public Clase(Conceptos conceptos, Conclusion conclusion, Curso curso) {
        this.conceptos = conceptos;
        this.conclusion = conclusion;
        this.curso = curso;
    }

    public void lineClase(){
        Log.d(TAG, "Estoy");
        conceptos.lineConcepto();
        conclusion.lineConclusion();
        curso.lineCurso();
    }

    public String lineaClase() {
        return "Con este curso de arquitectura de desafío latam" + conceptos.lineaConceptos() + conclusion.lineaConclusion()
                + curso.lineaCurso();
    }


}
