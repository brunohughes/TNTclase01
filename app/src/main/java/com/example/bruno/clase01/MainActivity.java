package com.example.bruno.clase01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void agregarNota(View view) {
        TextView nuevaNota = findViewById(R.id.mi_nota);
        TextView tareas = findViewById(R.id.tareas);

        tareas.append(nuevaNota.getText() + "\n");
    }
}
