<?php
//Ambil requested id 
$id = $_GET['id']; 
//Importing database 
require_once('dbConnect.php'); 
//buat sintak sql query Untuk mbil data berdasarkan ID 
$sql = "SELECT * FROM mahasiswa WHERE id=$id"; 
//result 
$r = mysqli_query($con,$sql); 
//pushing result kedalam array 
$result = array(); $row = mysqli_fetch_array($r); 
array_push($result,array( "id"=>$row['id'],
"npm"=>$row['npm'],
"nama"=>$row['nama'],
"jurusan"=>$row['jurusan']
));
  
//Tampilkan dalam format json
echo json_encode(array('result'=>$result));
mysqli_close($con);
?>