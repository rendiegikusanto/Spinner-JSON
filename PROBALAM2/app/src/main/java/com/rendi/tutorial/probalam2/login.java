package com.rendi.tutorial.probalam2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.rendi.tutorial.probalam2.R.id.regis;

public class login extends AppCompatActivity {
    Button btn_masuk;
    EditText user_name;
    EditText pass;
    TextView view_regis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);


        btn_masuk =(Button)findViewById(R.id.btn_masuk);
        view_regis = (TextView)findViewById(R.id.regis);
        user_name = (EditText)findViewById(R.id.txt_namauser);
        pass = (EditText)findViewById(R.id.txt_password);

        btn_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = String.valueOf(user_name.getText());
                String Password = String.valueOf(pass.getText());

                if(username.equals("") || Password.equals("")){
                    Toast.makeText(login.this, "Data Belum Lengkap",Toast.LENGTH_LONG).show();
                } else {
                    if (username.equals("admin") && Password.equals("888")){
                        //Intent intent = new Intent(input_datauser.this, Menu.class);
                        //startActivity(intent);
                        Toast.makeText(login.this, "sukses data benar",Toast.LENGTH_LONG).show();
                        Intent klas_lain = new Intent(login.this,navigasi_tools.class);
                        startActivity(klas_lain);
                    }else {
                        Toast.makeText(login.this, "USER NAME ATAU PASSWORD SALAH",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });


        view_regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,daftar_login.class);
                startActivity(intent);
            }
        });

    }
            }