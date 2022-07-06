<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>Associative Array</title>
    <style type="text/css">
        table,
        th,
        td {
            border: 1px solid black;
        }
    </style>
</head>

<body>
    <?php



    function associative()
    {
        $arr = array("a" => "1", "b" => "2", "c" => "3", "d" => "4");
        echo "<h2>Associative array inside function<br></h2>";
        foreach ($arr as $x => $y) {
            echo $x . " => " . $y . ", ";
        }
        echo "<br>";
        return $arr;
    }

    $arr1 = associative();
    echo "<h2>Associative array in main<br></h2>";
    echo "<table><tr><th>Key</th><th>Value</th></tr>";
    foreach ($arr1 as $x => $y) {
        echo "<tr><td>" . $x . "</td><td>" . $y . "</td></tr>";
    }

    ?>
</body>

</html>