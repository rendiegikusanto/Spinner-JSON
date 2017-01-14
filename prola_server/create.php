<?php
include ('dbConnect.php');
if($_SERVER['REQUEST_METHOD']=='POST'){ 
//Getting values 
$name = $_POST['npm']; 
$desg = $_POST['nama']; 
$sal = $_POST['jurusan']; 
//Creating an sql query 
$sql = "INSERT INTO mahasiswa (npm,nama,jurusan) VALUES ('$name','$desg','$sal')"; 
//Panggil Koneksi 
require_once('dbConnect.php'); 
//Executing query ke database 
if(mysqli_query($con,$sql)){
 echo 'Sukses Tambah Data'; 
}else{ 
echo 'Gagal Tambah Data'; 
} 
//Closing the database 
mysqli_close($con); } ?>