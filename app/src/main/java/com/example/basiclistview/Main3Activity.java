package com.example.basiclistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ListView movieListView = findViewById(R.id.MovieList);

        final ArrayList<Movie> movieArrayList = new ArrayList<>();

        movieArrayList.add(new Movie("Avengers",
                "AvengersAvengersAvengersAvengersAvengers",
                "2012"));
        movieArrayList.add(new Movie("Saw" , "SawSawSawSawSawSawSawSawSawSawSaw",
                "2010"));
        movieArrayList.add(new Movie("300",
                "30000000000000000000", "700BC"));
        movieArrayList.add(new Movie("harry potter",
                "harry potter goes to bla bla bla and learns bla bla ",
                "2003"));

        movieArrayList.add(new Movie("harry potter",
                "harry potter goes to bla bla bla and learns bla bla ",
                "2003"));

        movieArrayList.add(new Movie("harry potter",
                "harry potter goes to bla bla bla and learns bla bla ",
                "2003"));

        movieArrayList.add(new Movie("harry potter",
                "harry potter goes to bla bla bla and learns bla bla ",
                "2003"));

        movieArrayList.add(new Movie("harry potter",
                "harry potter goes to bla bla bla and learns bla bla ",
                "2003"));

        movieArrayList.add(new Movie("harry potter",
                "harry potter goes to bla bla bla and learns bla bla ",
                "2003"));

        movieArrayList.add(new Movie("harry potter",
                "harry potter goes to bla bla bla and learns bla bla ",
                "2003"));

        movieArrayList.add(new Movie("harry potter",
                "harry potter goes to bla bla bla and learns bla bla ",
                "2003"));

        movieArrayList.add(new Movie("harry potter",
                "harry potter goes to bla bla bla and learns bla bla ",
                "2003"));

        movieArrayList.add(new Movie("harry potter",
                "harry potter goes to bla bla bla and learns bla bla ",
                "2003"));

        movieArrayList.add(new Movie("harry potter",
                "harry potter goes to bla bla bla and learns bla bla ",
                "2003"));

        movieArrayList.add(new Movie("harry potter",
                "harry potter goes to bla bla bla and learns bla bla ",
                "2003"));

        movieArrayList.add(new Movie("harry potter",
                "harry potter goes to bla bla bla and learns bla bla ",
                "2003"));

        movieArrayList.add(new Movie("harry potter",
                "harry potter goes to bla bla bla and learns bla bla ",
                "2003"));

        movieArrayList.add(new Movie("harry potter",
                "harry potter goes to bla bla bla and learns bla bla ",
                "2003"));

        movieArrayList.add(new Movie("harry potter",
                "harry potter goes to bla bla bla and learns bla bla ",
                "2003"));

        movieArrayList.add(new Movie("harry potter",
                "harry potter goes to bla bla bla and learns bla bla ",
                "2003"));

        movieArrayList.add(new Movie("harry potter",
                "harry potter goes to bla bla bla and learns bla bla ",
                "2003"));

        movieArrayList.add(new Movie("harry potter",
                "harry potter goes to bla bla bla and learns bla bla ",
                "2003"));



        ArrayAdapter<Movie> movieArrayAdapter = new MovieArrayAdapter(this,R.layout.list_item,movieArrayList);

        movieListView.setAdapter(movieArrayAdapter);

        movieListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main3Activity.this,
                        movieArrayList.get(position).title,
                        Toast.LENGTH_SHORT).show();


            }
        });



    }
}
