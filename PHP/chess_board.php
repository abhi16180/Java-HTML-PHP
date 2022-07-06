<html>

<body>
    <table width="400px" border="5px">
        <?php

        for ($r = 1; $r <= 8; $r++) {

            echo "<tr>";
            for ($c = 1; $c <= 8; $c++) {
                if (($c + $r) % 2 == 0) {

                    echo "<td height=40px width=30px bgcolor=#ffffff></td>";
                } else {
                    echo "<td height=40px width=30px bgcolor=#000000></td>";
                }
            }

            echo "</tr>";
        }

        ?>

    </table>
</body>

</html>