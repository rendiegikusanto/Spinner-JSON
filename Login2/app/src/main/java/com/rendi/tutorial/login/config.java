package com.rendi.tutorial.login;

/**
 * Created by user on 12/21/2016.
 */

public class config {
    // alamat URL tempat meletakan script PHP di pc server
    //link untuk insert data
    public static final String URL_ADD = "http://192.168.43.100/probal/create.php";
   // public static final String URL_ADD2= "http://192.168.43.100/probal/inputlokasi.php";

    //FILED YANGA AKAN DI KIRIM KE DATABASE
    // Data masukan password

    public static final String KEY_EMP_ID = "ID_user";
    public static final String KEY_EMP_Nama_user ="User_name";
    public static final String KEY_EMP_pasword1 ="pasword";


      // Data Registrasi

    public static final String KEY_EMP_ID2 = "ID_user2";
    public static final String KEY_EMP_Nama_user2 ="nama_user2";
    public static final String KEY_EMP_pass2 ="pass2";
    public static final String KEY_EMP_confrim_pass2 ="confrim_pasword2";




    // Tags Format JSON
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_JSON_ID = "ID_user";
    public static final String TAG_JSON_nama_user= "nama_user";
    public static final String TAG_JSON_pasword = "pasword";


    //regis
    public static final String TAG_JSON_ID2 = "ID_user2";
    public static final String TAG_JSON_nama_user2= "nama_user2";
    public static final String TAG_JSON_pasword2 = "pass2";
    public static final String TAG_JSON_confrim_pass2 = "confrim_pasword2";



}
