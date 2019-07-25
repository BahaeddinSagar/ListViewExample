package com.example.basiclistview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    TextView nameTextView;
    ArrayList<String> numbersArray;
    ListView numbersListView;
    ArrayAdapter<String> numbersArrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        nameTextView = findViewById(R.id.nameTextView);
        nameTextView.setText("Welcome " + name);

        numbersListView = findViewById(R.id.listview1);

        numbersArray = new ArrayList<>();
        numbersArray.add("one");
        numbersArray.add("two");
        numbersArray.add("three");
        numbersArray.add("four");
        numbersArray.add("five");
        numbersArray.add("six");
        numbersArray.add("seven");
        numbersArray.add("eight");
        numbersArray.add("nine");
        numbersArray.add("ten");
        numbersArray.add("ten");
        numbersArray.add("ten");
        numbersArray.add("ten");
        numbersArray.add("ten");
        numbersArray.add("ten");
        numbersArray.add("ten");
        numbersArray.add("ten");
        numbersArray.add("ten");
        numbersArray.add("ten");
        numbersArray.add("ten");
        numbersArray.add("ten");
        numbersArray.add("ten");
        numbersArray.add("ten");
        numbersArray.add("ten");
        numbersArray.add("ten");
        numbersArray.add("ten");

        numbersArrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1
                , numbersArray);

        numbersListView.setAdapter(numbersArrayAdapter);

        numbersListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main2Activity.this,
                        "You Pressed "+ String.valueOf(position + 1) ,
                        Toast.LENGTH_SHORT).show();

            }
        });




    }
}
