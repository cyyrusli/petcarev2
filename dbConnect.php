<?php
 define('HOST','ec2-52-221-243-249.ap-southeast-1.compute.amazonaws.com');
 define('USER','root');
 define('PASS','qwerty0312');
 define('DB','webapi');
 
 $con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to Connect');