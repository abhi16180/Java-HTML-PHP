<!DOCTYPE html>
<html>
 
<head>
    <title>Form 1</title>
    <style>
        table,
        th,
        td {
            border: 1px solid black;
        }
 
        th,
        td {
            padding: 10px;
        }
    </style>
</head>
 
<body>
    <?php
    $host = "localhost";
    $username = "root";
    $password = "";
    $dbname = "sample";
    $conn = new mysqli($host, $username, $password, $dbname);
    if ($conn->connect_error) {
        // die("connection failed" . $conn->connect_error);
        echo "error";
    } else {
        
        if (isset($_POST["save"])) {
            $id = $_POST["id"];
            $name = $_POST["name"];
 
            $sql = "INSERT INTO emp(id,name) values ('$id','$name')";
            if ($conn->query($sql)) {
                echo "<table><tr><th>Employee Number</th><td>" . $id . "</td></tr><tr><th>Employee Name</th><td>"
                    . $name .
                    "</td></tr></table>";
            } else {
                echo "Error" . $sql . "<br>" . $conn->error;
            }
            $conn->close();
        }
    }
    ?>
</body>
 
</html>
