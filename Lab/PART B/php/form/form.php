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
    $h = "localhost";
    $u = "root";
    $p = "";
    $d = "sample";
    $conn = new mysqli($h, $u, $p, $d);
    if ($conn->connect_error) {
        echo "error";
    } else {

        if (isset($_POST["save"])) {
            $id = $_POST["id"];
            $qry = "select * from emp where id=" . $id;
            $res = $conn->query($qry);
            if ($res->num_rows > 0) {
                $row = $res->fetch_assoc();
                echo "<table><tr><th>Name</th><td>".$row["name"]."</td></tr> <tr><th>ID</th><td>".$row["id"]."</td></tr></table>";
            }
        }
    }


    ?>
</body>

</html>