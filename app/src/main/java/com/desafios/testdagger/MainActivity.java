package com.desafios.testdagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.desafios.testdagger.model.Clase;
import com.desafios.testdagger.model.Conceptos;
import com.desafios.testdagger.model.Conclusion;
import com.desafios.testdagger.model.Curso;

public class MainActivity extends AppCompatActivity {
    private Clase clase;
    private TextView text;
    private Button btnClean;
    private Button btnMostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClean = findViewById(R.id.btnClean);
        btnMostrar = findViewById(R.id.btnEraser);
        text = findViewById(R.id.textFrase);
        IAppComponent component = DaggerIAppComponent.create();
        clase = component.getClase();
        clase.lineaClase();

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               show();

            }
        });
        btnClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               clear();
            }
        });
    }
    private void show() {
        text.setText(clase.lineaClase());
    }

    private void clear() {
        text.setText("");
    }
}
