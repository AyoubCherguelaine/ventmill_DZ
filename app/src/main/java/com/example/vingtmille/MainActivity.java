package com.example.vingtmille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button show_map , button_place;
    Random random;
    EditText editText_city, editText_street;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rn = new Random();
        int answer = rn.nextInt(10) + 1;



        show_map = (Button) findViewById(R.id.show_map_btn);
        editText_city = findViewById(R.id.edit_text_city);
        editText_street = findViewById(R.id.edit_text_street);
        String str_city = editText_city.getText().toString();
        String str_street = editText_street.getText().toString();

        show_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(this, view_map_places.class);
                intent.putExtra("edittext", str_city);
                intent.putExtra("edittext", str_street);
                startActivity(intent);
            }
        });



    }

}