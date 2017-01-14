package com.rendi.tutorial.tambahlokasi;

/**
 * Created by user on 12/3/2016.
 */

public class config {
    // alamat URL tempat meletakan script PHP di pc server
    //link untuk insert data
   // public static final String URL_ADD = "http://192.168.43.100/probal/create.php";
    public static final String URL_inputlokasi = "http://192.168.43.100/probal/inputlokasi.php";

    //FILED YANGA AKAN DI KIRIM KE DATABASE
   // public static final String KEY_EMP_ID = "ID_user";
   // public static final String KEY_EMP_Nama_user ="nama_user";
   // public static final String KEY_EMP_email ="email";
  //  public static final String KEY_EMP_no_handpone ="no_handphone";
  //  public static final String KEY_EMP_jenis_kelamin ="jenis_kelamin";
 //   public static final String KEY_EMP_alamat ="alamat";


    //  filed pada data lokasi
    public static final String KEY_EMP_ID_lokasi= "ID_lokasi";
    public static final String KEY_EMP_Nama_lokasi ="nama_lokasi";
    public static final String KEY_EMP_TK_langitude ="langtitude";
    public static final String KEY_EMP_TK_longitude ="longitude";
    public static final String KEY_EMP_no_handphone ="no_hp";
    public static final String KEY_EMP_diskripsi ="diskripsi";
    public static final String KEY_EMP_tgl_penginputan ="tgl_input";
    public static final String KEY_EMP_foto ="foto";
    public static final String KEY_EMP_alamat2="alamat";


    //Tags Format Json





    public static final String TAG_JSON_ARRAY1 = "result";
    public static final String TAG_JSON_ID_lokasi= "i_lokasi";
    public static final String TAG_JSON_Nama_lokasi ="nama_lokasi";
    public static final String TAG_JASON_TK_langitude ="langtitude";
    public static final String TAG_JASON_TK_longitude ="longitude";
    public static final String TAG_JASON_up_foto ="no_handphone";
    public static final String TAG_JASON_no_handphone2 ="diskripsi";
    public static final String TAG_JASON_diskripsi ="tgl-input";
    public static final String  TAG_JASON_foto ="foto";
    public static final String TAG_JSON_alamat2 ="alamat";



}

