package com.rendi.tutorial.login;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class Menu_Login extends AppCompatActivity {
    EditText nama_user;
    EditText pass;
    Button btn_masuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__login);
        nama_user = (EditText)findViewById(R.id.txt_namauser);
        pass = (EditText)findViewById(R.id.txt_password);
        btn_masuk = (Button)findViewById(R.id.btn_masuk);


        btn_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String User_name = nama_user.getText().toString().trim();
                final String pasword = pass.getText().toString().trim();

                class TambahData extends AsyncTask<Void,Void,String> {

                    ProgressDialog loading;

                    @Override
                    protected void onPreExecute() {
                        super.onPreExecute();
                        loading = ProgressDialog.show(Menu_Login.this,"Proses Kirim Data...","Wait...",false,false);
                        Intent in = new Intent(Menu_Login.this,menu_utama.class);
                        startActivity(in);
                    }

                    @Override
                    protected void onPostExecute(String s) {
                        super.onPostExecute(s);
                        loading.dismiss();
                        Toast.makeText(Menu_Login.this, s, Toast.LENGTH_LONG).show();
                    }

                    @Override
                    protected String doInBackground(Void... v) {
                        HashMap<String,String> params = new HashMap<>();
                        // Sesuaikan bagian ini dengan field di tabel Mahasiswa
                        params.put(config.KEY_EMP_Nama_user,User_name);
                        params.put(config.KEY_EMP_pasword1,pasword);



                        RequestHandler rh = new RequestHandler();
                        String res = rh.sendPostRequest(config.URL_ADD, params);
                        //     String res2 = rh.sendPostRequest(config.URL_ADD2, params);
                        return res;
                        //  return res2;
                        ///   RequestHandler rh2 = new RequestHandler();
                        //  String res2 =rh2.sendPostRequest(config.URL_ADD2,params);
                        //  return res2;



                    }

                }
                // Jadikan Class TambahData Sabagai Object Baru
                TambahData ae = new TambahData();
                ae.execute();
            }
        });
    }


}