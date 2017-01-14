package com.rendi.tutorial.probalam2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class daftar_login extends AppCompatActivity {
    Button btn_masuk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_login);



        btn_masuk = (Button)findViewById(R.id.btn_daftar);


        btn_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(daftar_login.this,login.class);
                startActivity(intent);
            }
        });
    }
}
