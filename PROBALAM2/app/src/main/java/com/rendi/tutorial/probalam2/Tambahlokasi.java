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

public class Tambahlokasi extends AppCompatActivity {

    private EditText namalokasi2;
    private EditText alamat2;
    private EditText langtitude2;
    private EditText longitude2;
    private EditText handphone2;
    private EditText tglinput2;
    private EditText diskripsi2;

    private Button simpan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lokasi);
        namalokasi2 = (EditText) findViewById(R.id.txt_namalokasi);
        alamat2 = (EditText) findViewById(R.id.txt_alamat);
        longitude2 = (EditText) findViewById(R.id.txt_lang);
        langtitude2 = (EditText) findViewById(R.id.txt_long);
        handphone2 =(EditText) findViewById(R.id.txt_hplokasi);
        tglinput2 =(EditText)findViewById(R.id.txt_input);
        diskripsi2 =(EditText)findViewById(R.id.txt_dis);
        simpan =(Button)findViewById(R.id.btn_simpan);


        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String nama_lokasi = namalokasi2.getText().toString().trim();
                final String alamat = alamat2.getText().toString().trim();
                final String langtitude = langtitude2.getText().toString().trim();
                final String longitude = longitude2.getText().toString().trim();
                final String handphone = handphone2.getText().toString().trim();
                final String tgl_input = tglinput2.getText().toString().trim();
                final String diskripsi = diskripsi2.getText().toString().trim();
                // Pembuatan Class AsyncTask yang berfungsi untuk koneksi ke Database Server

                class TambahData extends AsyncTask<Void,Void,String> {

                    ProgressDialog loading;

                    @Override
                    protected void onPreExecute() {
                        super.onPreExecute();
                        loading = ProgressDialog.show(Tambahlokasi.this,"Proses Kirim Data...","Wait...",false,false);
                        Intent in = new Intent(Tambahlokasi.this,navigasi_tools.class);
                        startActivity(in);
                    }

                    @Override
                    protected void onPostExecute(String s) {
                        super.onPostExecute(s);
                        loading.dismiss();
                        Toast.makeText(Tambahlokasi.this, s, Toast.LENGTH_LONG).show();
                    }

                    @Override
                    protected String doInBackground(Void... v) {
                        HashMap<String,String> params = new HashMap<>();
                        // Sesuaikan bagian ini dengan field di tabel Mahasiswa
                        params.put(config.KEY_EMP_namalokasi,nama_lokasi);
                        params.put(config.KEY_EMP_alamat2,alamat);
                        params.put(config.KEY_EMP_langtitude,langtitude);
                        params.put(config.KEY_EMP_longitude2,longitude);
                        params.put(config.KEY_EMP_handphone,handphone);
                        params.put(config.KEY_EMP_tglinput,tgl_input);
                        params.put(config.KEY_EMP_diskripsi,diskripsi);

                        RequestHandler rh = new RequestHandler();
                        String res = rh.sendPostRequest(config.URL_ADD2, params);
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

    //Adding an employee
    /*private void TambahData(){
        // Ubah setiap View EditText ke tipe Data String

    }*/
}