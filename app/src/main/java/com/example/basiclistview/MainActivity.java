package com.example.basiclistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Goto2ndActivity(View view) {
        EditText editText = findViewById(R.id.edittextname);
        String name = editText.getText().toString();
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("name", name);

        if (name.length() != 0) {

            startActivity(intent);
        } else {
            Toast.makeText(this, "Please Enter username", Toast.LENGTH_SHORT).show();
        }


    }
}
