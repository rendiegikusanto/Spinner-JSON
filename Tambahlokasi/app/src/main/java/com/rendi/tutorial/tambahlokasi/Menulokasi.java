package com.rendi.tutorial.tambahlokasi;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class Menulokasi extends AppCompatActivity {

    private Button btn_simpanlokasi;
    private EditText namalokasi;
    private EditText alamatlokasi;
    private EditText hplokasi;
    private  EditText deskripsi;
    private EditText longit;
    private EditText langt;
    private EditText tglupdate;
    private EditText upfoto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulokasi);

        // imageView = (ImageView)findViewById(R.id.imageView_lokasi);
        //   memanggil variabel pada kelas activity maining





        namalokasi = (EditText)findViewById(R.id.txt_namalokasi);
        langt = (EditText)findViewById(R.id.txt_lang);
        longit= (EditText)findViewById(R.id.txt_long);
        hplokasi= (EditText)findViewById(R.id.txt_hplokasi);
        deskripsi = (EditText)findViewById(R.id.txt_diskripsi);
        tglupdate =(EditText) findViewById(R.id.txt_tglinput);
        upfoto =(EditText)findViewById(R.id.txt_upfoto);
        alamatlokasi = (EditText)findViewById(R.id.txt_alamatlokasi);

        btn_simpanlokasi = (Button)findViewById(R.id.btn_simpanlokasi);

        btn_simpanlokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               final  String nama_lokasi = namalokasi.getText().toString().trim();

                final String langtitude = langt.getText().toString().trim();
                final String longitude = longit.getText().toString().trim();
                final String no_hp= hplokasi.getText().toString().trim();
                final String diskripsi = deskripsi.getText().toString().trim();
                final String tgl_input =tglupdate.getText().toString().trim();
                final String foto = upfoto.getText().toString().trim();
                final String alamat = alamatlokasi.getText().toString().trim();

                // Pembuatan Class AsyncTask yang berfungsi untuk koneksi ke Database Server

                class TambahData extends AsyncTask<Void,Void,String> {

                    ProgressDialog loading;

                    @Override
                    protected void onPreExecute() {
                        super.onPreExecute();
                        loading = ProgressDialog.show(Menulokasi.this,"Proses Kirim Data...","Wait...",false,false);
                    }

                    @Override
                    protected void onPostExecute(String s) {
                        super.onPostExecute(s);
                        loading.dismiss();
                        Toast.makeText(Menulokasi.this, s, Toast.LENGTH_LONG).show();
                    }

                    @Override
                    protected String doInBackground(Void... v) {
                        HashMap<String,String> params = new HashMap<>();
                        // Sesuaikan bagian ini dengan field di tabel lokasi
                        params.put(config.KEY_EMP_ID_lokasi,nama_lokasi);
                        params.put(config.KEY_EMP_TK_langitude,langtitude);
                        params.put(config.KEY_EMP_TK_longitude,longitude);
                        params.put(config.KEY_EMP_no_handphone,no_hp);
                        params.put(config.KEY_EMP_diskripsi,diskripsi);
                        params.put(config.KEY_EMP_tgl_penginputan,tgl_input);
                        params.put(config.KEY_EMP_foto,foto);
                        params.put(config.KEY_EMP_alamat2,alamat);

                        RequestHandler rh = new RequestHandler();
                        String res = rh.sendPostRequest(config.URL_inputlokasi, params);
                        return res;
                    }
                }
                // Jadikan Class TambahData Sabagai Object Baru
                TambahData ae = new TambahData();
                ae.execute();
            }
        });
    }


}