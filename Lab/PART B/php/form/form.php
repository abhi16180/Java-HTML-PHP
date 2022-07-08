<!DOCTYPE html>
<html lang="en">
 
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        table,
        th,
        td {
            border: 1px solid black;
        }
 
        th,
        td {
            padding: 15px;
        }
    </style>
 
</head>
 
<body>
    <?php
    if (isset($_POST["save"])) {
        $name = $_POST["name"];
        $age = $_POST["age"];
        $gender = $_POST["gender"];
 
        echo "<table>";
        echo "<tr> <th>Employee name</th><td>$name</td></tr>";
        echo "<tr> <th>Employee age</th><td>$age</td></tr>";
        echo "<tr> <th>Employee gender</th><td>$gender</td></tr>";
        echo "</table>";
    }
 
 
    ?>
</body>
 
</html>
