<?php
echo "Array types";
$eArray = array(1, 2, 3, 4, 54, 52);
$aArray = array(1 => 2, 2 => 3, 3 => 4);

foreach ($eArray as $ele) {
    echo "$ele <br>";
}


foreach ($aArray as $key => $val) {
    echo "$key = $val ,";
}
