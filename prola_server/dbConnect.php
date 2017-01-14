<?php

define('HOST','localhost'); 
define('USER','root'); 
define('PASS',''); 
define('DB','db_prola'); 

$con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to Connect'); 

if($con){
    echo "Database Connected";
}else{
    echo "Database Not Connected..!!!";
}

?>