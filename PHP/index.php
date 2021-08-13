<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("account.php");

$uberX = new UberX("ASD-132", new Account("Carlos", "38.231.454"), "Chevrolet", "Spark");
$uberX->toPrint();

$uberPool = new UberPool("TGJ-431", new Account("Andrea", "26.547.423"), "Dodge", "Attitude");
$uberPool->toPrint();
?>