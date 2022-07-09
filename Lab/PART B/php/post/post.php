<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <?php 
    if(isset($_POST["save"])){
        $name=$_POST["name"];
        $salary=$_POST["salary"];
        $dept=$_POST["dept"];
        echo "<table border=2px><tr><th>Name</th><td>" .$name.  "</td></tr>";
        echo "<tr><th>Salary</th><td>".$salary."</td></tr>";
        echo "<tr><th>Department</th><td>".$dept."</td></tr></table>";

    }
    ?>
</body>
</html>