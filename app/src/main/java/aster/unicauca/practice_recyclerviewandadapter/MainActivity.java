package aster.unicauca.practice_recyclerviewandadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Usuario> listaUsuarios;
    RecyclerView recyclerUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaUsuarios = new ArrayList<>();
        recyclerUsuarios = findViewById(R.id.idRecyclerView);
        recyclerUsuarios.setLayoutManager(new LinearLayoutManager(this));
        llenarUsuarios();

        AdaptadorUsuarios adapter = new AdaptadorUsuarios(listaUsuarios);
        recyclerUsuarios.setAdapter(adapter);
    }

    private void llenarUsuarios(){
        listaUsuarios.add(new Usuario("Carlos", "Estudiante de ingenieria",R.drawable.log1));
        listaUsuarios.add(new Usuario("Laura", "Estudiante de ingenieria",R.drawable.log2));
        listaUsuarios.add(new Usuario("Julian", "Estudiante de ingenieria",R.drawable.log3));
        listaUsuarios.add(new Usuario("Luisa", "Estudiante de ingenieria",R.drawable.log4));
        listaUsuarios.add(new Usuario("Jose", "Estudiante de ingenieria",R.drawable.log5));
        listaUsuarios.add(new Usuario("Maria", "Estudiante de ingenieria",R.drawable.log6));
        listaUsuarios.add(new Usuario("Pablo", "Estudiante de ingenieria",R.drawable.log7));
        listaUsuarios.add(new Usuario("Vanesa", "Estudiante de ingenieria",R.drawable.log8));
        listaUsuarios.add(new Usuario("Raul", "Estudiante de ingenieria",R.drawable.log9));
        listaUsuarios.add(new Usuario("Monica", "Estudiante de ingenieria",R.drawable.log10));


    }
}