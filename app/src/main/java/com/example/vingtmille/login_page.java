package com.example.vingtmille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login_page extends AppCompatActivity {
    Button btn_sign_in , sign_up_go ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        btn_sign_in = (Button)findViewById(R.id.signin_btn);
        sign_up_go = findViewById(R.id.sign_up_go);

        sign_up_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(login_page.this, sign_up_page.class);
                startActivity(intent1);
            }
        });

        btn_sign_in.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login_page.this, MainActivity.class);
                startActivity(intent);

            }

        });


    }

}