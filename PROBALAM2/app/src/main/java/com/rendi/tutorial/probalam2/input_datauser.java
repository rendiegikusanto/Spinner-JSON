package com.rendi.tutorial.probalam2;

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

public class input_datauser extends AppCompatActivity {
    private Button btn_simpan;
    private EditText txt_username;
    private EditText txt_email;
    private EditText txt_hp;
    private  EditText txt_kelamin;
    private EditText txt_alamat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inputdata);

        txt_username = (EditText)findViewById(R.id.txt_username);
        txt_email = (EditText)findViewById(R.id.txt_email);
        txt_hp = (EditText)findViewById(R.id.txt_NoHp);
        txt_kelamin = (EditText)findViewById(R.id.txt_jeniskelamin);
        txt_alamat = (EditText)findViewById(R.id.txt_alamatlokasi);
        btn_simpan = (Button)findViewById(R.id.btn_simpaninput);

        btn_simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String nama_user = txt_username.getText().toString().trim();
                final String email = txt_email.getText().toString().trim();
                final String no_handphone = txt_hp.getText().toString().trim();
                final String jenis_kelamin = txt_kelamin.getText().toString().trim();
                final String alamat = txt_alamat.getText().toString().trim();
                // Pembuatan Class AsyncTask yang berfungsi untuk koneksi ke Database Server

                class TambahData extends AsyncTask<Void,Void,String> {

                    ProgressDialog loading;

                    @Override
                    protected void onPreExecute() {
                        super.onPreExecute();
                        loading = ProgressDialog.show(input_datauser.this,"Proses Kirim Data...","Wait...",false,false);
                        // meng link kan data
                        Intent in = new Intent(input_datauser.this,navigasi_tools.class);
                        startActivity(in);
                    }

                    @Override
                    protected void onPostExecute(String s) {
                        super.onPostExecute(s);
                        loading.dismiss();
                        Toast.makeText(input_datauser.this, s, Toast.LENGTH_LONG).show();
                    }

                    @Override
                    protected String doInBackground(Void... v) {
                        HashMap<String,String> params = new HashMap<>();
                        // Sesuaikan bagian ini dengan field di tabel Mahasiswa
                        params.put(config.KEY_EMP_Nama_user,nama_user);
                        params.put(config.KEY_EMP_email,email);
                        params.put(config.KEY_EMP_no_handpone,no_handphone);
                        params.put(config.KEY_EMP_jenis_kelamin,jenis_kelamin);
                        params.put(config.KEY_EMP_alamat,alamat);

                        RequestHandler rh = new RequestHandler();
                        String res = rh.sendPostRequest(config.URL_ADD, params);
                        return res;
                    }
                }
                // Jadikan Class TambahData Sabagai Object Baru
                TambahData ae = new TambahData();
                ae.execute();
            }
        });
    }

    //Adding an employee
    /*private void TambahData(){
        // Ubah setiap View EditText ke tipe Data String

    }*/
}