package com.rendi.tutorial.probalam2;

/**
 * Created by user on 12/3/2016.
 */

public class config {
    // alamat URL tempat meletakan script PHP di pc server
    //link untuk insert data
    public static final String URL_ADD = "http://192.168.43.100/probal/create.php";
    public static final String URL_ADD2= "http://192.168.43.100/probal/inputlokasi.php";

    //FILED YANGA AKAN DI KIRIM KE DATABASE
    public static final String KEY_EMP_ID = "ID_user";
    public static final String KEY_EMP_Nama_user ="nama_user";
    public static final String KEY_EMP_email ="email";
    public static final String KEY_EMP_no_handpone ="no_handphone";
    public static final String KEY_EMP_jenis_kelamin ="jenis_kelamin";
    public static final String KEY_EMP_alamat ="alamat";
    public static final String KEY_EMP_ID_lokasi= "ID_lokasi";




    //Tags Format Json
  //  public static final String TAG_JSON_ARRAY = "result";
    public static final String TAG_ID = "ID_user";
    public static final String TAG_nama_user ="nama_user";
    public static final String TAG_email ="email";
    public static final String TAG_no_handphone ="no_handphone";
    public static final String TAG_jenis_kelamin ="jenis_kelamin";
    public static final String TAG_alamat ="alamat";




    // Filed yang digunakan untuk dikirimkan ke Database, sesuaikan saja dengan Field di Tabel Mahasiswa
   // public static final String KEY_EMP_ID = "id_lokasi";
    public static final String KEY_EMP_namalokasi = "nama_lokasi";
    public static final String KEY_EMP_alamat2 = "alamat";
    public static final String KEY_EMP_langtitude = "langtitude";
    public static final String KEY_EMP_longitude2 ="longitude";
    public static final String KEY_EMP_handphone ="no_handphone";
    public static final String KEY_EMP_tglinput ="tgl_input";
    public static final String KEY_EMP_diskripsi ="diskripsi";



    // Tags Format JSON
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_JSON_ID = "id_lokasi";
    public static final String TAG_JSON_nama_lokasi= "nama_lokasi";
    public static final String TAG_JSON_alamat2 ="alamat";
    public static final String TAG_JSON_langtitude = "langtitude";
    public static final String TAG_JSON_longitude2 = "longitude";
    public static final String TAG_JSON_handphone ="no_handphone";
    public static final String TAG_JSON_tglinput ="tgl_input";
    public static final String TAG_JSON_diskripsi ="diskripsi";
}
