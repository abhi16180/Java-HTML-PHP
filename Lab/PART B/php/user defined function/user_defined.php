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

    function associative()
    {
        $arr = array("1" => "Hello", "2" => "Matrix", "3" => "Welcome");
        return $arr;
    }

    $associativeArray = associative();
    echo "<table border=2px width=400px><tr><th>Key</th><th>Value</th></tr>";
    
    foreach ($associativeArray as $key => $value) {
        echo "<tr><td>" . $key . "</td><td>" . $value . "</td></tr>";
    }
    echo "</table>";
    ?>
</body>

</html>