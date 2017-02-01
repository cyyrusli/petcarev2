<?php
 
 if($_SERVER['REQUEST_METHOD']=='POST'){
 
 $image = $_POST['image'];
 $description = $_POST['description'];
 $contact = $_POST['contact'];
 $name = $_POST['name'];
 
 require_once('dbConnect.php');
 
 $sql ="SELECT id FROM photos ORDER BY id ASC";
 
 $res = mysqli_query($con,$sql);
 
 $id = 0;
 
 while($row = mysqli_fetch_array($res)){
 $id = $row['id'];
 }
 
 $id = $id + 1;

 $path = "uploads/$id.png";
 
 $actualpath = "http://ec2-52-221-243-249.ap-southeast-1.compute.amazonaws.com/PhotoUpload/$path";
 
 $sql = "INSERT INTO photos (image,name,contact,description) VALUES ('$actualpath', '$name','$contact', '$description')";
 
 if(mysqli_query($con,$sql)){
 file_put_contents($path,base64_decode($image));
 echo "Successfully Uploaded";
 }
 
 mysqli_close($con);
 }else{
 echo "Error";
 }
 