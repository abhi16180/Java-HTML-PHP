<?php
 
$num=10;
 
function fact($num){
 
    if($num>1){
        return fact($num-1)*$num;
    }
    else{
        return 1;
    }
}
$f=fact($num);
echo "Factorial of $num is $f"
 
?>
